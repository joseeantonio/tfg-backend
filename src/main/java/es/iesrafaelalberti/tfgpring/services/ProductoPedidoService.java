package es.iesrafaelalberti.tfgpring.services;

import es.iesrafaelalberti.tfgpring.dto.ProductoPedidoCreateDTO;
import es.iesrafaelalberti.tfgpring.models.ProductoPedido;
import es.iesrafaelalberti.tfgpring.repositories.ProductoPedidoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductoPedidoService {
    @Autowired
    ProductoPedidoRepository productoPedidoRepository;
    public ProductoPedido productoPedidoCreate(ProductoPedidoCreateDTO productoPedido) {
        return productoPedidoRepository.save(new ProductoPedido(productoPedido));
    }
}
