package es.iesrafaelalberti.tfgpring.controllers;

import es.iesrafaelalberti.tfgpring.models.Producto;
import es.iesrafaelalberti.tfgpring.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ProductoController {

    @Autowired
    ProductoRepository productoRepository;

//    Vemos todos los productos
    @GetMapping("/productos")
    public ResponseEntity<Object> index() {
        return new ResponseEntity<>(productoRepository.findAll(), HttpStatus.OK);
    }

//    Vemos el producto con ese id que pongamos en la ruta
    @GetMapping("/productos/{id}")
    public ResponseEntity<Object> show(@PathVariable("id") Long id) {
        return new ResponseEntity<>(productoRepository.findById(id), HttpStatus.OK);
    }

//    Creamos un producto con la informacion del body
    @PostMapping("/productos/create")
    public ResponseEntity<Object> create(@RequestBody Producto producto) {
        productoRepository.save(producto);
        return new ResponseEntity<>(producto, HttpStatus.OK);
    }

//    Eliminamos un producto con el id que pongamos en la ruta
    @DeleteMapping("/productos/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") Long id) {
        Optional<Producto> producto = productoRepository.findById(id);
        producto.ifPresent(value -> productoRepository.delete(value));
        return new ResponseEntity<>(producto.isPresent(), HttpStatus.OK);
    }

//    Actualizamos un producto , cogiendo datos del body y con el id que ponemos en la ruta
    @PutMapping("/productos/{id}")
    public ResponseEntity<Object> update(@PathVariable("id") Long id, @RequestBody Producto producto) {
        Optional<Producto> antiguoProducto = productoRepository.findById(id);
        if(antiguoProducto.isPresent()) {
            producto.setId(id);
            productoRepository.save(producto);
            return new ResponseEntity<>(producto, HttpStatus.OK);
        }
        return new ResponseEntity<>(false, HttpStatus.NOT_FOUND);
    }

    @GetMapping("/productos/tipo/{tipo}")
    public ResponseEntity<Object> getByTipo(@PathVariable("tipo") String tipo) {
        List<Producto> productos = productoRepository.findByTipo(tipo);
        if (productos.isEmpty()) {
            return new ResponseEntity<>("No se encontraron productos con el tipo especificado", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(productos, HttpStatus.OK);
    }

    @GetMapping("/productos/tipo/{tipo}/orden/{orden}")
    public ResponseEntity<Object> index(@PathVariable("tipo") String tipo, @PathVariable("orden") String orden) {
        List<Producto> productos;

        if (orden.equalsIgnoreCase("asc")) {
            productos = productoRepository.findByTipoOrderByPrecioAsc(tipo);
        } else if (orden.equalsIgnoreCase("desc")) {
            productos = productoRepository.findByTipoOrderByPrecioDesc(tipo);
        } else {
            // Si no se proporciona un valor válido para 'orden', se devuelve un error
            return new ResponseEntity<>("El parámetro 'orden' debe ser 'asc' o 'desc'.", HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(productos, HttpStatus.OK);
    }

    @GetMapping("/productos/orden/{orden}")
    public ResponseEntity<Object> index(@PathVariable("orden") String orden) {
        List<Producto> productos;

        if (orden.equalsIgnoreCase("asc")) {
            productos = productoRepository.findAllByOrderByPrecioAsc();
        } else if (orden.equalsIgnoreCase("desc")) {
            productos = productoRepository.findAllByOrderByPrecioDesc();
        } else {
            // Si no se proporciona un valor válido para 'orden', se devuelve un error
            return new ResponseEntity<>("El parámetro 'orden' debe ser 'asc' o 'desc'.", HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(productos, HttpStatus.OK);
    }

}
