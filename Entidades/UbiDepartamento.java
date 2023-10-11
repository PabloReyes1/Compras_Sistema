/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author ProcesosE
 */
public class UbiDepartamento {
    
    int ID_DEPARTAMENTO;
    int ID_CIUDAD;
    String NOMBRE_DEPARTAMENTO;

    public UbiDepartamento() {
    }

    public UbiDepartamento(int ID_DEPARTAMENTO, int ID_CIUDAD, String NOMBRE_DEPARTAMENTO) {
        this.ID_DEPARTAMENTO = ID_DEPARTAMENTO;
        this.ID_CIUDAD = ID_CIUDAD;
        this.NOMBRE_DEPARTAMENTO = NOMBRE_DEPARTAMENTO;
    }

    public int getID_DEPARTAMENTO() {
        return ID_DEPARTAMENTO;
    }

    public void setID_DEPARTAMENTO(int ID_DEPARTAMENTO) {
        this.ID_DEPARTAMENTO = ID_DEPARTAMENTO;
    }

    public int getID_CIUDAD() {
        return ID_CIUDAD;
    }

    public void setID_CIUDAD(int ID_CIUDAD) {
        this.ID_CIUDAD = ID_CIUDAD;
    }

    public String getNOMBRE_DEPARTAMENTO() {
        return NOMBRE_DEPARTAMENTO;
    }

    public void setNOMBRE_DEPARTAMENTO(String NOMBRE_DEPARTAMENTO) {
        this.NOMBRE_DEPARTAMENTO = NOMBRE_DEPARTAMENTO;
    }
    
    
    
}
