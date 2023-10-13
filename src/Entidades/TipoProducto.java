/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author ProcesosE
 */
public class TipoProducto {
    
    int ID_TIPO_PRODUCTO;
    String TIPO_PRODUCTO;

    public TipoProducto() {
    }

    public TipoProducto(int ID_TIPO_PRODUCTO, String TIPO_PRODUCTO) {
        this.ID_TIPO_PRODUCTO = ID_TIPO_PRODUCTO;
        this.TIPO_PRODUCTO = TIPO_PRODUCTO;
    }

    public int getID_TIPO_PRODUCTO() {
        return ID_TIPO_PRODUCTO;
    }

    public void setID_TIPO_PRODUCTO(int ID_TIPO_PRODUCTO) {
        this.ID_TIPO_PRODUCTO = ID_TIPO_PRODUCTO;
    }

    public String getTIPO_PRODUCTO() {
        return TIPO_PRODUCTO;
    }

    public void setTIPO_PRODUCTO(String TIPO_PRODUCTO) {
        this.TIPO_PRODUCTO = TIPO_PRODUCTO;
    }

    
    
    
}
