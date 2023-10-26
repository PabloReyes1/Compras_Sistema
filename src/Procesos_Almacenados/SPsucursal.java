/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos_Almacenados;

import Conexion.ConexionSQL;
import Entidades.Sucursal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 50258
 */
public class SPsucursal {
public static void mostrarSucursalesEnTabla(JTable tabla_sucursales) {
    try (Connection conn = ConexionSQL.conectar()) {
        String sql = "EXEC obtenerSucursales";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet resultSet = stmt.executeQuery();

        // Crear un modelo de tabla
        DefaultTableModel tableModel = new DefaultTableModel();

        // Agregar columnas al modelo
        tableModel.addColumn("ID_SUCURSAL");
        tableModel.addColumn("CIUDAD");
        tableModel.addColumn("DEPARTAMENTO");
        tableModel.addColumn("DIRECCION");
        tableModel.addColumn("EMAIL");
        tableModel.addColumn("TELEFONO");
        tableModel.addColumn("NOMBRE");

        tabla_sucursales.setModel(tableModel);

        // Agregar filas al modelo
        while (resultSet.next()) {
            Object[] row = new Object[7];
            row[0] = resultSet.getInt("ID_SUCURSAL");
            row[1] = resultSet.getString("CIUDAD");
            row[2] = resultSet.getString("DEPARTAMENTO");
            row[3] = resultSet.getString("DIRECCION");
            row[4] = resultSet.getString("EMAIL");
            row[5] = resultSet.getString("TELEFONO");
            row[6] = resultSet.getString("NOMBRE");

            tableModel.addRow(row);
        }

        // Establecer el modelo de tabla en la tabla proporcionada
        tabla_sucursales.setModel(tableModel);
    } catch (SQLException e) {
        System.out.println("Error al obtener sucursales: " + e);
    }
}

public static void CargarComboSucursales (JComboBox<String> comboBox) {
    try (Connection conn = ConexionSQL.conectar()) {
        String sql = "SELECT NOMBRE FROM sucursales";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        comboBox.removeAllItems();
        comboBox.addItem("Seleccione sucursal:");
        while (rs.next()) {
            String NOMBRE = rs.getString("NOMBRE") ;
            comboBox.addItem(NOMBRE);
        }
    } catch (SQLException e) {
        System.out.println("¡Error al cargar sucursal! " + e);
    }
}
public static void CargarComboProveedores(JComboBox<String> comboBox) {
    try (Connection conn = ConexionSQL.conectar()) {
        String sql = "SELECT NOMBRE_PROVEEDOR FROM PROVEEDORES";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        comboBox.removeAllItems();
        comboBox.addItem("Seleccione proveedor:");
        while (rs.next()) {
            String NOMBRE_PROVEEDOR = rs.getString("NOMBRE_PROVEEDOR") ;
            comboBox.addItem(NOMBRE_PROVEEDOR);
        }
    } catch (SQLException e) {
        System.out.println("¡Error al cargar proveedor! " + e);
    }
}

   

}
