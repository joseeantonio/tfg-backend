package es.iesrafaelalberti.tfgpring.dto;

import es.iesrafaelalberti.tfgpring.models.Pedido;
import es.iesrafaelalberti.tfgpring.models.ProductoPedido;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PedidoDTO {

    private Long id;
    private String fech_pedido;
    private String informacion;
    private Long clienteId;
    private List<ProductoCantidad> productos;

    public PedidoDTO(Pedido pedido) {
        this.id = pedido.getId();
        this.fech_pedido = pedido.getFech_pedido();
        this.informacion = pedido.getInformacion();
        this.clienteId = pedido.getCliente().getId();
        this.productos = new ArrayList<ProductoCantidad>();
        for (ProductoPedido productoPedido: pedido.getProductoPedidos()) {
            productos.add(new ProductoCantidad(productoPedido.getProducto().getId(),productoPedido.getCantidad()));
        }
    }
}
