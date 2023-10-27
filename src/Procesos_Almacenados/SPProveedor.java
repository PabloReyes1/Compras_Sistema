/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos_Almacenados;

import Conexion.ConexionPost;
import Conexion.ConexionSQL;
import Entidades.Proveedor;
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
public class SPProveedor {
    
    Connection con,conn;
    CallableStatement cts;
    ResultSet rst;
    Statement st;
    
    ConexionPost con1 = new ConexionPost();
    
    public SPProveedor() throws SQLException{
        this.con = con1.getConnection();
        this.conn = ConexionSQL.conectar();
    }
    
    public int idTipoProveedor(String nomTP){
        
        int idTP=-1; 
        try {
            conn = ConexionSQL.conectar();

            String qry = "select ID_TIPO_PROVEEDOR from tipo_proveedores WHERE nombre_tipo_proveedor = ?";
            PreparedStatement ps = conn.prepareStatement(qry);
            ps.setString(1, nomTP);
            rst = ps.executeQuery();
            
            if (rst.next()) {
                idTP = rst.getInt("ID_TIPO_PROVEEDOR");
            }
        } catch(SQLException e) {
            System.out.println("error" + e);
        }
        return idTP;
    }
    
    public int idProveedor(String nitP){
        
        int idPA=-1;
        try {
            conn = ConexionSQL.conectar();

            String qry = "select id_proveedor from proveedores WHERE nit = ?";
            PreparedStatement ps = conn.prepareStatement(qry);
            ps.setString(1, nitP);
            rst = ps.executeQuery();
            
            if (rst.next()) {
                idPA = rst.getInt("id_proveedor");
            }
        } catch(SQLException e) {
            System.out.println("error" + e);
        }
        
        return idPA;
    }
    
    //creando el procedimiento almacenado para insertar proveedor
    
