package MaxBr221.github.icompras.pedidos.publisher.representation;

import MaxBr221.github.icompras.pedidos.model.StatusPedido;

import java.math.BigDecimal;
import java.util.List;

public record DetalhePedidoRepresentation(
        Long codigo, Long codigoCliente,
        String nome, String cpf,
        String logradouro, String numero,
        String bairro,
        String email,
        String telefone,
        String dataPedido,
        BigDecimal total,
        StatusPedido statusPedido,
        List<DetalheItemPedidoRepresentation> itens

) {
}
