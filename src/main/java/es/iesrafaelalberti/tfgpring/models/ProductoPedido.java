package es.iesrafaelalberti.tfgpring.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
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


    public ProductoPedido() {
    }

    public ProductoPedido(Integer cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }
}
