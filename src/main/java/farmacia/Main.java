package farmacia;

import farmacia.tipo_documento.application.CreateTipoDocumentoUseCase;
import farmacia.tipo_documento.domain.service.TipoDocumentoService;
import farmacia.tipo_documento.infrastructure.in.TipoDocumentoController;
import farmacia.tipo_documento.infrastructure.out.TipoDocumentoRepository;
import farmacia.cliente.application.CreateClienteUseCase;
import farmacia.cliente.infrastructure.in.ClienteController;
import farmacia.cliente.infrastructure.out.ClienteRepository;
import farmacia.cliente.domain.service.ClienteService;

public class Main {
    public static void main(String[] args) {
        // Inicializar componentes de TipoDocumento
        TipoDocumentoService tipoDocumentoService = new TipoDocumentoRepository();
        CreateTipoDocumentoUseCase createTipoDocumentoUseCase = new CreateTipoDocumentoUseCase(tipoDocumentoService);

        // Inicializar componentes de Cliente
        ClienteService clienteService = new ClienteRepository();
        CreateClienteUseCase createClienteUseCase = new CreateClienteUseCase(clienteService);
        ClienteController clienteController = new ClienteController(createClienteUseCase);

        // Inicializar TipoDocumentoController con ClienteController
        TipoDocumentoController tipoDocumentoController = new TipoDocumentoController(createTipoDocumentoUseCase, clienteController);

        // Iniciar el programa
        tipoDocumentoController.start();
    }
}
