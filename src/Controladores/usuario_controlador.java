/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.Usuarioo;

/**
 *
 * @author Hermanos Osorio
 */
public class usuario_controlador {
      public static Usuarioo insertarUsuario(
        String nombreemp,
        int id_emp,
        String apellidos,
        String nombreusuario,
        String contra,
        String rol ){
        
        Usuarioo nuevoUsuario= new Usuarioo();

        nuevoUsuario.setNOMBRE_EMPLEADO(nombreemp);
        nuevoUsuario.setID_EMPLEADO(id_emp);
        nuevoUsuario.setAPELLIDOS_EMPLEADO(apellidos);
        nuevoUsuario.setLOGIN_NAME(nombreusuario);
        nuevoUsuario.setCONTRASEÑA(contra);
        nuevoUsuario.setROL(rol);

        return nuevoUsuario;
    }
}
