/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import Conexion.ConexionSQL;
import Entidades.Proveedor;
import Entidades.TProveedor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ajane
 */
public class TipoProveedor {
    
    Connection conn = null;   
    
    ResultSet rs;
    Statement st;
    
    public ArrayList<TProveedor> ObtenerTipoProveedor(){
        ArrayList<TProveedor> tpP = new ArrayList<>();
    
        try{
            conn = ConexionSQL.conectar();

            String qry = "select*from tipo_proveedores";
            st = conn.createStatement();
            rs = st.executeQuery(qry);

            while (rs.next()) {
                    TProveedor tp = new TProveedor();
                    tp.setIdTP(rs.getInt("ID_TIPO_PROVEEDOR"));
                    tp.setNombreProveedor(rs.getString("NOMBRE_TIPO_PROVEEDOR"));
                    tp.setDescripcionProveedor(rs.getString("DESCRIPCION"));
            
                    tpP.add(tp);
                }

        } catch(SQLException e) {

            System.out.println("error" + e);
        }
        return tpP;
    }
    
    public ArrayList<Proveedor> ObtenerProveedores() throws SQLException{
        
        ArrayList<Proveedor> pro = new ArrayList<>();
        
            try{
            conn = ConexionSQL.conectar();

            String qry = "select*from proveedores";
            st = conn.createStatement();
            rs = st.executeQuery(qry);

            while (rs.next()) {
                    Proveedor p = new Proveedor();
                   p.setIdProveedor(rs.getInt("ID_PROVEEDOR"));
                   p.setNombreP(rs.getString("NOMBRE_PROVEEDOR"));
                   p.setNit(rs.getInt("NIT"));
                   p.setDireccion(rs.getString("DIRECCION"));
                   p.setDescripcion(rs.getString("DESCRIPCION"));
                    pro.add(p);
                }

        } catch(SQLException e) {

            System.out.println("error" + e);
        }
        
        return pro;
    }
    
    
    
    
}
