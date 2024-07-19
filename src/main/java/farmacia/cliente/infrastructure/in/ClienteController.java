package farmacia.cliente.infrastructure.in;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import farmacia.cliente.domain.entity.Cliente;
import farmacia.cliente.application.CreateClienteUseCase;

public class ClienteController {
    private CreateClienteUseCase createClienteUseCase;
    private Scanner scanner;

    public ClienteController(CreateClienteUseCase createClienteUseCase) {
        this.createClienteUseCase = createClienteUseCase;
        this.scanner = new Scanner(System.in);
    }

    public void addcliente() {
        try {
            System.out.println("Enter id suyo: ");
            int nro_identificacion = Integer.parseInt(scanner.nextLine());

            System.out.println("nombre(s): ");
            String nombres = scanner.nextLine();

            System.out.println("apellido(s): ");
            String apellidos = scanner.nextLine();

            System.out.println("edad: ");
            int edad = Integer.parseInt(scanner.nextLine());

            System.out.println("fecha_nacimiento (YYYY-MM-DD): ");
            Date fecha_nacimiento = parseDate(scanner.nextLine());

            System.out.println("fecha_registro (YYYY-MM-DD): ");
            Date fecha_registro = parseDate(scanner.nextLine());

            System.out.println("ciudad_radical: ");
            String ciudad_radical = scanner.nextLine();

            System.out.println("barrio: ");
            String barrio = scanner.nextLine();

            System.out.println("tipo_identificacion_id: ");
            int tipo_identificacion_id = Integer.parseInt(scanner.nextLine());

            Cliente cliente = new Cliente(tipo_identificacion_id);
            cliente.setNro_identificacion(nro_identificacion);
            cliente.setNombres(nombres);
            cliente.setApellidos(apellidos);
            cliente.setEdad(edad);
            cliente.setFecha_nacimiento(convertToSqlDate(fecha_nacimiento));
            cliente.setFecha_registro(convertToSqlDate(fecha_registro));
            cliente.setCiudad_radical(ciudad_radical);
            cliente.setBarrio(barrio);
            cliente.setTipo_identificacion_id(tipo_identificacion_id);

            createClienteUseCase.execute(cliente);
            System.out.println("Cliente agregado exitosamente!");

        } catch (NumberFormatException e) {
            System.out.println("Error en la entrada de datos numéricos: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al agregar cliente: " + e.getMessage());
        }
    }

    private static Date parseDate(String dateStr) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        formatter.setLenient(false); // Asegúrate de que la fecha sea estricta
        try {
            return formatter.parse(dateStr);
        } catch (ParseException e) {
            System.out.println("Formato de fecha no válido. Se usará la fecha actual.");
            return new Date(); // Retorna la fecha actual si el formato es inválido
        }
    }

    private static java.sql.Date convertToSqlDate(Date utilDate) {
        return new java.sql.Date(utilDate.getTime());
    }
}
