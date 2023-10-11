/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import Conexion.ConexionSQL;
import Entidades.Ciudad;
import Entidades.UbiDepartamento;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.SQLException;

import java.sql.*;

/**
 *
 * @author ProcesosE
 */
public class Sucursales {
    
    Connection conn = null;   
    
    ResultSet rs;
    Statement st;
    
    public ArrayList<Ciudad> obtenerDatos(){
    ArrayList<Ciudad> datos = new ArrayList<>();
    
    try{
        conn = ConexionSQL.conectar();
        
        String qry = "SELECT * FROM CIUDAD";
        st = conn.createStatement();
        rs = st.executeQuery(qry);
        
        while (rs.next()) {
                Ciudad ciudad = new Ciudad();
                ciudad.setID_CIUDAD(rs.getInt("ID_CIUDAD"));
                ciudad.setNOMBRE_CIUDAD(rs.getString("NOMBRE_CIUDAD"));
                
                datos.add(ciudad);
                
            }
        
    } catch(SQLException e) {
    
        System.out.println("error" + e);
    }
    return datos;
    }
    
    
    public ArrayList<UbiDepartamento> obtenerDepartamentosPorCiudad(int idCiudad){
        ArrayList<UbiDepartamento> departamentos = new ArrayList<>();
        
        try{
            conn = ConexionSQL.conectar();
            
            String qry = "SELECT * FROM DEPARTAMENTO WHERE ID_CIUDAD = ?";
            PreparedStatement ps = conn.prepareStatement(qry);
            ps.setInt(1, idCiudad);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                UbiDepartamento departamento = new UbiDepartamento();
                departamento.setID_DEPARTAMENTO(rs.getInt("ID_DEPARTAMENTO"));
                departamento.setID_CIUDAD(rs.getInt("ID_CIUDAD"));
                departamento.setNOMBRE_DEPARTAMENTO(rs.getString("NOMBRE_DEPARTAMENTO"));
                
                departamentos.add(departamento);
            }
            
        } catch(SQLException e) {
            System.out.println("error" + e);
        }
        return departamentos;
    }
    
    
    

}
