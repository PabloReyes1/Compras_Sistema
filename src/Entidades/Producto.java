/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author ProcesosE
 */
public class Producto {
    
    int ID_PRODUCTO;
    String NOMBRE;
    String DESCRIPCION;
    Double PRECIO;

    public Producto() {
    }

    public Producto(int ID_PRODUCTO, String NOMBRE, String DESCRIPCION, Double PRECIO) {
        this.ID_PRODUCTO = ID_PRODUCTO;
        this.NOMBRE = NOMBRE;
        this.DESCRIPCION = DESCRIPCION;
        this.PRECIO = PRECIO;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public Double getPRECIO() {
        return PRECIO;
    }

    public void setPRECIO(Double PRECIO) {
        this.PRECIO = PRECIO;
    }

    public int getID_PRODUCTO() {
        return ID_PRODUCTO;
    }

    public void setID_PRODUCTO(int ID_PRODUCTO) {
        this.ID_PRODUCTO = ID_PRODUCTO;
    }
    
}
