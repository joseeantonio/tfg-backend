package es.iesrafaelalberti.tfgpring.services;

import es.iesrafaelalberti.tfgpring.dto.PedidoCreateDTO;
import es.iesrafaelalberti.tfgpring.models.Cliente;
import es.iesrafaelalberti.tfgpring.models.Pedido;
import es.iesrafaelalberti.tfgpring.repositories.ClienteRepository;
import es.iesrafaelalberti.tfgpring.repositories.PedidoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PedidosService {

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    PedidoRepository pedidoRepository;

    public Pedido pedidoCreate(PedidoCreateDTO pedido){
        Cliente cliente = clienteRepository.findById(pedido.getClienteId()).get();
        return pedidoRepository.save(new Pedido(pedido.getFech_pedido(),pedido.getInformacion(),cliente));
    }

}
