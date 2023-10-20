/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procesos_Almacenados;

import Conexion.ConexionSQL;
import Entidades.Sucursal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class SPSucursales {
    
    
     public static void agregarSucursal(Sucursal sucursal) {

        try (Connection conn = ConexionSQL.conectar()) {

            String sql = "EXEC [SP_INGRESAR_SUCURSAL] ?,?,?,?,?,?";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, sucursal.getCIUDAD());
            stmt.setString(2, sucursal.getDEPARTAMENTO());
            stmt.setString(3, sucursal.getDIRECCION());
            stmt.setString(4, sucursal.getEMAIL());
            stmt.setInt(5, sucursal.getTELEFONO());
            stmt.setString(6, sucursal.getNOMBRE());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos Agregados Correctamente");

        } catch (SQLException e) {

            System.out.println("error al enviar datos de sucursal" + e);
        }
    }
    
}
