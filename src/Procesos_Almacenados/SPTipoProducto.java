/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos_Almacenados;

import Conexion.ConexionPost;
import Conexion.ConexionSQL;
import Entidades.Producto;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ajane
 */

public class SPTipoProducto {
    
    Connection con,conn;
    CallableStatement cts;
    ResultSet rst;
    Statement st;
    
    ConexionPost con1 = new ConexionPost();
    
    public SPTipoProducto() throws SQLException{
        
        this.con = con1.getConnection();
        this.conn = ConexionSQL.conectar();
    }
    
    public int idTipoProducto(String tipoProducto ){
        
        int idTP = -1;
        
        try {
            conn = ConexionSQL.conectar();

            String qry = "SELECT ID_TIPO_PRODUCTO FROM tipo_productos WHERE TIPO_PRODUCTO = ?";
            PreparedStatement ps = conn.prepareStatement(qry);
            ps.setString(1, tipoProducto);
            rst = ps.executeQuery();
            
            if (rst.next()) {
                idTP = rst.getInt("ID_TIPO_PRODUCTO");
            }

        } catch(SQLException e) {
            System.out.println("error" + e);
        }
        
        return idTP; 
    }
    
    public int idProducto(String nombre){
        
        int idP=-1;
        
        try {
            conn = ConexionSQL.conectar();

            String qry = "SELECT ID_PRODUCTO FROM productos WHERE nombre_producto = ?";
            PreparedStatement ps = conn.prepareStatement(qry);
            ps.setString(1, nombre);
            rst = ps.executeQuery();
            
            if (rst.next()) {
                idP = rst.getInt("ID_PRODUCTO");
            }

        } catch(SQLException e) {
            System.out.println("error" + e);
        }
        return idP;
    }
    
    public void insertarProductos(String nombre,String descripcion,String precio,int ipTPe ){
        
        try {
            //para sql server si es necesario usar las llaves para los procedimientos almacenados
            //ya que sin llaves da error y en postgres no se usa 
            
            cts = conn.prepareCall("{CALL insertarProductosTP(?,?,?,?)}");
            cts.setString(1,nombre);
            cts.setString(2,descripcion);
            cts.setDouble(3,Double.parseDouble(precio));
            cts.setInt(4, ipTPe);
            cts.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"PRODUCTO INGRESADO CORRECTAMENTE");
            
        } catch (SQLException e) {
            System.out.println(e);
        } 
    }
    
    public Producto mostrarProducto(String nombre) throws SQLException{
        
        Producto pto = new Producto();
        
        String  qry = "select*from PRODUCTOS where nombre_producto = '"+nombre+"'";
        
        st = conn.createStatement();
        rst = st.executeQuery(qry);

        if (rst.next()) {
            pto.setID_PRODUCTO(rst.getInt("ID_PRODUCTO"));
            pto.setDESCRIPCION(rst.getString("DESCRIPCION"));
            pto.setPRECIO(rst.getString("PRECIO"));
            
        }else{
            JOptionPane.showMessageDialog(null,"EL PRODUCTO NO EXISTE VERIFIQUE EL DATO");
        }
        return pto;
    }
   
    public void actualizarProducto(String idA,String nombre,String descripcion,String precio ){
        
        try {
            //para sql server si es necesario usar las llaves para los procedimientos almacenados
            //ya que sin llaves da error y en postgres no se usa 
            cts = conn.prepareCall("{CALL actualizarProducto(?,?,?,?)}");
            cts.setInt(1,Integer.parseInt(idA));
            cts.setString(2,nombre);
            cts.setString(3,descripcion);
            cts.setDouble(4,Double.parseDouble(precio));
            cts.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"PRODUCTO ACTUALIZADO CORRECTAMENTE NUEVO SP");
            
        } catch (SQLException e) {
            System.out.println(e);
        } 
    }
    
    public void actializarTP(int idP, int idTPP){
        
        try {
            //para sql server si es necesario usar las llaves para los procedimientos almacenados
            //ya que sin llaves da error y en postgres no se usa 
            cts = conn.prepareCall("{CALL actualizarProductoTP(?,?)}");
            cts.setInt(1,idP);
            cts.setInt(2,idTPP);
            cts.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println(e);
        } 
       
    }
    
    public String MTipoProducto(int idA){
        String NTipoP="";
        
        try {
            conn = ConexionSQL.conectar();

            String qry = "select tp.TIPO_PRODUCTO from tipo_productos as tp join  PRODUCTOS_X_TIPO_PRODUCTOS as ptp on ptp.ID_TIPO_PRODUCTO=tp.ID_TIPO_PRODUCTO\n" +
                            "and ptp.ID_PRODUCTO=?";
            
            PreparedStatement ps = conn.prepareStatement(qry);
            ps.setInt(1,idA);
            rst = ps.executeQuery();
            
            if (rst.next()) {
                NTipoP = rst.getString("TIPO_PRODUCTO");
            }

        } catch(SQLException e) {
            System.out.println("error" + e);
        }
        return NTipoP;
    }
    
    
    public void eliminarP(int idPE){
        try {
            cts = conn.prepareCall("{CALL eliminarProductosTP(?)}");
            cts.setInt(1,idPE);
            cts.executeUpdate();
            JOptionPane.showMessageDialog(null,"PRODUCTO ELIMINADO CORRECTAMENTE");
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
        
    public boolean validar(String nombre,String descripcion,String precio,String tipoP){
        
        if(nombre.isEmpty()){
            JOptionPane.showMessageDialog(null,"INGRESE EL NOMBRE DEL PRODUCTO");
            return false;
        }
        if(descripcion.isEmpty()){
            JOptionPane.showMessageDialog(null,"INGRESE LA DESCRIPCION DEL PRODUCTO");
            return false;
        }
        if(precio.isEmpty()){
            JOptionPane.showMessageDialog(null,"INGRESE EL PRECIO DEL PRODUCTO A ADQUIRIR");
            return false;
        }
        if(tipoP.equals("Seleccione un Articulo")){
            
            JOptionPane.showMessageDialog(null,"SELECCIONE UN TIPO DE ARTICULO");
            return false;
        }
        
        return true;
    }
    
    public boolean validarN(String nombre){
        
        if(nombre.isEmpty()){
            JOptionPane.showMessageDialog(null,"INGRESE EL NOMBRE DEL ARTICULO A VISUALIZAR");
            return false;
        }
        return true;
    }
    
    public boolean eliminar(String nombre){
        if(nombre.isEmpty()){
            JOptionPane.showMessageDialog(null,"INGRESE EL NOMBRE DEL PRODUCTO A ELIMINAR");
            return false;
        }
        return true;
    }
    
    public void limpiar(JPanel panel){
        for (Object o : panel.getComponents()) {
            
            if(o instanceof JTextField ){
                ((JTextField) o).setText("");
            }
        }
    }
    
    
}
