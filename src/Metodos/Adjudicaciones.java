/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import Conexion.ConexionSQL;
import Entidades.Adjudicacion;
import Entidades.Pedido;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ProcesosE
 */
public class Adjudicaciones {
    
    Connection conn = null;   
    
    ResultSet rs;
    Statement st;
    
    public ArrayList<Adjudicacion> obtenerAdjudicaciones(){
    ArrayList<Adjudicacion> datosAdjudicacion = new ArrayList<>();
    
    try{
        conn = ConexionSQL.conectar();
        
        String qry = "SELECT * FROM ADJUDICACION";
        st = conn.createStatement();
        rs = st.executeQuery(qry);
        
        while (rs.next()) {
                Adjudicacion adjudicacion = new Adjudicacion();

                adjudicacion.setID_ADJUDICACION(rs.getInt("ID_ADJUDICACION"));
                adjudicacion.setID_OFERTA(rs.getInt("ID_OFERTA"));
                adjudicacion.setMONTO_ADJUDICACION(rs.getInt("MONTO_ADJUDICACION"));
                adjudicacion.setTIPO_ADJUDICACION(rs.getString("TIPO_ADJUDICACION"));
                adjudicacion.setFECHA_ADJUDICACION(rs.getDate("FECHA_ADJUDICACION"));
                adjudicacion.setUSUARIO_ADJUDICA(rs.getString("USUARIO_ADJUDICA"));
                
                datosAdjudicacion.add(adjudicacion);
                
            }
        
    } catch(SQLException e) {
    
        System.out.println("error" + e);
    }
    return datosAdjudicacion;
    }
    
}
