/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import Conexion.ConexionSQL;
import Entidades.Producto;
import Entidades.TipoProducto;
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
public class TipoProductos {
    
    Connection conn = null;   
    
    ResultSet rs;
    Statement st;
    
    public ArrayList<TipoProducto> obtenerTipoProductos(){
        
        ArrayList<TipoProducto> datosTProducto = new ArrayList<>();

        try {
            conn = ConexionSQL.conectar();

            String qry = "SELECT * FROM TIPO_PRODUCTOS";
            st = conn.createStatement();
            rs = st.executeQuery(qry);

            while (rs.next()) {
                TipoProducto tipoproducto = new TipoProducto();
                tipoproducto.setID_TIPO_PRODUCTO(rs.getInt("ID_TIPO_PRODUCTO"));
                tipoproducto.setTIPO_PRODUCTO(rs.getString("TIPO_PRODUCTO"));

                datosTProducto.add(tipoproducto);

            }

        } catch (SQLException e) {

            System.out.println("error" + e);
        }
        return datosTProducto;
    }
    
    
    public ArrayList<Producto> obtenerProductoPorTipodeProducto(int idSucursal){
        ArrayList<Producto> datoproducto = new ArrayList<>();
        try{
            conn = ConexionSQL.conectar();
            
            String qry = "SELECT * FROM PRODUCTOS WHERE ID_ = ?";
            PreparedStatement ps = conn.prepareStatement(qry);
            ps.setInt(1, idSucursal);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                Producto datoProducto = new Producto();
                datoProducto.setID_PRODUCTO(rs.getInt("ID_PRODUCTO"));
                datoProducto.setNOMBRE(rs.getString("NOMBRE"));
                datoProducto.setDESCRIPCION(rs.getString("DESCRIPCION"));
                datoProducto.setPRECIO(rs.getString("PRECIO"));
                
                datoproducto.add(datoProducto);
            }
            
        } catch(SQLException e) {
            System.out.println("error" + e);
        }
        return datoproducto;
    }
    
}
