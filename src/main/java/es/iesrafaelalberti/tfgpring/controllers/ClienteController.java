package es.iesrafaelalberti.tfgpring.controllers;

import es.iesrafaelalberti.tfgpring.models.Cliente;
import es.iesrafaelalberti.tfgpring.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ClienteController {

    @Autowired
    ClienteRepository clienteRepository;

//    Vemos todos los clientes
    @GetMapping("/clientes")
    public ResponseEntity<Object> index() {
        return new ResponseEntity<>(clienteRepository.findAll(), HttpStatus.OK);
    }

//    Vemos el cliente con ese id que pongamos en la ruta
    @GetMapping("/clientes/{id}")
    public ResponseEntity<Object> show(@PathVariable("id") Long id){
        return new ResponseEntity<>(clienteRepository.findById(id), HttpStatus.OK);
    }

//    Creamos un cliente con la informacion del body
    @PostMapping("/clientes/create")
    public ResponseEntity<Object> create(@RequestBody Cliente cliente) {
        clienteRepository.save(cliente);
        return new ResponseEntity<>(cliente, HttpStatus.OK);
    }

//    Eliminamos un cliente con el id que pongamos en la ruta
    @DeleteMapping("/clientes/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        cliente.ifPresent(value -> clienteRepository.delete(value));
        return new ResponseEntity<>(cliente.isPresent(), HttpStatus.OK);
    }

//    Actualizamos un cliente , cogiendo datos del body y con el id que ponemos en la ruta
    @PutMapping("/clientes/{id}")
    public ResponseEntity<Object> update(@PathVariable("id") Long id, @RequestBody Cliente cliente) {
        Optional<Cliente> antiguoCliente = clienteRepository.findById(id);
        if(antiguoCliente.isPresent()) {
            cliente.setId(id);
            clienteRepository.save(cliente);
            return new ResponseEntity<>(cliente, HttpStatus.OK);
        }
        return new ResponseEntity<>(false, HttpStatus.NOT_FOUND);
    }

}
