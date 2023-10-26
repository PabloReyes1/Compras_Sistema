/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Hermanos Osorio
 */
public class Usuarioo {
    private String LOGIN_NAME;
    private int ID_EMPLEADO;
    private String NOMBRE_EMPLEADO;
    private String APELLIDOS_EMPLEADO;
    private String CONTRASEÑA;
    private String ROL;
    
    public Usuarioo (){
        
    }
    
    public Usuarioo(String LOGIN_NAME, int ID_EMPLEADO, String NOMBRE_EMPLEADO, String APELLIDOS_EMPLEADO, String CONTRASEÑA, String ROL){
        this.LOGIN_NAME =  LOGIN_NAME;
        this.ID_EMPLEADO = ID_EMPLEADO;
        this.NOMBRE_EMPLEADO = NOMBRE_EMPLEADO;
        this.APELLIDOS_EMPLEADO =  APELLIDOS_EMPLEADO;
        this.CONTRASEÑA = CONTRASEÑA;
        this.ROL = ROL;
        
    }

    /**
     * @return the LOGIN_NAME
     */
    public String getLOGIN_NAME() {
        return LOGIN_NAME;
    }

    /**
     * @param LOGIN_NAME the LOGIN_NAME to set
     */
    public void setLOGIN_NAME(String LOGIN_NAME) {
        this.LOGIN_NAME = LOGIN_NAME;
    }

  

    /**
     * @return the NOMBRE_EMPLEADO
     */
    public String getNOMBRE_EMPLEADO() {
        return NOMBRE_EMPLEADO;
    }

    /**
     * @param NOMBRE_EMPLEADO the NOMBRE_EMPLEADO to set
     */
    public void setNOMBRE_EMPLEADO(String NOMBRE_EMPLEADO) {
        this.NOMBRE_EMPLEADO = NOMBRE_EMPLEADO;
    }

    /**
     * @return the APELLIDOS_EMPLEADO
     */
    public String getAPELLIDOS_EMPLEADO() {
        return APELLIDOS_EMPLEADO;
    }

    /**
     * @param APELLIDOS_EMPLEADO the APELLIDOS_EMPLEADO to set
     */
    public void setAPELLIDOS_EMPLEADO(String APELLIDOS_EMPLEADO) {
        this.APELLIDOS_EMPLEADO = APELLIDOS_EMPLEADO;
    }

 
    /**
     * @return the ROL
     */
    public String getROL() {
        return ROL;
    }

    /**
     * @param ROL the ROL to set
     */
    public void setROL(String ROL) {
        this.ROL = ROL;
    }

    /**
     * @return the ID_EMPLEADO
     */
    public int getID_EMPLEADO() {
        return ID_EMPLEADO;
    }

    /**
     * @param ID_EMPLEADO the ID_EMPLEADO to set
     */
    public void setID_EMPLEADO(int ID_EMPLEADO) {
        this.ID_EMPLEADO = ID_EMPLEADO;
    }

    /**
     * @return the CONTRASEÑA
     */
    public String getCONTRASEÑA() {
        return CONTRASEÑA;
    }

    /**
     * @param CONTRASEÑA the CONTRASEÑA to set
     */
    public void setCONTRASEÑA(String CONTRASEÑA) {
        this.CONTRASEÑA = CONTRASEÑA;
    }

  

 
}
