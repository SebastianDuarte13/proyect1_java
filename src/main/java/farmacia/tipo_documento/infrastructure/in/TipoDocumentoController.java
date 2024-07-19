package farmacia.tipo_documento.infrastructure.in;

import java.util.InputMismatchException;
import java.util.Scanner;

import farmacia.tipo_documento.application.CreateTipoDocumentoUseCase;
import farmacia.tipo_documento.domain.entity.TipoDocumento;
import farmacia.cliente.infrastructure.in.ClienteController;

public class TipoDocumentoController {
    private CreateTipoDocumentoUseCase createTipoDocumentoUseCase;
    private Scanner scanner;

    public TipoDocumentoController(CreateTipoDocumentoUseCase createTipoDocumentoUseCase) {
        this.createTipoDocumentoUseCase = createTipoDocumentoUseCase;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("1. Añadir tipo documento");
            System.out.println("2. añadir cliente");
            System.out.println("3. Actualizar juego");
            System.out.println("4. Eliminar juego");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            
            int choice;
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); 
            } catch (InputMismatchException e) {
                scanner.next(); 
                System.out.println("Entrada no válida. Por favor, introduce un número.");
                continue; 
            }

            switch (choice) {
                case 1:
                    addtipe();
                    break;
                case 2:
                    //addcliente();
                    break;
                case 3:
                    // Actualizar juego
                    break;
                case 4:
                    // Eliminar juego
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    public void addtipe() {
        System.out.println("Enter id del tipo de documento: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter nombre tipo documento: ");
        String nombre = scanner.nextLine();

        TipoDocumento tipoDocumento = new TipoDocumento();
        tipoDocumento.setId(id);
        tipoDocumento.setNombre(nombre);

        try {
            createTipoDocumentoUseCase.execute(tipoDocumento);
            System.out.println("Tipo de documento agregado exitosamente!");
        } catch (Exception e) { // Captura una excepción más general
            System.out.println("Error al agregar tipo de documento: " + e.getMessage());
        }
    }
}
