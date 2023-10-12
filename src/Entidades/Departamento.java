/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author ProcesosE
 */
public class Departamento {
    
    int ID_DEPARTAMENTO_SUCURSAL;
    int ID_SUCURSAL;
    String NOMBRE_DEPARTAMENTO;
    String DESCRIPCION;
    int PERSONAL;

    public Departamento() {
    }

    public Departamento(int ID_DEPARTAMENTO_SUCURSAL, int ID_SUCURSAL, String NOMBRE_DEPARTAMENTO, String DESCRIPCION, int PERSONAL) {
        this.ID_DEPARTAMENTO_SUCURSAL = ID_DEPARTAMENTO_SUCURSAL;
        this.ID_SUCURSAL = ID_SUCURSAL;
        this.NOMBRE_DEPARTAMENTO = NOMBRE_DEPARTAMENTO;
        this.DESCRIPCION = DESCRIPCION;
        this.PERSONAL = PERSONAL;
    }

    public int getID_DEPARTAMENTO_SUCURSAL() {
        return ID_DEPARTAMENTO_SUCURSAL;
    }

    public void setID_DEPARTAMENTO_SUCURSAL(int ID_DEPARTAMENTO_SUCURSAL) {
        this.ID_DEPARTAMENTO_SUCURSAL = ID_DEPARTAMENTO_SUCURSAL;
    }

    public int getID_SUCURSAL() {
        return ID_SUCURSAL;
    }

    public void setID_SUCURSAL(int ID_SUCURSAL) {
        this.ID_SUCURSAL = ID_SUCURSAL;
    }

    public String getNOMBRE_DEPARTAMENTO() {
        return NOMBRE_DEPARTAMENTO;
    }

    public void setNOMBRE_DEPARTAMENTO(String NOMBRE_DEPARTAMENTO) {
        this.NOMBRE_DEPARTAMENTO = NOMBRE_DEPARTAMENTO;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public int getPERSONAL() {
        return PERSONAL;
    }

    public void setPERSONAL(int PERSONAL) {
        this.PERSONAL = PERSONAL;
    }
   
}
