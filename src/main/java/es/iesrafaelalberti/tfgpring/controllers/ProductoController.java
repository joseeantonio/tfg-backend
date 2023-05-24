package es.iesrafaelalberti.tfgpring.controllers;

import es.iesrafaelalberti.tfgpring.models.Producto;
import es.iesrafaelalberti.tfgpring.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

}
