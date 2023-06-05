package es.iesrafaelalberti.tfgpring.dto;

import es.iesrafaelalberti.tfgpring.models.ProductoPedido;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductoPedidoDTO {
    private Integer cantidad;
    private Long pedidoId;
    private Long productoId;


    public ProductoPedidoDTO(ProductoPedido productoPedido) {
        this.cantidad = productoPedido.getCantidad();
        this.pedidoId = productoPedido.getPedido().getId();
        this.productoId = productoPedido.getProducto().getId();
    }

}