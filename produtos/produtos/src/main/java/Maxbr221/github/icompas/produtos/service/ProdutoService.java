package Maxbr221.github.icompas.produtos.service;

import Maxbr221.github.icompas.produtos.dto.ProdutoDTO;
import Maxbr221.github.icompas.produtos.mapper.ProdutoMapper;
import Maxbr221.github.icompas.produtos.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoRepository produtoRepository;
    private final ProdutoMapper produtoMapper;

    public ProdutoDTO salvarProduto(ProdutoDTO produtoDTO){
        var produtoEntity = produtoMapper.mapToProduto(produtoDTO);
        var produtoSalvo = produtoRepository.save(produtoEntity);
        return produtoMapper.mapToProdutoDTO(produtoSalvo);
    }

    public Optional<ProdutoDTO> obterPorCodigo(Long produto){
        return produtoRepository.findById(produto)
                .map(produtoMapper::mapToProdutoDTO);
    }


}
