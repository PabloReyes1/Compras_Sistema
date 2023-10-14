/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import Conexion.ConexionSQL;
import Entidades.Departamento;
import Entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ProcesosE
 */
public class Productos {
    Connection conn = null;   
    
    ResultSet rs;
    Statement st;
    
    public ArrayList<Producto> obtenerProductoPorTipoProducto(int idProducto){
        ArrayList<Producto> datoproducto = new ArrayList<>();
        
        try{
            conn = ConexionSQL.conectar();
            
            String qry = "SELECT * FROM PRODUCTOS WHERE ID_PRODUCTO = ?";
            PreparedStatement ps = conn.prepareStatement(qry);
            ps.setInt(1, idProducto);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                Producto datoProducto = new Producto();
                datoProducto.setID_PRODUCTO(rs.getInt("ID_PRODUCTO"));
                datoProducto.setNOMBRE(rs.getString("NOMBRE_PRODUCTO"));
                datoProducto.setDESCRIPCION(rs.getString("DESCRIPCION"));
                datoProducto.setPRECIO(rs.getDouble("PRECIO"));
                
                datoproducto.add(datoProducto);
            }
            
        } catch(SQLException e) {
            System.out.println("error" + e);
        }
        return datoproducto;
    }
    
    
     public ArrayList<Producto> obtenerProducto(int idProducto){
        ArrayList<Producto> datoproducto = new ArrayList<>();
        
        try{
            conn = ConexionSQL.conectar();
            
            String qry = "SELECT * FROM PRODUCTOS WHERE ID_PRODUCTO = ?";
            PreparedStatement ps = conn.prepareStatement(qry);
            ps.setInt(1, idProducto);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                Producto datoProducto = new Producto();
                datoProducto.setID_PRODUCTO(rs.getInt("ID_PRODUCTO"));
                datoProducto.setNOMBRE(rs.getString("NOMBRE_PRODUCTO"));
                datoProducto.setDESCRIPCION(rs.getString("DESCRIPCION"));
                datoProducto.setPRECIO(rs.getDouble("PRECIO"));
                
                datoproducto.add(datoProducto);
            }
            
        } catch(SQLException e) {
            System.out.println("error" + e);
        }
        return datoproducto;
    }
}
