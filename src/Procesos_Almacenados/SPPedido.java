/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procesos_Almacenados;

import Conexion.ConexionSQL;
import Entidades.Pedido;
import Entidades.PedidoDetalle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ProcesosE
 */
public class SPPedido {
    
    public static void agregarPedidoEncabezado(Pedido pedido) {
         
        try (Connection conn = ConexionSQL.conectar()) {
            
            String sql = "EXEC [INSERTAR_PEDIDO_ENCABEZADO] ?,?";
            
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, pedido.getID_DEPARTAMENTO_SUCURSAL());
            stmt.setString(2, pedido.getDESCRIPCION());
            

            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Datos Agregados Correctamente");
            
        } catch (SQLException e) {
           
            System.out.println("error al enviar datos de pedido" + e);
        }
    }
    
    public static void agregarPedidoDetalle(PedidoDetalle pedidodetalle) {
         
        try (Connection conn = ConexionSQL.conectar()) {
            
            String sql = "EXEC [INSERTAR_PEDIDO_DETALLE] ?,?,?,?";
            
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, pedidodetalle.getID_PRODUCTO());
            stmt.setString(2, pedidodetalle.getNOMBRE_PRODUCTO());
            stmt.setString(3, pedidodetalle.getDESCRIPCION_PRODUCTO());
            stmt.setInt(4, pedidodetalle.getCANTIDAD_SOLICITADA());
            

            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Datos Agregados Correctamente");
            
        } catch (SQLException e) {
           
            System.out.println("error al enviar datos de pedido DETALLE" + e);
        }
    }
    
}
