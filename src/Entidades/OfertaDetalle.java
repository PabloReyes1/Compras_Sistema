/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author ProcesosE
 */
public class OfertaDetalle {
    
        int ID_OFERTA_DETALLE;
	int ID_OFERTA_ENCABEZADO;
	int ID_PRODUCTO;
	String NOMBRE_PRODUCTO;
	String DESCRIPCION_PRODUCTO;
	int CANTIDAD;
	int PRECIO;
	int PRECIO_UNIDAD;

    public OfertaDetalle() {
    }

    public OfertaDetalle(int ID_OFERTA_DETALLE, int ID_OFERTA_ENCABEZADO, int ID_PRODUCTO, String NOMBRE_PRODUCTO, String DESCRIPCION_PRODUCTO, int CANTIDAD, int PRECIO, int PRECIO_UNIDAD) {
        this.ID_OFERTA_DETALLE = ID_OFERTA_DETALLE;
        this.ID_OFERTA_ENCABEZADO = ID_OFERTA_ENCABEZADO;
        this.ID_PRODUCTO = ID_PRODUCTO;
        this.NOMBRE_PRODUCTO = NOMBRE_PRODUCTO;
        this.DESCRIPCION_PRODUCTO = DESCRIPCION_PRODUCTO;
        this.CANTIDAD = CANTIDAD;
        this.PRECIO = PRECIO;
        this.PRECIO_UNIDAD = PRECIO_UNIDAD;
    }

    public int getID_OFERTA_DETALLE() {
        return ID_OFERTA_DETALLE;
    }

    public void setID_OFERTA_DETALLE(int ID_OFERTA_DETALLE) {
        this.ID_OFERTA_DETALLE = ID_OFERTA_DETALLE;
    }

    public int getID_OFERTA_ENCABEZADO() {
        return ID_OFERTA_ENCABEZADO;
    }

    public void setID_OFERTA_ENCABEZADO(int ID_OFERTA_ENCABEZADO) {
        this.ID_OFERTA_ENCABEZADO = ID_OFERTA_ENCABEZADO;
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

    public int getCANTIDAD() {
        return CANTIDAD;
    }

    public void setCANTIDAD(int CANTIDAD) {
        this.CANTIDAD = CANTIDAD;
    }

    public int getPRECIO() {
        return PRECIO;
    }

    public void setPRECIO(int PRECIO) {
        this.PRECIO = PRECIO;
    }

    public int getPRECIO_UNIDAD() {
        return PRECIO_UNIDAD;
    }

    public void setPRECIO_UNIDAD(int PRECIO_UNIDAD) {
        this.PRECIO_UNIDAD = PRECIO_UNIDAD;
    }
        
        
    
}
