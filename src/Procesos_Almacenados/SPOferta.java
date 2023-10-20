/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procesos_Almacenados;

import Conexion.ConexionSQL;
import Entidades.Oferta;
import Entidades.OfertaDetalle;
import Entidades.PedidoDetalle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ProcesosE
 */
public class SPOferta {
    
     public static void agregarOfertaEncabezado(Oferta oferta) {
         
        try (Connection conn = ConexionSQL.conectar()) {
            
            String sql = "EXEC [InsertarOfertaEncabezado] ?,?,?";
            
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, oferta.getID_PROVEEDOR());
            stmt.setInt(2, oferta.getID_PEDIDO());
            stmt.setString(3, oferta.getNOMBRE_PROVEEDOR());
            

            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Datos Agregados Correctamente");
            
        } catch (SQLException e) {
           
            System.out.println("error al enviar datos de oferta" + e);
        }
    }
     
     public static void agregarOfertaDetalle(OfertaDetalle ofertadetalle) {
         
        try (Connection conn = ConexionSQL.conectar()) {
            
            String sql = "EXEC [InsertarOfertaDetalle] ?,?,?,?,?,?";
            
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, ofertadetalle.getID_PRODUCTO());
            stmt.setString(2, ofertadetalle.getNOMBRE_PRODUCTO());
            stmt.setString(3, ofertadetalle.getDESCRIPCION_PRODUCTO());
            stmt.setInt(4, ofertadetalle.getCANTIDAD());
            stmt.setInt(5, ofertadetalle.getPRECIO());
            stmt.setInt(6, ofertadetalle.getPRECIO_UNIDAD());
            

            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Datos Agregados Correctamente");
            
        } catch (SQLException e) {
           
            System.out.println("error al enviar datos de oferta DETALLE" + e);
        }
    }
    
}
