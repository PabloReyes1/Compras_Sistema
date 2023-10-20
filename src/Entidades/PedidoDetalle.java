/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author ProcesosE
 */
public class PedidoDetalle {
    
    int ID_PEDIDO_DETALLE;
    int ID_PEDIDO;
    int ID_PRODUCTO;
    String NOMBRE_PRODUCTO;
    String DESCRIPCION_PRODUCTO;
    int CANTIDAD_SOLICITADA;

    public PedidoDetalle() {
    }

    public PedidoDetalle(int ID_PEDIDO_DETALLE, int ID_PEDIDO, int ID_PRODUCTO, String NOMBRE_PRODUCTO, String DESCRIPCION_PRODUCTO, int CANTIDAD_SOLICITADA) {
        this.ID_PEDIDO_DETALLE = ID_PEDIDO_DETALLE;
        this.ID_PEDIDO = ID_PEDIDO;
        this.ID_PRODUCTO = ID_PRODUCTO;
        this.NOMBRE_PRODUCTO = NOMBRE_PRODUCTO;
        this.DESCRIPCION_PRODUCTO = DESCRIPCION_PRODUCTO;
        this.CANTIDAD_SOLICITADA = CANTIDAD_SOLICITADA;
    }

    public int getID_PEDIDO_DETALLE() {
        return ID_PEDIDO_DETALLE;
    }

    public void setID_PEDIDO_DETALLE(int ID_PEDIDO_DETALLE) {
        this.ID_PEDIDO_DETALLE = ID_PEDIDO_DETALLE;
    }

    public int getID_PEDIDO() {
        return ID_PEDIDO;
    }

    public void setID_PEDIDO(int ID_PEDIDO) {
        this.ID_PEDIDO = ID_PEDIDO;
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

    public String getDESCRIPCION_PRODUCTO() {
        return DESCRIPCION_PRODUCTO;
    }

    public void setDESCRIPCION_PRODUCTO(String DESCRIPCION_PRODUCTO) {
        this.DESCRIPCION_PRODUCTO = DESCRIPCION_PRODUCTO;
    }

    public int getCANTIDAD_SOLICITADA() {
        return CANTIDAD_SOLICITADA;
    }

    public void setCANTIDAD_SOLICITADA(int CANTIDAD_SOLICITADA) {
        this.CANTIDAD_SOLICITADA = CANTIDAD_SOLICITADA;
    }
    
    
    
}
