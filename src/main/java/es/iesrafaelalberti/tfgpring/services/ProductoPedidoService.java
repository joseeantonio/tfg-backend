package es.iesrafaelalberti.tfgpring.services;

import es.iesrafaelalberti.tfgpring.dto.ProductoPedidoCreateDTO;
import es.iesrafaelalberti.tfgpring.models.Pedido;
import es.iesrafaelalberti.tfgpring.models.Producto;
import es.iesrafaelalberti.tfgpring.models.ProductoPedido;
import es.iesrafaelalberti.tfgpring.repositories.PedidoRepository;
import es.iesrafaelalberti.tfgpring.repositories.ProductoPedidoRepository;
import es.iesrafaelalberti.tfgpring.repositories.ProductoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductoPedidoService {
    @Autowired
    ProductoPedidoRepository productoPedidoRepository;
    @Autowired
    PedidoRepository pedidoRepository;
    @Autowired
    ProductoRepository productoRepository;

    public ProductoPedido productoPedidoCreate(ProductoPedidoCreateDTO productoPedido) {

        Pedido pedido = pedidoRepository.findById(productoPedido.getPedidoId()).get();
        Producto producto = productoRepository.findById(productoPedido.getProductoId()).get();

        return productoPedidoRepository.save(new ProductoPedido(productoPedido.getCantidad(),pedido,producto));
    }
}
