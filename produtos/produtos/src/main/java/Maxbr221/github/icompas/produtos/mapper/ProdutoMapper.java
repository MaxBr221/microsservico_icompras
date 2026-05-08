package Maxbr221.github.icompas.produtos.mapper;

import Maxbr221.github.icompas.produtos.dto.ProdutoDTO;
import Maxbr221.github.icompas.produtos.model.Produto;
import org.springframework.stereotype.Component;

@Component
public class ProdutoMapper {

    public Produto mapToProduto(ProdutoDTO produtoDTO){
        return Produto.builder()
                .codigo(produtoDTO.codigo())
                .nome(produtoDTO.nome())
                .valorUnitario(produtoDTO.valorUnitario())
                .build();
    }
    public ProdutoDTO mapToProdutoDTO(Produto produto){
        return ProdutoDTO.builder()
                .codigo(produto.getCodigo())
                .nome(produto.getNome())
                .valorUnitario(produto.getValorUnitario())
                .build();
    }
}
