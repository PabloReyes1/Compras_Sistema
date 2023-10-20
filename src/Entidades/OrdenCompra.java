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
public class OrdenCompra {
    
        int ID_ORDEN_VENTA;
	int ID_PEDIDO;
	int ID_ADJUDICACION;
	int ID_PROVEEDOR;
	String TIPO_ORDEN;
	String DESCRIPCION;
	Date FECHA_CREACION;
	String USUARIO_CREA;
	String PRIORIDAD;
	String DIRECCION_ENTREGA;
	int TOTAL;

    public OrdenCompra() {
    }

    public OrdenCompra(int ID_ORDEN_VENTA, int ID_PEDIDO, int ID_ADJUDICACION, int ID_PROVEEDOR, String TIPO_ORDEN, String DESCRIPCION, Date FECHA_CREACION, String USUARIO_CREA, String PRIORIDAD, String DIRECCION_ENTREGA, int TOTAL) {
        this.ID_ORDEN_VENTA = ID_ORDEN_VENTA;
        this.ID_PEDIDO = ID_PEDIDO;
        this.ID_ADJUDICACION = ID_ADJUDICACION;
        this.ID_PROVEEDOR = ID_PROVEEDOR;
        this.TIPO_ORDEN = TIPO_ORDEN;
        this.DESCRIPCION = DESCRIPCION;
        this.FECHA_CREACION = FECHA_CREACION;
        this.USUARIO_CREA = USUARIO_CREA;
        this.PRIORIDAD = PRIORIDAD;
        this.DIRECCION_ENTREGA = DIRECCION_ENTREGA;
        this.TOTAL = TOTAL;
    }

    public int getID_ORDEN_VENTA() {
        return ID_ORDEN_VENTA;
    }

    public void setID_ORDEN_VENTA(int ID_ORDEN_VENTA) {
        this.ID_ORDEN_VENTA = ID_ORDEN_VENTA;
    }

    public int getID_PEDIDO() {
        return ID_PEDIDO;
    }

    public void setID_PEDIDO(int ID_PEDIDO) {
        this.ID_PEDIDO = ID_PEDIDO;
    }

    public int getID_ADJUDICACION() {
        return ID_ADJUDICACION;
    }

    public void setID_ADJUDICACION(int ID_ADJUDICACION) {
        this.ID_ADJUDICACION = ID_ADJUDICACION;
    }

    public int getID_PROVEEDOR() {
        return ID_PROVEEDOR;
    }

    public void setID_PROVEEDOR(int ID_PROVEEDOR) {
        this.ID_PROVEEDOR = ID_PROVEEDOR;
    }

    public String getTIPO_ORDEN() {
        return TIPO_ORDEN;
    }

    public void setTIPO_ORDEN(String TIPO_ORDEN) {
        this.TIPO_ORDEN = TIPO_ORDEN;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public Date getFECHA_CREACION() {
        return FECHA_CREACION;
    }

    public void setFECHA_CREACION(Date FECHA_CREACION) {
        this.FECHA_CREACION = FECHA_CREACION;
    }

    public String getUSUARIO_CREA() {
        return USUARIO_CREA;
    }

    public void setUSUARIO_CREA(String USUARIO_CREA) {
        this.USUARIO_CREA = USUARIO_CREA;
    }

    public String getPRIORIDAD() {
        return PRIORIDAD;
    }

    public void setPRIORIDAD(String PRIORIDAD) {
        this.PRIORIDAD = PRIORIDAD;
    }

    public String getDIRECCION_ENTREGA() {
        return DIRECCION_ENTREGA;
    }

    public void setDIRECCION_ENTREGA(String DIRECCION_ENTREGA) {
        this.DIRECCION_ENTREGA = DIRECCION_ENTREGA;
    }

    public int getTOTAL() {
        return TOTAL;
    }

    public void setTOTAL(int TOTAL) {
        this.TOTAL = TOTAL;
    }
        
        
    
}
