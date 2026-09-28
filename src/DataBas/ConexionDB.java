package DataBas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    private static final String URL = "jdbc:mysql://localhost:3306/proyecto_pgc";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "admin";
    
    Connection conexion = ConexionDB.conectar();

    public static Connection conectar() {

        try {
            Connection conexion = DriverManager.getConnection(
                URL,
                USUARIO,
                CONTRASENA
            );

            System.out.println("Conexion exitosa");
            return conexion;

        } catch (SQLException e) {

            System.out.println("Error de conexion: " + e.getMessage());
            return null;
        }
    }
}

