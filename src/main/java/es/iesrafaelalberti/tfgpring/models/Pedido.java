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
public class Pedido {

    @Id
    @GeneratedValue
    private Long id;

    private String fech_pedido;
    private String informacion;

    @ManyToOne
    @JoinColumn()
    private Cliente cliente;

    @JsonBackReference
    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    private Set<ProductoPedido> productoPedidos = new HashSet<>();


    public Pedido() {
    }

    public Pedido(String fech_pedido, String informacion, Cliente cliente, Set<ProductoPedido> productoPedidos) {
        this.fech_pedido = fech_pedido;
        this.informacion = informacion;
        this.cliente = cliente;
        this.productoPedidos = productoPedidos;
    }
}
