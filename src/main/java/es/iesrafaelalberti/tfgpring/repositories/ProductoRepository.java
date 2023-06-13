package es.iesrafaelalberti.tfgpring.repositories;

import es.iesrafaelalberti.tfgpring.models.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductoRepository extends CrudRepository <Producto,Long> {
    List<Producto> findByTipo(String tipo);
    List<Producto> findByTipoOrderByPrecioAsc(String tipo);
    List<Producto> findByTipoOrderByPrecioDesc(String tipo);
    List<Producto> findAllByOrderByPrecioAsc();
    List<Producto> findAllByOrderByPrecioDesc();
    Page<Producto> findAll(Pageable pageable);
    List<Producto> findByNombreContainingIgnoreCase(String nombre);
}
