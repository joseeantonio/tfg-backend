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
public class ProductoPedidoCreateDTO implements Serializable {
    private Integer cantidad;
    private Long productoId;
    private Long pedidoId;
}
