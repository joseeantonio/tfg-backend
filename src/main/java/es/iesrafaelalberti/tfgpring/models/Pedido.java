package es.iesrafaelalberti.tfgpring.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Pedido {

    @Id
    @GeneratedValue
    private Long id;

    private String fech_pedido;
    private String informacion;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @JsonBackReference
    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    private Set<ProductoPedido> productoPedidos = new HashSet<>();

    public Pedido(String fech_pedido, String informacion, Cliente cliente) {
        this.fech_pedido = fech_pedido;
        this.informacion = informacion;
        this.cliente = cliente;
    }
}
