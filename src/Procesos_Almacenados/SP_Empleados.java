/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos_Almacenados;


import Conexion.ConexionSQL;
import Entidades.Empleados;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ajane
 */

public class SP_Empleados {
    
    Connection conn;
    CallableStatement cts;
    ResultSet rst;
    Statement st;
    
    //ConexionPost con1 = new ConexionPost();
    
    
    public SP_Empleados() throws SQLException{
        
        //this.con = con1.getConnection();
        
        this.conn = ConexionSQL.conectar();
    }
    
    // Creando los diferentes metodos para poder hacer las peticiones a la BD
    
    public void insertarEmpleados(String nombres,String apellidos,int iddepto,String puesto,String salario,String direccion,String telefono,String correo,String dpi){
        
        try {
            //para sql server si es necesario usar las llaves para los procedimientos almacenados
            //ya que sin llaves da error y en postgres no se usa 
            
            cts = conn.prepareCall("{CALL ingresoEmpleados(?,?,?,?,?,?,?,?,?)}");
            cts.setString(1,nombres);
            cts.setString(2,apellidos);
            cts.setInt(3,iddepto);
            cts.setString(4,puesto);
            cts.setInt(5,Integer.parseInt(salario));
            cts.setString(6,direccion);
            cts.setInt(7,Integer.parseInt(telefono));
            cts.setString(8,correo);
            cts.setInt(9,Integer.parseInt(dpi));
            cts.executeUpdate();
            System.out.println("Empleado ingresado correctamente");
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        
    }
    
    public void actualizarEmpleados(String dpi,String nombres,String apellidos,int iddepto,String puesto,String salario,String direccion,String telefono,String correo){
        
        try {
            //para sql server si es necesario usar las llaves para los procedimientos almacenados
            //ya que sin llaves da error y en postgres no se usa 
            
            cts = conn.prepareCall("{CALL actualizarEmpleados(?,?,?,?,?,?,?,?,?)}");
            cts.setString(1,nombres);
            cts.setString(2,apellidos);
            cts.setInt(3,iddepto);
            cts.setString(4,puesto);
            cts.setDouble(5,Double.parseDouble(salario));
            cts.setString(6,direccion);
            cts.setInt(7,Integer.parseInt(telefono));
            cts.setString(8,correo);
            cts.setInt(9,Integer.parseInt(dpi));
            cts.executeUpdate();
            JOptionPane.showMessageDialog(null,"EMPLEADO ACTUALIZADO CORRECTAMENTE");
            
        } catch (SQLException e) {
            System.out.println(e);
        } 
    }
    
    public void EliminarEmpleados(String dpi){
        try {
            //para sql server si es necesario usar las llaves para los procedimientos almacenados
            //ya que sin llaves da error y en postgres no se usa 
            
            cts = conn.prepareCall("{CALL eliminarEmpleados(?)}");
            cts.setInt(1,Integer.parseInt(dpi));
            cts.executeUpdate();
            JOptionPane.showMessageDialog(null,"EMPLEADO ELIMINADO CORRECTAMENTE");
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public Empleados mostrarEmpleadoDPI(String dpi) throws SQLException{
        
        Empleados emp = new Empleados();
        
        String  qry = "Select * from empleados where DPI = '"+dpi+"'";
        
        st = conn.createStatement();
        rst = st.executeQuery(qry);

        if (rst.next()) {
            emp.setNom(rst.getString("NOMBRE"));
            emp.setApe(rst.getString("APELLIDOS"));
            emp.setIddepto(rst.getInt("ID_DEPARTAMENTO_SUCURSAL"));
            emp.setPues(rst.getString("PUESTO"));
            emp.setSal(rst.getString("SALARIO"));
            emp.setDirec(rst.getString("DIRECCION"));
            emp.setTel(rst.getString("TELEFONO"));
            emp.setCorr(rst.getString("CORREO"));
        }else{
            JOptionPane.showMessageDialog(null,"EL EMPLEADO NO EXISTE");
        }
        return emp;
    }
    
    public String DepartamentoE(String nitE){
        
        String deptoE="";
        
        try {
            conn = ConexionSQL.conectar();

            String qry = "select ds.NOMBRE_DEPARTAMENTO from departamento_sucursal as ds \n" +
                    "	join empleados as e on ds.ID_DEPARTAMENTO_SUCURSAL=e.ID_DEPARTAMENTO_SUCURSAL\n" +
                    "	join sucursales as s on ds.ID_SUCURSAL=s.ID_SUCURSAL where e.DPI= ?";
            
            PreparedStatement ps = conn.prepareStatement(qry);
            ps.setInt(1,Integer.parseInt(nitE));
            rst = ps.executeQuery();
            
            if (rst.next()) {
                deptoE = rst.getString("NOMBRE_DEPARTAMENTO");
            }

        } catch(SQLException e) {
            System.out.println("error" + e);
        }
        
        return deptoE;
    }
    
    
    public String SecudeNombre(String nitE){
        String sucuDepto="";
        
        
        try {
            conn = ConexionSQL.conectar();

            String qry = "select s.NOMBRE from departamento_sucursal as ds \n" +
"	join empleados as e on ds.ID_DEPARTAMENTO_SUCURSAL=e.ID_DEPARTAMENTO_SUCURSAL\n" +
"	join sucursales as s on ds.ID_SUCURSAL=s.ID_SUCURSAL where e.DPI= ?";
            
            PreparedStatement ps = conn.prepareStatement(qry);
            ps.setInt(1,Integer.parseInt(nitE));
            rst = ps.executeQuery();
            
            if (rst.next()) {
                sucuDepto = rst.getString("NOMBRE");
            }

        } catch(SQLException e) {
            System.out.println("error" + e);
        }
        
        return sucuDepto;
    }
    
    
    
    public boolean validar(String dpi,String nombres,String apellidos,String sucursal,String puesto,String telefono,String correo,String iddepto,String direccion,String salario){
        
        if(dpi.isEmpty()){
            JOptionPane.showMessageDialog(null,"INGRESE EL NUMERO DE DPI DEL EMPLEADO");
            return false;
        }
        if(nombres.isEmpty()){
            JOptionPane.showMessageDialog(null,"INGRESE LOS NOMBRES DEL EMPLEADO");
            return false;
        }
        if(apellidos.isEmpty()){
            JOptionPane.showMessageDialog(null,"INGRESE LOS APELLIDOS DEL EMPLEADO");
            return false;
        }
        if(sucursal.equals("Seleccionar")){
            JOptionPane.showMessageDialog(null,"ELIGA LA SUCURSAL");
            return false;
        } else {
        }
        if(puesto.isEmpty()){
            JOptionPane.showMessageDialog(null,"INGRESE EL PUESTO A ASIGNAR A EL EMPLEADO");
            return false;
        }
        if(telefono.isEmpty()){
            JOptionPane.showMessageDialog(null,"INGRESE EL NUMERO DE TELEFONO DEL EMPLEADO");
            return false;
        }
        if(correo.isEmpty()){
            JOptionPane.showMessageDialog(null,"INGRESE EL CORREO ELECTRONICO DEL EMPLEADO");
            return false;
        }
        if(iddepto.equals("Seleccionar")){
            JOptionPane.showMessageDialog(null,"ELIGA EL NOMBRE DEL DEPARTAMENTO AL CUAL PERTENECERA EL EMPLEADO");
            return false;
        }
        if(direccion.isEmpty()){
            JOptionPane.showMessageDialog(null,"INGRESE LA DIRECCION DE DOMICILIO DEL EMPLEADO");
            return false;
        }
        if(salario.isEmpty()){
            JOptionPane.showMessageDialog(null,"INGRESE LA CANTIDAD DE SALARIO DEL EMPLEADO");
            return false;
        }
        return true;
    }
    
    public boolean validarV(String dpi){
        
        if(dpi.isEmpty()){
            JOptionPane.showMessageDialog(null,"INGRESE EL NUMERO DE DPI DEL EMPLEADO A VISUALIZAR LOS DATOS");
            return false;
        }
        return true;
    }
    public boolean validarE(String dpi){
        
        if(dpi.isEmpty()){
            JOptionPane.showMessageDialog(null,"INGRESE EL NUMERO DE DPI DEL EMPLEADO A ELIMINAR");
            return false;
        }
        return true;
    }
    
    public void limpiar(JPanel panel){
        for (Object o : panel.getComponents()) {
            
            if(o instanceof JTextField ){
                ((JTextField) o).setText("");
            }
        }
    }
     
}
