package Maxbr221.github.icompas.clientes.service;


import Maxbr221.github.icompas.clientes.dto.ClienteDTO;
import Maxbr221.github.icompas.clientes.mapper.ClienteMapper;
import Maxbr221.github.icompas.clientes.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;
    private final ClienteMapper clienteMapper;

    public ClienteDTO salvar(ClienteDTO clienteDTO){
        var clienteEntity = clienteMapper.mapToCliente(clienteDTO);
        var clienteSalvo = clienteRepository.save(clienteEntity);
        return clienteMapper.mapToClientDTO(clienteSalvo);

    }
    public Optional<ClienteDTO> obterPorCodigo(Long codigo){
        return clienteRepository.findById(codigo)
                .map(clienteMapper::mapToClientDTO);
    }
}
