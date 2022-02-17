
//Para comunicarse con la base de datos 

package clases;
import java.sql.*;

public class Conexion {
    //Conexion local
    public static Connection conectar(){
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/ella", "root", "");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en conexion local: " + e);
        }
        return (null);
    }
}
