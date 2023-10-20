/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procesos_Almacenados;

import Conexion.ConexionSQL;
import Entidades.Oferta;
import Entidades.OfertaDetalle;
import Entidades.OrdenCompra;
import Entidades.OrdenCompraDetalle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ProcesosE
 */
public class SPOrden {
    
    public static void agregarOrdenEncabezado(OrdenCompra ordencompra) {
         
        try (Connection conn = ConexionSQL.conectar()) {
            
            String sql = "EXEC [InsertarOrdenCompraEncabezado] ?,?,?,?,?,?,?,?";
            
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, ordencompra.getID_PEDIDO());
            stmt.setInt(2, ordencompra.getID_ADJUDICACION());
            stmt.setInt(3, ordencompra.getID_PROVEEDOR());
            stmt.setString(4, ordencompra.getTIPO_ORDEN());
            stmt.setString(5, ordencompra.getDESCRIPCION());
            stmt.setString(6, ordencompra.getPRIORIDAD());
            stmt.setString(7, ordencompra.getDIRECCION_ENTREGA());
            stmt.setInt(8, ordencompra.getTOTAL());
            
            

            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Datos Agregados Correctamente");
            
        } catch (SQLException e) {
           
            System.out.println("error al enviar datos de ORDEN" + e);
        }
    }
    
     
     public static void agregarOrdenDetalle(OrdenCompraDetalle ordencompradetalle) {
         
        try (Connection conn = ConexionSQL.conectar()) {
            
            String sql = "EXEC [InsertarOrdenCompraDetalle] ?,?,?,?,?,?";
            
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, ordencompradetalle.getID_PRODUCTO());
            stmt.setString(2, ordencompradetalle.getNOMBRE_PRODUCTO());
            stmt.setString(3, ordencompradetalle.getDESCRIPCION_PRODUCTO());
            stmt.setInt(4, ordencompradetalle.getCANTIDAD());
            stmt.setInt(5, ordencompradetalle.getPRECIO());
            stmt.setInt(6, ordencompradetalle.getPRECIO_UNIDAD());
            

            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Datos Agregados Correctamente");
            
        } catch (SQLException e) {
           
            System.out.println("error al enviar datos de orden DETALLE" + e);
        }
    }
    
}
