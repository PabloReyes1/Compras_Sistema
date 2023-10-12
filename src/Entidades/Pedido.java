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
public class Pedido {
    
    int ID_DEPARTAMENTO_SUCURSAL;
    String DESCRIPCION;
    Date FECHA_CREACION;
    Date FECHA_EXPIRACION;
    String ESTADO;
    int ID_PRODUCTO;
    String NOMBRE_PRODUCTO;
    String DESCRIPCION_PEDIDO;
    int CANTIDAD;

    public Pedido() {
    }
   
    public Pedido(int ID_DEPARTAMENTO_SUCURSAL, String DESCRIPCION, Date FECHA_CREACION, Date FECHA_EXPIRACION, String ESTADO, int ID_PRODUCTO, String NOMBRE_PRODUCTO, String DESCRIPCION_PEDIDO, int CANTIDAD) {
        this.ID_DEPARTAMENTO_SUCURSAL = ID_DEPARTAMENTO_SUCURSAL;
        this.DESCRIPCION = DESCRIPCION;
        this.FECHA_CREACION = FECHA_CREACION;
        this.FECHA_EXPIRACION = FECHA_EXPIRACION;
        this.ESTADO = ESTADO;
        this.ID_PRODUCTO = ID_PRODUCTO;
        this.NOMBRE_PRODUCTO = NOMBRE_PRODUCTO;
        this.DESCRIPCION_PEDIDO = DESCRIPCION_PEDIDO;
        this.CANTIDAD = CANTIDAD;
    }

    public int getID_DEPARTAMENTO_SUCURSAL() {
        return ID_DEPARTAMENTO_SUCURSAL;
    }

    public void setID_DEPARTAMENTO_SUCURSAL(int ID_DEPARTAMENTO_SUCURSAL) {
        this.ID_DEPARTAMENTO_SUCURSAL = ID_DEPARTAMENTO_SUCURSAL;
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

    public Date getFECHA_EXPIRACION() {
        return FECHA_EXPIRACION;
    }

    public void setFECHA_EXPIRACION(Date FECHA_EXPIRACION) {
        this.FECHA_EXPIRACION = FECHA_EXPIRACION;
    }

    public String getESTADO() {
        return ESTADO;
    }

    public void setESTADO(String ESTADO) {
        this.ESTADO = ESTADO;
    }

    public int getID_PRODUCTO() {
        return ID_PRODUCTO;
    }

    public void setID_PRODUCTO(int ID_PRODUCTO) {
        this.ID_PRODUCTO = ID_PRODUCTO;
    }

    public String getNOMBRE_PRODUCTO() {
        return NOMBRE_PRODUCTO;
    }

    public void setNOMBRE_PRODUCTO(String NOMBRE_PRODUCTO) {
        this.NOMBRE_PRODUCTO = NOMBRE_PRODUCTO;
    }

    public String getDESCRIPCION_PEDIDO() {
        return DESCRIPCION_PEDIDO;
    }

    public void setDESCRIPCION_PEDIDO(String DESCRIPCION_PEDIDO) {
        this.DESCRIPCION_PEDIDO = DESCRIPCION_PEDIDO;
    }

    public int getCANTIDAD() {
        return CANTIDAD;
    }

    public void setCANTIDAD(int CANTIDAD) {
        this.CANTIDAD = CANTIDAD;
    }
    
    
    
}
