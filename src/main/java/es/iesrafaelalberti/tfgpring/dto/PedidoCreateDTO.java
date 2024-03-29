package es.iesrafaelalberti.tfgpring.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PedidoCreateDTO implements Serializable {
    private String fech_pedido;
    private String informacion;
    private Long clienteId;
}
