package es.iesrafaelalberti.tfgpring.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class ClienteCreateDTO implements Serializable {

    private String nombre;
    private String apellidos;
    private String correo;
    private String username;
    private String contraseña;
    private String fecha_nac;

}
