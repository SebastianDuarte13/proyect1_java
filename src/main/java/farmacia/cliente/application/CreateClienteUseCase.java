package farmacia.cliente.application;

import farmacia.cliente.domain.entity.Cliente;
import farmacia.cliente.domain.service.ClienteService;


public class CreateClienteUseCase {
 private final ClienteService clienteService;

    public CreateClienteUseCase(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    public void execute(Cliente cliente) {
        clienteService.createCliente(clienteService);
    }
}
