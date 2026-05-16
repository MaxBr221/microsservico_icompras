package MaxBr221.github.icompras.pedidos.publisher.representation;

import java.math.BigDecimal;

public record DetalhePedidoRepresentation(
        Long codigoProduto, String nome,
        Integer quantidade, BigDecimal valorUnitario
) {
    public BigDecimal getTotal(){
        return valorUnitario.multiply(BigDecimal.valueOf(quantidade));
    }

}
