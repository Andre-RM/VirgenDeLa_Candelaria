
package utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private Connection cnx;
    
    public Connection conecta() throws ClassNotFoundException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String usr = "root";
            String psw = "admin";
            String url = "jdbc:mysql://127.0.0.1:3306/Virgen_de_la_Candelaria";
            cnx = DriverManager.getConnection(url,usr, psw);
            return cnx;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    public int pruebaConexion() throws ClassNotFoundException {
        Connection c = conecta();
        if (c!=null) {
            return 1;
        } else {
            return 0;
        }
    }
}
