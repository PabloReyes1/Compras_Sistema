/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import Conexion.ConexionSQL;
import Entidades.Oferta;
import Entidades.OfertaDetalle;
import Entidades.PedidoDetalle;
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
public class Ofertas {
        
        Connection conn = null;   
    
    ResultSet rs;
    Statement st;
        
    public ArrayList<Oferta> obtenerOfertaEncabezado(int idPedidoEncabezado){
    ArrayList<Oferta> datosOfertaEncabezado = new ArrayList<>();
    
    try{
        conn = ConexionSQL.conectar();
        
        String qry = "SELECT * FROM OFERTA_ENCABEZADO WHERE ID_PEDIDO = ?";
        PreparedStatement ps = conn.prepareStatement(qry);
            ps.setInt(1, idPedidoEncabezado);
            rs = ps.executeQuery();
        
        while (rs.next()) {
                Oferta ofertaencabezado = new Oferta();
                
                ofertaencabezado.setID_OFERTA(rs.getInt("ID_OFERTA"));
                ofertaencabezado.setID_PROVEEDOR(rs.getInt("ID_PROVEEDOR"));
                ofertaencabezado.setID_PEDIDO(rs.getInt("ID_PEDIDO"));
                ofertaencabezado.setNOMBRE_PROVEEDOR(rs.getString("NOMBRE_PROVEEDOR"));
                ofertaencabezado.setFECHA_CREACION(rs.getDate("FECHA_CREACION"));
                ofertaencabezado.setESTADO(rs.getString("ESTADO"));
                
                datosOfertaEncabezado.add(ofertaencabezado);
                
            }
        
    } catch(SQLException e) {
    
        System.out.println("error" + e);
    }
    return datosOfertaEncabezado;
    }
    
    
        
    public ArrayList<Oferta> obtenerDatosOferta(int idPedidoEncabezado){
    ArrayList<Oferta> datosOferta = new ArrayList<>();
    
    try{
        conn = ConexionSQL.conectar();
        
        String qry = "SELECT ID_PROVEEDOR, NOMBRE_PROVEEDOR, ID_PEDIDO FROM OFERTA_ENCABEZADO WHERE ID_OFERTA = ?";
        PreparedStatement ps = conn.prepareStatement(qry);
            ps.setInt(1, idPedidoEncabezado);
            rs = ps.executeQuery();
        
        while (rs.next()) {
                Oferta datooferta = new Oferta();
                
                datooferta.setID_PROVEEDOR(rs.getInt("ID_PROVEEDOR"));
                datooferta.setID_PEDIDO(rs.getInt("ID_PEDIDO"));
                datooferta.setNOMBRE_PROVEEDOR(rs.getString("NOMBRE_PROVEEDOR"));
               
                datosOferta.add(datooferta);
                
            }
        
    } catch(SQLException e) {
    
        System.out.println("error" + e);
    }
    return datosOferta;
    }
    
    public ArrayList<OfertaDetalle> obtenerOfertaDetalle(int idOferta){
    ArrayList<OfertaDetalle> obtenerOfertaDetalle = new ArrayList<>();
    
    try{
        conn = ConexionSQL.conectar();
        
        String qry = "SELECT * FROM OFERTA_DETALLE WHERE ID_OFERTA_ENCABEZADO = ?";
        PreparedStatement ps = conn.prepareStatement(qry);
            ps.setInt(1, idOferta);
            rs = ps.executeQuery();
        
        while (rs.next()) {
                OfertaDetalle ofertadetalle = new OfertaDetalle();
                
                ofertadetalle.setID_PRODUCTO(rs.getInt("ID_PRODUCTO"));
                ofertadetalle.setNOMBRE_PRODUCTO(rs.getString("NOMBRE_PRODUCTO"));
                ofertadetalle.setDESCRIPCION_PRODUCTO(rs.getString("DESCRIPCION_PRODUCTO"));
                ofertadetalle.setCANTIDAD(rs.getInt("CANTIDAD"));
                ofertadetalle.setPRECIO(rs.getInt("PRECIO"));
                ofertadetalle.setPRECIO_UNIDAD(rs.getInt("PRECIO_UNIDAD"));
                
                obtenerOfertaDetalle.add(ofertadetalle);
                
            }
        
    } catch(SQLException e) {
    
        System.out.println("error" + e);
    }
    return obtenerOfertaDetalle;
    }
    
}
