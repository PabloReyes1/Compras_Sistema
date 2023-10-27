
package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ajane
 */
public class ConexionSQL {
    
    static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=INGETEC";
    static final String USER = "Sa";
    static final String PASS = "luis123";

    public static Connection conectar() throws SQLException {
        
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
            //JOptionPane.showMessageDialog(null,"Conexion Exitosa a SQL Server");
           // System.out.println("Conexion Exitosa a SQL Server");
        } catch (SQLException e) {
            //System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Conexion Erronea a SQL Server");
        }

        return conn;
    }
    
    public static void desconectar(Connection conn) throws SQLException {
        if (conn != null && !conn.isClosed()) {
            conn.close();
            JOptionPane.showMessageDialog(null,"Desconexion Exitosa a SQL Server");
        }
    }
}
