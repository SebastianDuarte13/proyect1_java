package farmacia.producto.infrastructure.in;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import farmacia.producto.application.CreateProductoUseCase;
import farmacia.producto.domain.entity.Producto;

public class ProductoController {
    private CreateProductoUseCase createProductoUseCase;
    private Scanner scanner;

    public ProductoController(CreateProductoUseCase createProductoUseCase) {
        this.createProductoUseCase = createProductoUseCase;
        this.scanner = new Scanner(System.in);
    }

    public void addProducto() {
        try {
            System.out.println("Ingrese código de producto: ");
            int codigo_producto = Integer.parseInt(scanner.nextLine());

            System.out.println("Nombre del producto: ");
            String nombre_producto = scanner.nextLine();

            System.out.println("Registro del Invima: ");
            String registro_invima_producto = scanner.nextLine();

            System.out.println("Vía de administración: ");
            String via_administracion = scanner.nextLine();

            System.out.println("Principio activo: ");
            String principio_activo = scanner.nextLine();

            System.out.println("Unidad de medida: ");
            String unidad_medida = scanner.nextLine();

            System.out.println("Laboratorio: ");
            String laboratorio = scanner.nextLine();

            System.out.println("Presentación: ");
            String presentacion = scanner.nextLine();

            System.out.println("Fecha de caducidad (YYYY-MM-DD): ");
            Date fecha_caducidad = parseDate(scanner.nextLine());

            System.out.println("Stock: ");
            int stock = Integer.parseInt(scanner.nextLine());

            System.out.println("Stock mínimo: ");
            int stock_min = Integer.parseInt(scanner.nextLine());

            System.out.println("Stock máximo: ");
            int stock_maximo = Integer.parseInt(scanner.nextLine());

            System.out.println("Valor de venta: ");
            int valor_venta = Integer.parseInt(scanner.nextLine());

            System.out.println("Proveedor ID: ");
            int proveedor_id = Integer.parseInt(scanner.nextLine());

            Producto producto = new Producto(proveedor_id);
            producto.setCodigo_producto(codigo_producto);
            producto.setNombre_producto(nombre_producto);
            producto.setRegistro_invima_producto(registro_invima_producto);
            producto.setVia_administracion(via_administracion);
            producto.setPrincipio_activo(principio_activo);
            producto.setUnidad_medida(unidad_medida);
            producto.setLaboratorio(laboratorio);
            producto.setPresentación(presentacion);
            producto.setFecha_caducidad(convertToSqlDate(fecha_caducidad));
            producto.setStock(stock);
            producto.setStock_min(stock_min);
            producto.setStock_maximo(stock_maximo);
            producto.setValor_venta(valor_venta);

            createProductoUseCase.execute(producto);
            System.out.println("¡Producto agregado exitosamente!");

        } catch (NumberFormatException e) {
            System.out.println("Error en la entrada de datos numéricos: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al agregar producto: " + e.getMessage());
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
