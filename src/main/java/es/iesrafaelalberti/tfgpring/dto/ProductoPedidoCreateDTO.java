package es.iesrafaelalberti.tfgpring.dto;

import es.iesrafaelalberti.tfgpring.models.ProductoPedido;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductoPedidoCreateDTO implements Serializable {
    private Integer cantidad;
    private Long productoId;
    private Long pedidoId;

    public ProductoPedidoCreateDTO(ProductoPedido productoPedido) {
        this.cantidad = productoPedido.getCantidad();
        this.productoId = productoPedido.getProducto().getId();
        this.pedidoId = productoPedido.getPedido().getId();

    }
}