    public void insertarProveedor(String nombre,String nit,String direct,String descrip,int idTP){
        
        try {
            //para sql server si es necesario usar las llaves para los procedimientos almacenados
            //ya que sin llaves da error y en postgres no se usa 
            cts = conn.prepareCall("{CALL insertarProveedorTP(?,?,?,?,?)}");
            cts.setString(1,nombre);
            cts.setInt(2,Integer.parseInt(nit));
            cts.setString(3,direct);
            cts.setString(4, descrip);
            cts.setInt(5,idTP);
            cts.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"PROVEEDOR INGRESADO CORRECTAMENTE");
            
        } catch (SQLException e) {
            System.out.println(e);
        } 
    }
    
    public boolean validarVer(String nit){
        
        if(nit.isEmpty()){
            JOptionPane.showMessageDialog(null,"INGRESE EL NIT DEL PROVEEDOR A VISUALIZAR");
            return false;
        }
        return false;
    }
    
    public Proveedor mostrarProveedoresNit(int nit) throws SQLException{
        
        Proveedor pr = new Proveedor();
        
        String  qry = "Select * from proveedores where NIT = '"+nit+"'";
        
        st = conn.createStatement();
        rst = st.executeQuery(qry);

        if (rst.next()) {
            pr.setNombreP(rst.getString("NOMBRE_PROVEEDOR"));
            pr.setNit(rst.getInt("NIT"));
            pr.setDireccion(rst.getString("DIRECCION"));
            pr.setDescripcion(rst.getString("DESCRIPCION"));  
        }else{
            JOptionPane.showMessageDialog(null,"EL PROVEEDOR NO EXISTE");
        }
        return pr;
    }
   
    /*
    public Proveedor mostrarProveedoresNit(int nit) throws SQLException{
        
        Proveedor pr = new Proveedor();
        
        String  qry = "Select * from proveedores where NIT = '"+nit+"'";
        
        st = conn.createStatement();
        rst = st.executeQuery(qry);

        if (rst.next()) {
            pr.setNombreP(rst.getString("NOMBRE_PROVEEDOR"));
            pr.setNit(rst.getInt("NIT"));
            pr.setDireccion(rst.getString("DIRECCION"));
            pr.setDescripcion(rst.getString("DESCRIPCION"));  
        }else{
            JOptionPane.showMessageDialog(null,"EL PROVEEDOR NO EXISTE");
        }
        return pr;
    }
    */
    public String NombreTP(int idPro,int nitP){
        
        String ntp="";
        
        try {
            conn = ConexionSQL.conectar();

            String qry = "select tp.NOMBRE_TIPO_PROVEEDOR from tipo_proveedores as tp join PROVEEDORES_X_TIPO_PROVEEDORES as ptp on\n" +
            "tp.ID_TIPO_PROVEEDOR=ptp.ID_TIPO_PROVEEDOR join proveedores as p on ptp.ID_PROVEEDOR=? and p.NIT= ?";
            
            PreparedStatement ps = conn.prepareStatement(qry);
            ps.setInt(1, idPro);
            ps.setInt(2,nitP);
            rst = ps.executeQuery();
            
            if (rst.next()) {
                ntp = rst.getString("NOMBRE_TIPO_PROVEEDOR");
            }

        } catch(SQLException e) {
            System.out.println("error" + e);
        }
        
        return ntp;
    }
    
    
    public void actualizarProveedorA(String nit,String nombre,String direc,String descrip){
        
        try {
            //para sql server si es necesario usar las llaves para los procedimientos almacenados
            //ya que sin llaves da error y en postgres no se usa 
            cts = conn.prepareCall("{CALL actualizarProveedor(?,?,?,?)}");
            cts.setString(1,nombre);
            cts.setInt(2,Integer.parseInt(nit));
            cts.setString(3,direc);
            cts.setString(4,descrip);
            cts.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"PROVEEDOR ACTUALIZADO CORRECTAMENTE");
            
        } catch (SQLException e) {
            System.out.println(e);
        } 
    }
    
    public void actualizarProveedorTPA(int idP,int idTP){
        
        try {
            //para sql server si es necesario usar las llaves para los procedimientos almacenados
            //ya que sin llaves da error y en postgres no se usa 
            cts = conn.prepareCall("{CALL actualizarProveedorTP(?,?)}");
            cts.setInt(1,idP);
            cts.setInt(2,idTP);
            cts.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println(e);
        } 
        
    }
    
    public void borrarProveedor(int idP){
        try {
            //para sql server si es necesario usar las llaves para los procedimientos almacenados
            //ya que sin llaves da error y en postgres no se usa 
            cts = conn.prepareCall("{CALL eliminarProveedoryTP(?)}");
            cts.setInt(1,idP);
            cts.executeUpdate();
            JOptionPane.showMessageDialog(null,"PROVEEDOR ELIMINADO CORRECTAMENTE");
            
        } catch (SQLException e) {
            System.out.println(e);
        } 
    }
    
    public boolean valida(String nit,String nom,String direc,String descrip,String tp){
       
       if(nit.isEmpty()){
           JOptionPane.showMessageDialog(null,"INGRESE EL NUMERO DE NIT DEL PROVEEDOR");
           return false;
       }
       
       if(!nit.isEmpty() && nit.length()>7 || !nit.isEmpty() && nit.length()<7){   
           
            JOptionPane.showMessageDialog(null,"TAMAÑO DEL NIT DEL PROVEEDOR INCORRECTO, DEBE SER DE 7 DIGITOS");
            return false;
        }
       if(nom.isEmpty()){
           JOptionPane.showMessageDialog(null,"INGRESE EL NOMBRE DEL PROVEEDOR");
           return false;
       }
       if(descrip.isEmpty()){
           JOptionPane.showMessageDialog(null,"INGRESE LA DESCRIPCION DEL PROVEEDOR");
           return false;
       }
       if(tp.equals("Seleccionar")){
           JOptionPane.showMessageDialog(null,"ELIGA UN TIPO DE PROVEEDOR");
           return false;
       }
       return true;
    }
    
    public boolean validarE(String nit){
        if(nit.isEmpty()){
            JOptionPane.showMessageDialog(null,"INGRESE EL NUMERO DE NIT DEL PROVEEDOR QUE DESEE ELIMINAR");
           return false;
        }
        return true;
    }
    
    public boolean validarBusqueda(String nit){
        if(nit.isEmpty()){
            JOptionPane.showMessageDialog(null,"INGRESE EL NUMERO DE NIT DEL PROVEEDOR QUE DESEA VISUALIZAR");
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
