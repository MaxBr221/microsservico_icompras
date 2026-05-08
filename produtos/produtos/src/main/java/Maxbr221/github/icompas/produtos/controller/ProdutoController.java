package Maxbr221.github.icompas.produtos.controller;

import Maxbr221.github.icompas.produtos.dto.ProdutoDTO;
import Maxbr221.github.icompas.produtos.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("produtos")
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<ProdutoDTO> salvar(@RequestBody ProdutoDTO produtoDTO){
        ProdutoDTO produtos = produtoService.salvarProduto(produtoDTO);
        return ResponseEntity.ok(produtos);
    }
    @GetMapping("/{codigo}")
    public ResponseEntity<ProdutoDTO> obterDados(@PathVariable("codigo") Long codigo){
        return produtoService.obterPorCodigo(codigo)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());

    }
}
