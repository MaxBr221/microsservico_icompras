package Maxbr221.github.icompas.clientes.controller;


import Maxbr221.github.icompas.clientes.dto.ClienteDTO;
import Maxbr221.github.icompas.clientes.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;

    @PostMapping
    public ResponseEntity<ClienteDTO> salvar(@RequestBody ClienteDTO clienteDTO){
        ClienteDTO clienteDTO1 = clienteService.salvar(clienteDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteDTO1);
    }
    @GetMapping("/{codigo}")
    public ResponseEntity<ClienteDTO> obterPorDado(@PathVariable("codigo") Long codigo){
        return clienteService.obterPorCodigo(codigo)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}
