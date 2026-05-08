package Maxbr221.github.icompas.clientes.dto;

import lombok.Builder;

@Builder
public record ClienteDTO(Long codigo, String nome, String cpf,
                         String logradouro, String numero,
                         String bairro, String email,
                         String telefone) {
}
