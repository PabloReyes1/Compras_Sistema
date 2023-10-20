/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import Conexion.ConexionSQL;
import Entidades.Departamento;
import Entidades.Pedido;
import Entidades.Proveedor;
import Entidades.Proveedor1;
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
public class Proveedores {
    
    Connection conn = null;   
    
    ResultSet rs;
    Statement st;
    
    public ArrayList<Proveedor1> obtenerProveedor(){
    ArrayList<Proveedor1> datosProveedor = new ArrayList<>();
    
    try{
        conn = ConexionSQL.conectar();
        
        String qry = "SELECT * FROM PROVEEDORES";
        st = conn.createStatement();
        rs = st.executeQuery(qry);
        
        while (rs.next()) {
                Proveedor1 proveedor = new Proveedor1();
                
                proveedor.setID_PROVEEDOR(rs.getInt("ID_PROVEEDOR"));
                proveedor.setNOMBRE_PROVEEDOR(rs.getString("NOMBRE_PROVEEDOR"));
                proveedor.setNIT(rs.getInt("NIT"));
                proveedor.setDIRECCION(rs.getString("DIRECCION"));
                proveedor.setDESCRIPCION(rs.getString("DESCRIPCION"));
                
                datosProveedor.add(proveedor);
                
            }
        
    } catch(SQLException e) {
    
        System.out.println("error" + e);
    }
    return datosProveedor;
    }
    
    public ArrayList<Proveedor1> obtenerNombreProveedor(int idProveedor){
        ArrayList<Proveedor1> nombreproveedor = new ArrayList<>();
        
        try{
            conn = ConexionSQL.conectar();
            
            String qry = "SELECT * FROM PROVEEDORES WHERE ID_PROVEEDOR = ?";
            PreparedStatement ps = conn.prepareStatement(qry);
            ps.setInt(1, idProveedor);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                Proveedor1 nombreProveedor = new Proveedor1();
                nombreProveedor.setID_PROVEEDOR(rs.getInt("ID_PROVEEDOR"));
                nombreProveedor.setNOMBRE_PROVEEDOR(rs.getString("NOMBRE_PROVEEDOR"));
                nombreProveedor.setNIT(rs.getInt("NIT"));
                nombreProveedor.setDIRECCION(rs.getString("DIRECCION"));
                nombreProveedor.setDESCRIPCION(rs.getString("DESCRIPCION"));
                
                nombreproveedor.add(nombreProveedor);
            }
            
        } catch(SQLException e) {
            System.out.println("error" + e);
        }
        return nombreproveedor;
    }
    
}
