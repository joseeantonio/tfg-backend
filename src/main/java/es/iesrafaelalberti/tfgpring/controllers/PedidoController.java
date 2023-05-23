package es.iesrafaelalberti.tfgpring.controllers;

import es.iesrafaelalberti.tfgpring.models.Pedido;
import es.iesrafaelalberti.tfgpring.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
public class PedidoController {

    @Autowired
    PedidoRepository pedidoRepository;

//    Vemos todos los pedidos
    @GetMapping("/pedidos")
    public ResponseEntity<Object> index() {
        return new ResponseEntity<>(pedidoRepository.findAll(), HttpStatus.OK);
    }

//    Vemos el pedido con ese id que pongamos en la ruta
    @GetMapping("/pedidos/{id}")
    public ResponseEntity<Object> show(@PathVariable("id") Long id) {
        return new ResponseEntity<>(pedidoRepository.findById(id), HttpStatus.OK);
    }

//    Creamos un pedido con la informacion del body
    @PostMapping("/pedidos/create")
    public ResponseEntity<Object> create(@RequestBody Pedido pedido) {
        pedidoRepository.save(pedido);
        return new ResponseEntity<>(pedido, HttpStatus.OK);
    }

//    Eliminamos un pedido con el id que pongamos en la ruta
    @DeleteMapping("/pedidos/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") Long id) {
        Optional<Pedido> pedido = pedidoRepository.findById(id);
        pedido.ifPresent(value -> pedidoRepository.delete(value));
        return new ResponseEntity<>(pedido.isPresent(), HttpStatus.OK);
    }

//    Actualizamos un pedido , cogiendo datos del body y con el id que ponemos en la ruta
    @PutMapping("/pedidos/{id}")
    public ResponseEntity<Object> update(@PathVariable("id") Long id, @RequestBody Pedido pedido) {
        Optional<Pedido> antiguoPedido = pedidoRepository.findById(id);
        if(antiguoPedido.isPresent()) {
            pedido.setId(id);
            pedidoRepository.save(pedido);
            return new ResponseEntity<>(pedido, HttpStatus.OK);
        }
        return new ResponseEntity<>(false, HttpStatus.NOT_FOUND);
    }

}