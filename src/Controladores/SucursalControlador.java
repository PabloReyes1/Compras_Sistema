/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Entidades.Sucursal;
/**
 *
 * @author ProcesosE
 */
public class SucursalControlador {

    public static Sucursal insertarSucursal(
        String ciudad, 
        String departamento, 
        String direccion, 
        String email, 
        int telefono, 
         String nombre){
        
        Sucursal nuevaSucursal = new Sucursal();

        nuevaSucursal.setCIUDAD(ciudad);
        nuevaSucursal.setDEPARTAMENTO(departamento);
        nuevaSucursal.setDIRECCION(direccion);
        nuevaSucursal.setEMAIL(email);
        nuevaSucursal.setTELEFONO(telefono);
        nuevaSucursal.setNOMBRE(nombre);

        return nuevaSucursal;
    }

}
