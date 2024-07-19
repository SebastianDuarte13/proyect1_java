package farmacia.tipo_documento.infrastructure.in;

import java.util.Scanner;

import farmacia.tipo_documento.application.CreateTipoDocumentoUseCase;
import farmacia.tipo_documento.domain.entity.TipoDocumento;

public class TipoDocumentoController {
    private CreateTipoDocumentoUseCase createTipoDocumentoUseCase;

    public TipoDocumentoController(CreateTipoDocumentoUseCase createTipoDocumentoUseCase) {
        this.createTipoDocumentoUseCase = createTipoDocumentoUseCase;
    }

    public void start() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter id: ");
            int id = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter nombre tipo documento: ");
            String nombre = scanner.nextLine();

            TipoDocumento tipoDocumento = new TipoDocumento();
            tipoDocumento.setId(id);
            tipoDocumento.setNombre(nombre);

            createTipoDocumentoUseCase.execute(tipoDocumento);
        }

        System.out.println("User created successfully!");
    }
}
