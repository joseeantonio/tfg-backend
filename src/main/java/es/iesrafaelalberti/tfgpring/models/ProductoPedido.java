package es.iesrafaelalberti.tfgpring.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

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

    @JsonBackReference
    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private Set<Producto> productos = new HashSet<>();


    public ProductoPedido() {
    }

    public ProductoPedido(Integer cantidad, Pedido pedido, Set<Producto> productos) {
        this.cantidad = cantidad;
        this.pedido = pedido;
        this.productos = productos;
    }
}
