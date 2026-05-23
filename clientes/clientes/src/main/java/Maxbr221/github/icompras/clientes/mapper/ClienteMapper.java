package Maxbr221.github.icompas.clientes.mapper;

import Maxbr221.github.icompas.clientes.dto.ClienteDTO;
import Maxbr221.github.icompas.clientes.model.Cliente;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapper {

    public ClienteDTO mapToClientDTO(Cliente cliente){
        return ClienteDTO.builder()
                .codigo(cliente.getCodigo())
                .nome(cliente.getNome())
                .cpf(cliente.getCpf())
                .logradouro(cliente.getLogradouro())
                .numero(cliente.getNumero())
                .bairro(cliente.getBairro())
                .email(cliente.getEmail())
                .telefone(cliente.getTelefone())
                .build();
    }
    public Cliente mapToCliente(ClienteDTO clienteDTO){
        return Cliente.builder()
                .codigo(clienteDTO.codigo())
                .nome(clienteDTO.nome())
                .cpf(clienteDTO.cpf())
                .logradouro(clienteDTO.logradouro())
                .numero(clienteDTO.numero())
                .bairro(clienteDTO.bairro())
                .email(clienteDTO.email())
                .telefone(clienteDTO.telefone())
                .build();
    }
}
