package es.iesrafaelalberti.tfgpring.models;

import es.iesrafaelalberti.tfgpring.dto.ProductoPedidoCreateDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ProductoPedido {

    @Id
    @GeneratedValue
    private Long id;

    private Integer cantidad;

    @ManyToOne
    @JoinColumn()
    private Pedido pedido;

    @ManyToOne
    @JoinColumn()
    private Producto producto;


    public ProductoPedido(Integer cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public ProductoPedido(ProductoPedidoCreateDTO productoPedidoCreateDTO) {
        this.cantidad = productoPedidoCreateDTO.getCantidad();
    }
}
