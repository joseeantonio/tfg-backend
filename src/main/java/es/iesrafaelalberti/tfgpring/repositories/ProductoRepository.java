package es.iesrafaelalberti.tfgpring.repositories;

import es.iesrafaelalberti.tfgpring.models.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepository extends CrudRepository <Producto,Long> {
}
