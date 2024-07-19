package farmacia.cliente.domain.service;

import farmacia.cliente.domain.entity.Cliente;

public interface ClienteService {
    void createUser(Cliente cliente);
    Cliente findUserById(Long id);
    void createCliente(Cliente cliente);
}
