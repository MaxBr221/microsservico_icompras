package Maxbr221.github.icompas.clientes.repository;

import Maxbr221.github.icompas.clientes.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
