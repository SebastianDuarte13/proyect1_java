package farmacia;

import farmacia.tipo_documento.application.CreateTipoDocumentoUseCase;
import farmacia.tipo_documento.domain.service.TipoDocumentoService;
import farmacia.tipo_documento.infrastructure.in.TipoDocumentoController;
import farmacia.tipo_documento.infrastructure.out.TipoDocumentoRepository;

public class Main {
    public static void main(String[] args) {
        TipoDocumentoService tipoDocumentoService = new TipoDocumentoRepository();
        CreateTipoDocumentoUseCase createTipoDocumentoUseCase = new CreateTipoDocumentoUseCase(tipoDocumentoService);
        TipoDocumentoController consoleAdapter = new TipoDocumentoController(createTipoDocumentoUseCase);

        consoleAdapter.start();
    }
}