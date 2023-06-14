package es.iesrafaelalberti.tfgpring.dto;

import es.iesrafaelalberti.tfgpring.models.Cliente;
import es.iesrafaelalberti.tfgpring.models.Pedido;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ClienteDTO implements Serializable {

    private Long id;
    private String nombre;
    private String apellidos;
    private String correo;
    private String username;
    private String fecha_nac;
    private boolean admin;
    private List<Long> pedidos = new ArrayList<>();
    
    public ClienteDTO(Cliente cliente) {
        this.id = cliente.getId();
        this.nombre = cliente.getNombre();
        this.apellidos = cliente.getApellidos();
        this.correo = cliente.getCorreo();
        this.fecha_nac = cliente.getFecha_nac();
        this.admin = cliente.isAdmin();
        this.username = cliente.getUsername();
        for (Pedido pedido : cliente.getPedidos()){
            this.pedidos.add(pedido.getId());
        }
    }

}
