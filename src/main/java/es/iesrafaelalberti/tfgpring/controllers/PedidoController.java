package es.iesrafaelalberti.tfgpring.controllers;

import es.iesrafaelalberti.tfgpring.dto.PedidoCreateDTO;
import es.iesrafaelalberti.tfgpring.dto.PedidoDTO;
import es.iesrafaelalberti.tfgpring.models.Pedido;
import es.iesrafaelalberti.tfgpring.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PedidoController {

    @Autowired
    PedidoRepository pedidoRepository;

//    Vemos todos los pedidos
    @GetMapping("/pedidos")
    public ResponseEntity<Object> index() {
        List<PedidoDTO> resultado = new ArrayList<>();
        for (Pedido pedido:pedidoRepository.findAll()) {
            resultado.add(new PedidoDTO(pedido));
        }
        return new ResponseEntity<>(resultado, HttpStatus.OK);
    }

//    Vemos el pedido con ese id que pongamos en la ruta
    @GetMapping("/pedidos/{id}")
    public ResponseEntity<Object> show(@PathVariable("id") Long id) {
        Optional<Pedido> pedidoOptional = pedidoRepository.findById(id);
        if (pedidoOptional.isPresent()) {
            PedidoDTO pedidoDTO = new PedidoDTO(pedidoOptional.get());
            return new ResponseEntity<>(pedidoDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

//    Creamos un pedido con la informacion del body
    @PostMapping("/pedidos/create")
    public ResponseEntity<Object> create(@RequestBody PedidoCreateDTO pedidoCreateDTO) {
        Pedido pedido = pedidoRepository.save(new Pedido(pedidoCreateDTO));
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
