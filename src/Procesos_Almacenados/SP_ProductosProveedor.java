/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos_Almacenados;

import Conexion.ConexionPost;
import Conexion.ConexionSQL;
import Entidades.ProductoProveedor;
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
public class SP_ProductosProveedor {
    
    Connection con,conn;
    CallableStatement cts;
    ResultSet rst;
    Statement st;
    
    ConexionPost con1 = new ConexionPost();
    
    public SP_ProductosProveedor() throws SQLException{
        this.con = con1.getConnection();
        this.conn = ConexionSQL.conectar();
    }
    
    
    public int idProveedor(String nombreProve ){
        
        int idP = -1;
        
        try {
            conn = ConexionSQL.conectar();

            String qry = "SELECT ID_PROVEEDOR FROM proveedores WHERE NOMBRE_PROVEEDOR = ?";
            PreparedStatement ps = conn.prepareStatement(qry);
            ps.setString(1, nombreProve);
            rst = ps.executeQuery();
            
            if (rst.next()) {
                idP = rst.getInt("ID_PROVEEDOR");
            }

        } catch(SQLException e) {
            System.out.println("error" + e);
        }
        
        return idP; 
    }
    
    public int idProductoProveedor(String nombreProd ){
        
        int idProd = -1;
        
        try {
            conn = ConexionSQL.conectar();

            String qry = "SELECT id_producto FROM PROVEEDOR_PRODUCTOS WHERE nombre_producto = ?";
            PreparedStatement ps = conn.prepareStatement(qry);
            ps.setString(1, nombreProd);
            rst = ps.executeQuery();
            
            if (rst.next()) {
                idProd = rst.getInt("id_producto");
            }

        } catch(SQLException e) {
            System.out.println("error" + e);
        }
        
        return idProd; 
    }
    
    public void insertarProProve(int idProve,String nombre,String desc,String precU){
        try {
            //para sql server si es necesario usar las llaves para los procedimientos almacenados
            //ya que sin llaves da error y en postgres no se usa 
            
            cts = conn.prepareCall("{CALL insertarProductosProveedor(?,?,?,?)}");
            cts.setInt(1,idProve);
            cts.setString(2,nombre);
            cts.setString(3,desc);
            cts.setDouble(4,Double.parseDouble(precU));
            cts.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"PRODUCTO DE PROVEEDOR INGRESADO CORRECTAMENTE");
            
        } catch (SQLException e) {
            System.out.println(e);
        } 
    }
    
    
    public ProductoProveedor mostrarProducto(int IdProd,int idProv) throws SQLException{
        
        ProductoProveedor pto = new ProductoProveedor();
        
        String  qry = "select*from PROVEEDOR_PRODUCTOS where id_producto = '"+IdProd+"' and id_proveedor='"+idProv+"'";
        
        st = conn.createStatement();
        rst = st.executeQuery(qry);

        if (rst.next()) {
            
            pto.setIdproducto(rst.getInt("id_producto"));
            pto.setIdProveedor(rst.getInt("id_proveedor"));
            pto.setNombreProd(rst.getString("nombre_producto"));
            pto.setDescri(rst.getString("descripcion"));
            pto.setPrecio(rst.getString("precio_unitario"));
            
        }else{
            JOptionPane.showMessageDialog(null,"EL PRODUCTO NO EXISTE VERIFIQUE EL DATO");
        }
        return pto;
    }
    
    public void actualizarProductoProveedorr(String idP,int idProve,String nombre,String desc,String precU){
        try {
            //para sql server si es necesario usar las llaves para los procedimientos almacenados
            //ya que sin llaves da error y en postgres no se usa 
            
            cts = conn.prepareCall("{CALL actualizarProductosProveedor(?,?,?,?,?)}");
            cts.setInt(1,Integer.parseInt(idP));
            cts.setInt(2,idProve);
            cts.setString(3,nombre);
            cts.setString(4,desc);
            cts.setDouble(5,Double.parseDouble(precU));
            cts.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"PRODUCTO DE PROVEEDOR ACTUALIZADO CORRECTAMENTE");
            
        } catch (SQLException e) {
            System.out.println(e);
        } 
    }
    
    
    public boolean validar(String pro,String nombreprod,String desc,String precio){
        
        if(pro.equals("Seleccionar un proveedor")){
            JOptionPane.showMessageDialog(null,"ELIGA UN PROVEEDOR ");
            return false;
        }
        if(nombreprod.isEmpty()){
            JOptionPane.showMessageDialog(null,"INGRESE EL NOMBRE DEL PRODUCTO");
            return false;
        }
        if(desc.isEmpty()){
            JOptionPane.showMessageDialog(null,"INGRESE LA DESCRIPCION DEL PRODUCTO");
            return false;
        }
        if(precio.isEmpty()){
            JOptionPane.showMessageDialog(null,"INGRESE EL PRECIO DEL PRODUCTO");
            return false;
        }
        
        return true;
    }
    
    public boolean validarVer(String pro,String nombreprod){
    
        if(pro.equals("Seleccionar un proveedor")){
            JOptionPane.showMessageDialog(null,"ELIGA UN PROVEEDOR ");
            return false;
        }
        if(nombreprod.isEmpty()){
            JOptionPane.showMessageDialog(null,"INGRESE EL NOMBRE DEL PRODUCTO");
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
