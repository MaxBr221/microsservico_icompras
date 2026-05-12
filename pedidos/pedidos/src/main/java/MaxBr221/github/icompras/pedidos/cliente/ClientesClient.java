package MaxBr221.github.icompras.pedidos.cliente.representacao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "clientes", url = "${icompras.pedidos.clientes.clientes.url}")
public interface ClientesClient {

    @GetMapping("{codigo}")
    ResponseEntity<RepresentacaoCliente> obterdados(@PathVariable("codigo") Long codigo);

}
