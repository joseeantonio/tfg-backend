package es.iesrafaelalberti.tfgpring.controllers;

import es.iesrafaelalberti.tfgpring.dto.ClienteCreateDTO;
import es.iesrafaelalberti.tfgpring.dto.ClienteDTO;
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
        Optional<Cliente> cliente = clienteRepository.findById(id);
        ClienteDTO clienteDTO = cliente.map(ClienteDTO::new).orElse(null);
        return new ResponseEntity<>(clienteDTO, HttpStatus.OK);
    }

//    Creamos un cliente con la informacion del body
    @PostMapping("/clientes/create")
    public ResponseEntity<Object> create(@RequestBody ClienteCreateDTO clienteCreateDTO) {
        Cliente cliente = clienteRepository.save(new Cliente(clienteCreateDTO));
        return new ResponseEntity<>(new ClienteDTO(cliente), HttpStatus.OK);
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
    public ResponseEntity<Object> update(@PathVariable("id") Long id, @RequestBody ClienteCreateDTO clienteCreateDTO) {
        Optional<Cliente> antiguoClienteOptional = clienteRepository.findById(id);
        if(antiguoClienteOptional.isPresent()) {

            Cliente antiguoCliente = antiguoClienteOptional.get();
            Cliente nuevoCliente = new Cliente(clienteCreateDTO);

            // Copiar los atributos del nuevoCliente al antiguoCliente solo si no son nulos
            if (nuevoCliente.getNombre() != null) {
                antiguoCliente.setNombre(nuevoCliente.getNombre());
            }
            if (nuevoCliente.getApellidos() != null) {
                antiguoCliente.setApellidos(nuevoCliente.getApellidos());
            }
            if (nuevoCliente.getCorreo() != null) {
                antiguoCliente.setCorreo(nuevoCliente.getCorreo());
            }
            if (nuevoCliente.getContraseña() != null) {
                antiguoCliente.setContraseña(nuevoCliente.getContraseña());
            }
            if (nuevoCliente.getUsername() != null) {
                antiguoCliente.setUsername(nuevoCliente.getUsername());
            }
            if (nuevoCliente.getFecha_nac() != null) {
                antiguoCliente.setFecha_nac(nuevoCliente.getFecha_nac());
            }


            clienteRepository.save(antiguoCliente);
            return new ResponseEntity<>(new ClienteDTO(antiguoCliente), HttpStatus.OK);
        }
        return new ResponseEntity<>(false, HttpStatus.NOT_FOUND);
    }

}
