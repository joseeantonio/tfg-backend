package es.iesrafaelalberti.tfgpring.controllers;

import es.iesrafaelalberti.tfgpring.dto.ProductoPedidoCreateDTO;
import es.iesrafaelalberti.tfgpring.dto.ProductoPedidoDTO;
import es.iesrafaelalberti.tfgpring.models.ProductoPedido;
import es.iesrafaelalberti.tfgpring.repositories.PedidoRepository;
import es.iesrafaelalberti.tfgpring.repositories.ProductoPedidoRepository;
import es.iesrafaelalberti.tfgpring.repositories.ProductoRepository;
import es.iesrafaelalberti.tfgpring.services.ProductoPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.stream.StreamSupport;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ProductoPedidoController {

    @Autowired
    ProductoPedidoRepository productoPedidoRepository;

    @Autowired
    ProductoPedidoService productoPedidoService;
    @Autowired
    PedidoRepository pedidoRepository;
    @Autowired
    ProductoRepository productoRepository;

    //    Vemos todos los productosPedidos
    @GetMapping("/productosPedidos")
    public ResponseEntity<Object> index() {
        return new ResponseEntity<>(
                StreamSupport.stream(productoPedidoRepository.findAll().spliterator(), false)
                        .map(ProductoPedidoDTO::new),
                HttpStatus.OK
        );
    }

    //    Vemos el ProductoPedido con ese id que pongamos en la ruta
    @GetMapping("/productosPedidos/{id}")
    public ResponseEntity<Object> show(@PathVariable("id") Long id) {
        return new ResponseEntity<>(productoPedidoRepository.findById(id), HttpStatus.OK);
    }

    //    Creamos un productoPedido con la informacion del body
    @PostMapping("/productosPedidos/create")
    public ResponseEntity<Object> create(@RequestBody ProductoPedidoCreateDTO productoPedidoCreateDTO) {

        return new ResponseEntity<>(
                new ProductoPedidoDTO (productoPedidoService.productoPedidoCreate(productoPedidoCreateDTO)),
                HttpStatus.OK
        );
    }

    //    Eliminamos un productoPedido con el id que pongamos en la ruta
    @DeleteMapping("/productosPedidos/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") Long id) {
        Optional<ProductoPedido> productoPedido = productoPedidoRepository.findById(id);
        productoPedido.ifPresent(value -> productoPedidoRepository.delete(value));
        return new ResponseEntity<>(productoPedido.isPresent(), HttpStatus.OK);
    }

    //    Actualizamos un productoPedido , cogiendo datos del body y con el id que ponemos en la ruta
    @PutMapping("/productoVenta/{id}/")
    public ResponseEntity<Object> update(@PathVariable("id") Long id, @RequestBody ProductoPedido productoPedido) {
        Optional<ProductoPedido> antiguoProductoPedido = productoPedidoRepository.findById(id);
        if(antiguoProductoPedido.isPresent()) {
            productoPedido.setId(id);
            productoPedidoRepository.save(productoPedido);
            return new ResponseEntity<>(productoPedido, HttpStatus.OK);
        }
        return new ResponseEntity<>(false, HttpStatus.NOT_FOUND);
    }

}
