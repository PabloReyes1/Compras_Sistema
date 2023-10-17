/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author ProcesosE
 */
public class Proveedor {
    
    int ID_PROVEEDOR;
    String NOMBRE_PROVEEDOR;
    int NIT;
    String DIRECCION;
    String DESCRIPCION;

    public Proveedor() {
    }

    public Proveedor(int ID_PROVEEDOR, String NOMBRE_PROVEEDOR, int NIT, String DIRECCION, String DESCRIPCION) {
        this.ID_PROVEEDOR = ID_PROVEEDOR;
        this.NOMBRE_PROVEEDOR = NOMBRE_PROVEEDOR;
        this.NIT = NIT;
        this.DIRECCION = DIRECCION;
        this.DESCRIPCION = DESCRIPCION;
    }

    public int getID_PROVEEDOR() {
        return ID_PROVEEDOR;
    }

    public void setID_PROVEEDOR(int ID_PROVEEDOR) {
        this.ID_PROVEEDOR = ID_PROVEEDOR;
    }

    public String getNOMBRE_PROVEEDOR() {
        return NOMBRE_PROVEEDOR;
    }

    public void setNOMBRE_PROVEEDOR(String NOMBRE_PROVEEDOR) {
        this.NOMBRE_PROVEEDOR = NOMBRE_PROVEEDOR;
    }

    public int getNIT() {
        return NIT;
    }

    public void setNIT(int NIT) {
        this.NIT = NIT;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }
    
    
    
    
}
