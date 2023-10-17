/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author ProcesosE
 */
public class Oferta {
    
    int ID_OFERTA;
    int ID_PROVEEDOR;
    int ID_PEDIDO;
    String NOMBRE_PROVEEDOR;
    Date FECHA_CREACION;
    String ESTADO;

    public Oferta() {
    }

    public Oferta(int ID_OFERTA, int ID_PROVEEDOR, int ID_PEDIDO, String NOMBRE_PROVEEDOR, Date FECHA_CREACION, String ESTADO) {
        this.ID_OFERTA = ID_OFERTA;
        this.ID_PROVEEDOR = ID_PROVEEDOR;
        this.ID_PEDIDO = ID_PEDIDO;
        this.NOMBRE_PROVEEDOR = NOMBRE_PROVEEDOR;
        this.FECHA_CREACION = FECHA_CREACION;
        this.ESTADO = ESTADO;
    }

    public int getID_OFERTA() {
        return ID_OFERTA;
    }

    public void setID_OFERTA(int ID_OFERTA) {
        this.ID_OFERTA = ID_OFERTA;
    }

    public int getID_PROVEEDOR() {
        return ID_PROVEEDOR;
    }

    public void setID_PROVEEDOR(int ID_PROVEEDOR) {
        this.ID_PROVEEDOR = ID_PROVEEDOR;
    }

    public int getID_PEDIDO() {
        return ID_PEDIDO;
    }

    public void setID_PEDIDO(int ID_PEDIDO) {
        this.ID_PEDIDO = ID_PEDIDO;
    }

    public String getNOMBRE_PROVEEDOR() {
        return NOMBRE_PROVEEDOR;
    }

    public void setNOMBRE_PROVEEDOR(String NOMBRE_PROVEEDOR) {
        this.NOMBRE_PROVEEDOR = NOMBRE_PROVEEDOR;
    }

    public Date getFECHA_CREACION() {
        return FECHA_CREACION;
    }

    public void setFECHA_CREACION(Date FECHA_CREACION) {
        this.FECHA_CREACION = FECHA_CREACION;
    }

    public String getESTADO() {
        return ESTADO;
    }

    public void setESTADO(String ESTADO) {
        this.ESTADO = ESTADO;
    }
    
    
}
