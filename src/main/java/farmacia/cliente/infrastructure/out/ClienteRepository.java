package farmacia.cliente.infrastructure.out;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import farmacia.cliente.domain.entity.Cliente;
import farmacia.infrastructure.config.DatabaseConfig;
import farmacia.cliente.domain.service.ClienteService;

public class ClienteRepository implements ClienteService {
    public void createCliente(Cliente cliente) {
        String sql = "INSERT INTO clientes (nro_identificacion, nombres, apellidos, edad, fecha_nacimiento, fecha_registro, ciudad_radical, barrio, tipo_identificacion_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection connection = DatabaseConfig.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, cliente.getNro_identificacion());
            statement.setString(2, cliente.getNombres());
            statement.setString(3, cliente.getApellidos());
            statement.setInt(4, cliente.getEdad());
            statement.setDate(5, cliente.getFecha_nacimiento());
            statement.setDate(6, cliente.getFecha_registro());
            statement.setString(7, cliente.getCiudad_radical());
            statement.setString(8, cliente.getBarrio());
            statement.setInt(9, cliente.getTipo_identificacion_id());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void createUser(Cliente cliente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createUser'");
    }

    @Override
    public Cliente findUserById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findUserById'");
    }


}
