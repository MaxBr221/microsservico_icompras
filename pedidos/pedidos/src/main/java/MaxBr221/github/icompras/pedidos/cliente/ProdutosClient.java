package MaxBr221.github.icompras.pedidos.cliente.representacao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "produtos", url = "${icompras.pedidos.clientes.produtos.url}")
public interface ProdutosClient {

    @GetMapping("{codigo}")
    ResponseEntity<RepresentacaoProduto> obterDados(@PathVariable("codigo") Long codigo);

}
