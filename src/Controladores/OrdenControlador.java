/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Entidades.Oferta;
import Entidades.OfertaDetalle;
import Entidades.OrdenCompra;
import Entidades.OrdenCompraDetalle;

/**
 *
 * @author ProcesosE
 */
public class OrdenControlador {
    
    public static OrdenCompra insertarOrdenEncabezado(
        
        int idPedido,     
        int idAdjudicacion,
        int idProveedor,
        String tipoOrden,
        String descripcion,
        String prioridad,
        String direccion,
        int total
        ){
        
        OrdenCompra nuevaOrden = new OrdenCompra();

        nuevaOrden.setID_PROVEEDOR(idProveedor);
        nuevaOrden.setID_PEDIDO(idPedido);
        nuevaOrden.setID_ADJUDICACION(idAdjudicacion);
        nuevaOrden.setTIPO_ORDEN(tipoOrden);
        nuevaOrden.setDESCRIPCION(descripcion);
        nuevaOrden.setPRIORIDAD(prioridad);
        nuevaOrden.setDIRECCION_ENTREGA(direccion);
        nuevaOrden.setTOTAL(total);

        return nuevaOrden;
    }
    
    public static OrdenCompraDetalle insertarOrdenDetalle(
        
        int idProducto,
        String nombreProducto,
        String descripcionProducto,
        int cantidad,
        int precio,
        int precioUnidad
        ){
        
        OrdenCompraDetalle nuevoOrdenDetalle = new OrdenCompraDetalle();

        nuevoOrdenDetalle.setID_PRODUCTO(idProducto);
        nuevoOrdenDetalle.setNOMBRE_PRODUCTO(nombreProducto);
        nuevoOrdenDetalle.setDESCRIPCION_PRODUCTO(descripcionProducto);
        nuevoOrdenDetalle.setCANTIDAD(cantidad);
        nuevoOrdenDetalle.setPRECIO(precio);
        nuevoOrdenDetalle.setPRECIO_UNIDAD(precioUnidad);
        
        

        return nuevoOrdenDetalle;
    }
    
}
