package es.iesrafaelalberti.tfgpring.models;

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
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;


    public ProductoPedido(Integer cantidad, Pedido pedido, Producto producto) {
        this.cantidad = cantidad;
        this.pedido = pedido;
        this.producto = producto;
    }
}
