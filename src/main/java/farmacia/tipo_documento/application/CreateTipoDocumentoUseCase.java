package farmacia.tipo_documento.application;

import farmacia.tipo_documento.domain.entity.TipoDocumento;
import farmacia.tipo_documento.domain.service.TipoDocumentoService;

public class CreateTipoDocumentoUseCase {
    private final TipoDocumentoService tipoDocumentoService;

    public CreateTipoDocumentoUseCase(TipoDocumentoService tipoDocumentoService) {
        this.tipoDocumentoService = tipoDocumentoService;
    }

    public void execute(TipoDocumento tipoDocumento) {
        tipoDocumentoService.createUser(tipoDocumento);
    }
}
