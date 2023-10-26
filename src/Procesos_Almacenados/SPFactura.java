/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos_Almacenados;

import Conexion.ConexionSQL;

import java.sql.CallableStatement;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author ProcesosE
 */
public class SPFactura {

   
    
    CallableStatement cs;
    
    public static void mostrarProductosEnTabla(JTable tabla_productos) {
        try (Connection conn = ConexionSQL.conectar()) {
            String sql = "EXEC [ObtenerProductos]"; 
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();
            
            // Crear un modelo de tabla
            DefaultTableModel tableModel = new DefaultTableModel();
            
            // Agregar columnas al modelo
            tableModel.addColumn("ID");
            tableModel.addColumn("Nombre");
            tableModel.addColumn("Descripción");
            tableModel.addColumn("Precio");
           
            tabla_productos.setModel(tableModel);
            // Agregar filas al modelo
            while (resultSet.next()) {
                Object[] row = new Object[4];
                row[0] = resultSet.getInt("id_producto");
                row[1] = resultSet.getString("nombre_producto");
                row[2] = resultSet.getString("descripcion");
                row[3] = resultSet.getDouble("precio");
                tableModel.addRow(row);
            }
            
            // Establecer el modelo de tabla en la tabla proporcionada
            tabla_productos.setModel(tableModel);
        } catch (SQLException e) {
            System.out.println("Error al obtener productos: " + e);
        }
   }
    

public static int insertarFacturas(int idProveedor, int idSucursal, String estado, String numeroFactura, int idProducto, String nombreProducto, double precioTotal, int cantidad, double precioUnitario) {
    try (Connection conn = ConexionSQL.conectar()) {
        // Llamar al procedimiento almacenado
        String sql = "{CALL CrearFactura(?, ?, ?, ?, ?, ?, ?, ?, ?)}";
        try (CallableStatement stmt = conn.prepareCall(sql)) {
            stmt.setInt(1, idProveedor);
            stmt.setInt(2, idSucursal);
            stmt.setString(3, estado);  // Estado
            stmt.setString(4, numeroFactura);  // Número de factura único
            stmt.setInt(5, idProducto);
            stmt.setString(6, nombreProducto);  // Nombre del producto
            stmt.setDouble(7, precioTotal);
            stmt.setInt(8, cantidad);
            stmt.setDouble(9, precioUnitario);
            
            stmt.executeUpdate();
        }
    } catch (SQLException e) {
        System.out.println("Error al crear la factura: " + e);
        return -1; // Si hay un error
    }
    return 1; // Éxito
}

public static void cargarDatosFactura(JTable table) {
    DefaultTableModel model = new DefaultTableModel(); // Crear un nuevo modelo de tabla

    // Agregar columnas al modelo
    model.addColumn("No. Factura");
    model.addColumn("ID Proveedor");
    model.addColumn("ID Sucursal");
    model.addColumn("Fecha");
    model.addColumn("Estado");
    model.addColumn(" Total");

    try (Connection conn = ConexionSQL.conectar()) {
        String sql = "{CALL REGISTROFACTURAS}";
        try (CallableStatement stmt = conn.prepareCall(sql)) {
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                Object[] rowData = new Object[6];
                rowData[0] = resultSet.getString("no_factura");
                rowData[1] = resultSet.getInt("id_proveedor");
                rowData[2] = resultSet.getInt("id_sucursal");
                rowData[3] = resultSet.getDate("fecha");
                rowData[4] = resultSet.getString("estado");
                rowData[5] = resultSet.getDouble("total_precio_total");
                model.addRow(rowData); // Agregar fila al modelo
            }
        }
    } catch (SQLException e) {
        System.out.println("Error al MOSTRAR la factura: " + e);
    }

    table.setModel(model); // Establecer el modelo de tabla en la tabla proporcionada
}

public static void cargarDatos(JTable table, String noFactura) {
    DefaultTableModel model = new DefaultTableModel(); // Crear un nuevo modelo de tabla

    // Agregar columnas al modelo
    model.addColumn("Cantidad");
    model.addColumn("ID Producto");
    model.addColumn("Nombre Producto");
    model.addColumn("Precio Unitario");

    try (Connection conn = ConexionSQL.conectar()) {
        // Llamar al procedimiento almacenado MostrarDetallesFactura
        String sql = "{CALL MostrarDetallesFactura(?)}";
        try (CallableStatement stmt = conn.prepareCall(sql)) {
            stmt.setString(1, noFactura); // Pasar el número de factura como parámetro
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                Object[] rowData = new Object[4];
                rowData[0] = resultSet.getInt("cantidad");
                rowData[1] = resultSet.getInt("id_producto");
                rowData[2] = resultSet.getString("nombre_producto");
                rowData[3] = resultSet.getDouble("precio_unitario");
                model.addRow(rowData); // Agregar fila al modelo
            }
        }
    } catch (SQLException e) {
        System.out.println("Error al mostrar la factura: " + e);
    }

    table.setModel(model); // Establecer el modelo de tabla en la tabla proporcionada
}
public static void mostrarDatosFacturaEnTextField(JTextField txtProveedor, JTextField txtSucursal, JTextField txtEstado, JTextField txtFecha, JTextField txtPrecioTotal, String noFactura) {
    try (Connection conn = ConexionSQL.conectar()) {
        String sql = "EXEC DATOSFACTURA ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, noFactura);
        ResultSet resultSet = stmt.executeQuery();

        if (resultSet.next()) {
            // Actualiza los campos de texto con los resultados
            txtProveedor.setText(resultSet.getString("id_proveedor"));
            txtSucursal.setText(resultSet.getString("id_sucursal"));
            txtEstado.setText(resultSet.getString("estado"));
            txtFecha.setText(resultSet.getString("fecha"));
            txtPrecioTotal.setText(resultSet.getString("precio_total"));
        } else {
            // Si no se encontraron resultados, puedes manejarlo adecuadamente
            txtProveedor.setText("");
            txtSucursal.setText("");
            txtEstado.setText("");
            txtFecha.setText("");
            txtPrecioTotal.setText("");
        }
    } catch (SQLException e) {
        System.out.println("Error al obtener datos de factura: " + e);
    }
}
 public static int buscarIdProveedor(String nombreProveedor) {
        try (Connection conn = ConexionSQL.conectar()) {
            // Llama al procedimiento almacenado BuscarProveedorYSucursal
            CallableStatement cstmt = conn.prepareCall("{CALL BuscarProveedorYSucursal(?, ?)}");
            cstmt.setString(1, nombreProveedor);
            cstmt.setString(2, "");  // Deja en blanco para la sucursal

            ResultSet rs = cstmt.executeQuery();

            if (rs.next()) {
                return rs.getInt("id_proveedor");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return -1; // En caso de error o no encontrar resultados
    }

    public static int buscarIdSucursal(String nombreSucursal) {
        try (Connection conn = ConexionSQL.conectar()) {
            // Llama al procedimiento almacenado BuscarProveedorYSucursal
            CallableStatement cstmt = conn.prepareCall("{CALL BuscarProveedorYSucursal(?, ?)}");
            cstmt.setString(1, "");  // Deja en blanco para el proveedor
            cstmt.setString(2, nombreSucursal);

            ResultSet rs = cstmt.executeQuery();

            if (rs.next()) {
                return rs.getInt("id_sucursal");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return -1; // En caso de error o no encontrar resultados
    }
    
     public static void ejecutarProcedimientoAlmacenado(String noFactura) {
        try (Connection conn = ConexionSQL.conectar()) {
            String sql = "{call CambiarEstadoFacturas(?)}";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, noFactura);

            stmt.execute();   
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}


