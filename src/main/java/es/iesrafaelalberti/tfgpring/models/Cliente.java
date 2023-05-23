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
public class Cliente {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private String apellidos;
    private String correo;
    private String contraseña;
    private String fecha_nac;
    private Boolean admin;

    @JsonBackReference
    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    private Set<Pedido> pedidos = new HashSet<>();

    public Cliente() {
    }

    public Cliente(String nombre, String apellidos, String correo, String contraseña, String fecha_nac, Boolean admin, Set<Pedido> pedidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.contraseña = contraseña;
        this.fecha_nac = fecha_nac;
        this.admin = admin;
        this.pedidos = pedidos;
    }
}
