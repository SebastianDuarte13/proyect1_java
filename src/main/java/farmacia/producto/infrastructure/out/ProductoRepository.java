package farmacia.producto.infrastructure.out;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import farmacia.infrastructure.config.DatabaseConfig;
import farmacia.producto.domain.entity.Producto;


public class ProductoRepository {
public void createProducto(Producto producto) {
        String sql = "INSERT INTO productos (Codigo_producto, nombre_producto, registro_invima_producto, via_administracion, principio_activo, unidad_medida, laboratorio, presentacion, fecha_caducidad, stock, stock_min, stock_maximo, valor_venta, proveedor_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection connection = DatabaseConfig.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, producto.getCodigo_producto());
            statement.setString(2, producto.getNombre_producto());
            statement.setString(3, producto.getRegistro_invima_producto());
            statement.setString(4, producto.getVia_administracion());
            statement.setString(5, producto.getPrincipio_activo());
            statement.setString(6, producto.getUnidad_medida());
            statement.setString(7, producto.getLaboratorio());
            statement.setString(8, producto.getPresentación());
            statement.setDate(9, producto.getFecha_caducidad());
            statement.setInt(10, producto.getStock());
            statement.setInt(11, producto.getStock_min());
            statement.setInt(12, producto.getStock_maximo());
            statement.setInt(13, producto.getValor_venta());
            statement.setInt(14, producto.getProveedor_id());

            
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
