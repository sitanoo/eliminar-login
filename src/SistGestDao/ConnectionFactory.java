package SistGestDao;

import SistGestModelo.Colaborador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class ConnectionFactory {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1/sistema_gestao", "root", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
        
    }
}
