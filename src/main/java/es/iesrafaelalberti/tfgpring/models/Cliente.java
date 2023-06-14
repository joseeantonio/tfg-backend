package es.iesrafaelalberti.tfgpring.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private String apellidos;
    @Column(nullable = false, unique = true)
    private String correo;
    private String username;
    private String contraseña;
    private String fecha_nac;
    private boolean admin;

    @JsonBackReference
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private Set<Pedido> pedidos = new HashSet<>();


    public Cliente(String nombre,String username, String apellidos, String correo, String contraseña, String fecha_nac, boolean admin) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.contraseña = new BCryptPasswordEncoder().encode(contraseña);;
        this.fecha_nac = fecha_nac;
        this.admin = admin;
        this.username = username;
    }
}
