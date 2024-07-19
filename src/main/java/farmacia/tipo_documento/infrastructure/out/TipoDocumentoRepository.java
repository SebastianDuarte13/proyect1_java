package farmacia.tipo_documento.infrastructure.out;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import farmacia.infrastructure.config.DatabaseConfig;
import farmacia.tipo_documento.domain.entity.TipoDocumento;
import farmacia.tipo_documento.domain.service.TipoDocumentoService;

public class TipoDocumentoRepository implements TipoDocumentoService{

    public void createTipoDocumento(TipoDocumento tipoDocumento) {
        String sql = "INSERT INTO tipo_identificacion (id, nom_tipo) VALUES (?, ?)";

        try (Connection connection = DatabaseConfig.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {

            statement.setInt(1, tipoDocumento.getId());
            statement.setString(2, tipoDocumento.getNombre());
            statement.executeUpdate();

            try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    tipoDocumento.setId(generatedKeys.getInt(1));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void createUser(TipoDocumento TipoDocumento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createUser'");
    }

    @Override
    public TipoDocumento findUserById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findUserById'");
    }
}
