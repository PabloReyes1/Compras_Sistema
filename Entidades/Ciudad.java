/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author ProcesosE
 */
public class Ciudad {
    int ID_CIUDAD;
    String NOMBRE_CIUDAD;

    public Ciudad() {
    }

    public Ciudad(int ID_CIUDAD, String NOMBRE_CIUDAD) {
        this.ID_CIUDAD = ID_CIUDAD;
        this.NOMBRE_CIUDAD = NOMBRE_CIUDAD;
    }

    public int getID_CIUDAD() {
        return ID_CIUDAD;
    }

    public void setID_CIUDAD(int ID_CIUDAD) {
        this.ID_CIUDAD = ID_CIUDAD;
    }

    public String getNOMBRE_CIUDAD() {
        return NOMBRE_CIUDAD;
    }

    public void setNOMBRE_CIUDAD(String NOMBRE_CIUDAD) {
        this.NOMBRE_CIUDAD = NOMBRE_CIUDAD;
    }
    
    
    
}
