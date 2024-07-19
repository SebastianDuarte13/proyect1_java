package farmacia.tipo_documento.domain.service;

import farmacia.tipo_documento.domain.entity.TipoDocumento;

public interface TipoDocumentoService {
    void createUser(TipoDocumento TipoDocumento);
    TipoDocumento findUserById(Long id);
    void createTipoDocumento(TipoDocumento tipoDocumento);
}
