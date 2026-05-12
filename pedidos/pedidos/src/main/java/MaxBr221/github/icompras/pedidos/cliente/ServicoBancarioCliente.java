package MaxBr221.github.icompras.pedidos.cliente.representacao;

import MaxBr221.github.icompras.pedidos.model.Pedido;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Slf4j
public class ServicoBancarioCliente {


    public String solicitarPagamento(Pedido pedido){
        log.info("Solicitando pagamento para o pedido de codigo: {}", pedido.getCodigo());
        return UUID.randomUUID().toString();
    }
}
