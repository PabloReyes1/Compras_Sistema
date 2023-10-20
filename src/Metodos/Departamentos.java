/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import Conexion.ConexionSQL;
import Entidades.Departamento;
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
public class Departamentos {
    Connection conn = null;   
    
    ResultSet rs;
    Statement st;
    
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
    
    public ArrayList<Departamento> obtenerDepartamentos(int idSucursal){
        ArrayList<Departamento> departamentosucu = new ArrayList<>();
        
        try{
            conn = ConexionSQL.conectar();
            
            String qry = "SELECT * FROM DEPARTAMENTO_SUCURSAL WHERE ID_DEPARTAMENTO_SUCURSAL = ?";
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
    
}
