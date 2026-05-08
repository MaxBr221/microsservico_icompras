package Maxbr221.github.icompas.produtos.dto;

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record ProdutoDTO(Long codigo, String nome, BigDecimal valorUnitario) {

}
