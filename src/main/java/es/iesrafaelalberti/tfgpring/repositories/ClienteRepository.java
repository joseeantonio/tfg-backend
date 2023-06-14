package es.iesrafaelalberti.tfgpring.repositories;

import es.iesrafaelalberti.tfgpring.models.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository <Cliente,Long> {

    Cliente findByCorreo(String email);



}
