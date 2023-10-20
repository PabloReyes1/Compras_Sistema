/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procesos_Almacenados;

import Conexion.ConexionSQL;
import Entidades.Adjudicacion;
import Entidades.Oferta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ProcesosE
 */
public class SPAdjudicacion {
    
    public static void agregarOfertaEncabezado(Adjudicacion adjudicacion) {
         
        try (Connection conn = ConexionSQL.conectar()) {
            
            String sql = "EXEC [InsertarAdjudicacion] ?,?";
            
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, adjudicacion.getID_OFERTA());
            stmt.setString(2, adjudicacion.getTIPO_ADJUDICACION());
            

            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Datos Agregados Correctamente");
            
        } catch (SQLException e) {
           
            System.out.println("error al enviar datos de oferta" + e);
        }
    }
    
}
