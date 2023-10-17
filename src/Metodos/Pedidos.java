/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import Conexion.ConexionSQL;
import Entidades.Departamento;
import Entidades.Pedido;
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
public class Pedidos {
    
    Connection conn = null;   
    
    ResultSet rs;
    Statement st;
    
    public ArrayList<Pedido> obtenerPedido(){
    ArrayList<Pedido> datosPedido = new ArrayList<>();
    
    try{
        conn = ConexionSQL.conectar();
        
        String qry = "SELECT * FROM PEDIDO_ENCABEZADO";
        st = conn.createStatement();
        rs = st.executeQuery(qry);
        
        while (rs.next()) {
                Pedido pedido = new Pedido();
//                pedido.setID_DEPARTAMENTO_SUCURSAL(rs.getInt("ID_DEPARTAMENTO_SUCURSAL"));
                pedido.setID_PEDIDO(rs.getInt("ID_PEDIDO"));
                pedido.setID_DEPARTAMENTO_SUCURSAL(rs.getInt("ID_DEPARTAMENTO_SUCURSAL"));
                pedido.setDESCRIPCION(rs.getString("DESCRIPCION"));
                pedido.setFECHA_CREACION(rs.getDate("FECHA_CREACION"));
//                pedido.setFECHA_EXPIRACION(rs.getDate("FECHA_EXPIRACION"));
                pedido.setESTADO(rs.getString("ESTADO"));
//                pedido.setNOMBRE_PRODUCTO(rs.getString("NOMBRE_PRODUCTO"));
//                pedido.setDESCRIPCION_PEDIDO(rs.getString("DESCRIPCION_PRODUCTO"));
//                pedido.setCANTIDAD(rs.getInt("CANTIDAD"));
                
                datosPedido.add(pedido);
                
            }
        
    } catch(SQLException e) {
    
        System.out.println("error" + e);
    }
    return datosPedido;
    }
    
    public ArrayList<Departamento> obtenerDepartamentosPorSucursal(int idSucursal){
        ArrayList<Departamento> departamentosucu = new ArrayList<>();
        
        try{
            conn = ConexionSQL.conectar();
            
            String qry = "SELECT * FROM DEPARTAMENTO_SUCURSAL WHERE ID_SUCURSAL = ?";
            PreparedStatement ps = conn.prepareStatement(qry);
            ps.setInt(1, idSucursal);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                Departamento departamentosSucu = new Departamento();
                departamentosSucu.setID_DEPARTAMENTO_SUCURSAL(rs.getInt("ID_DEPARTAMENTO_SUCURSAL"));
                departamentosSucu.setID_SUCURSAL(rs.getInt("ID_SUCURSAL"));
                departamentosSucu.setNOMBRE_DEPARTAMENTO(rs.getString("NOMBRE_DEPARTAMENTO"));
                departamentosSucu.setDESCRIPCION(rs.getString("DESCRIPCION"));
                departamentosSucu.setPERSONAL(rs.getInt("PERSONAL_TRABAJANDO"));
                
                departamentosucu.add(departamentosSucu);
            }
            
        } catch(SQLException e) {
            System.out.println("error" + e);
        }
        return departamentosucu;
    }
    
    public ArrayList<PedidoDetalle> obtenerPedidoDetalle(int idPedidoDetalle){
    ArrayList<PedidoDetalle> datosPedidoDetalle = new ArrayList<>();
    
    try{
        conn = ConexionSQL.conectar();
        
        String qry = "SELECT * FROM PEDIDO_DETALLE WHERE ID_PEDIDO = ?";
        PreparedStatement ps = conn.prepareStatement(qry);
            ps.setInt(1, idPedidoDetalle);
            rs = ps.executeQuery();
        
        while (rs.next()) {
                PedidoDetalle pedidodetalle = new PedidoDetalle();
                
                pedidodetalle.setID_PEDIDO_DETALLE(rs.getInt("ID_PEDIDO_DETALLE"));
                pedidodetalle.setID_PEDIDO(rs.getInt("ID_PEDIDO"));
                pedidodetalle.setID_PRODUCTO(rs.getInt("ID_PRODUCTO"));
                pedidodetalle.setNOMBRE_PRODUCTO(rs.getString("NOMBRE_PRODUCTO"));
                pedidodetalle.setDESCRIPCION_PRODUCTO(rs.getString("DESCRIPCION_PRODUCTO"));
                pedidodetalle.setCANTIDAD_SOLICITADA(rs.getInt("CANTIDAD_SOLICITADA"));
                
                datosPedidoDetalle.add(pedidodetalle);
                
            }
        
    } catch(SQLException e) {
    
        System.out.println("error" + e);
    }
    return datosPedidoDetalle;
    }
    
}
