
package Conexion;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;


public class ConexionPost {
    
    private String host; 
    private String port;
    private String url;
    private String bd;
    private String usuario;
    private String password;
    private String clase;
    static Properties config = new Properties();
    
    public ConexionPost(){
        
        try{
            InputStream in =null;
            in = Files.newInputStream(FileSystems.getDefault().getPath("C:\\ConexionesBD\\configuracion.properties") );
            config.load(in);
            in.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        loadProperties();
    }
    
     public void loadProperties(){
        setHost(config.getProperty("hostname"));
        setPort(config.getProperty("port"));
        setBd(config.getProperty("database"));
        setUsuario(config.getProperty("username"));
        setPassword(config.getProperty("password"));
        setClase(config.getProperty("driver"));
    }
     
    public Connection getConnection() throws SQLException {
        Connection conn = null;
        String url= "jdbc:postgresql://"+getHost()+":"+getPort()+"/"+getBd();
        conn = DriverManager.getConnection(url,getUsuario(),getPassword());
        JOptionPane.showMessageDialog(null,"Conexion Exitosa a PostgreSQL");
        return conn;
    }
    
    
    public static void desconectar(Connection conn) throws SQLException {
        if (conn != null && !conn.isClosed()) {
            JOptionPane.showMessageDialog(null,"Desconexion Exitosa a PostgreSQL");
            conn.close();

        }
    }

    /**
     * @return the host
     */
    public String getHost() {
        return host;
    }

    /**
     * @param host the host to set
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * @return the port
     */
    public String getPort() {
        return port;
    }

    /**
     * @param port the port to set
     */
    public void setPort(String port) {
        this.port = port;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the bd
     */
    public String getBd() {
        return bd;
    }

    /**
     * @param bd the bd to set
     */
    public void setBd(String bd) {
        this.bd = bd;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the clase
     */
    public String getClase() {
        return clase;
    }

    /**
     * @param clase the clase to set
     */
    public void setClase(String clase) {
        this.clase = clase;
    }
    
}
