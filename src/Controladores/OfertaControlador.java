/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Entidades.Oferta;
import Entidades.OfertaDetalle;
import Entidades.Pedido;
import Entidades.PedidoDetalle;

/**
 *
 * @author ProcesosE
 */
public class OfertaControlador {
    
     public static Oferta insertarOfertaEncabezado(
        
        int idProveedor,     
        int idPedido,
        String NombreProveedor
        ){
        
        Oferta nuevaOferta = new Oferta();

        nuevaOferta.setID_PROVEEDOR(idProveedor);
        nuevaOferta.setID_PEDIDO(idPedido);
        nuevaOferta.setNOMBRE_PROVEEDOR(NombreProveedor);

        return nuevaOferta;
    }
    
    public static OfertaDetalle insertarOfertaDetalle(
        
        int idProducto,
        String nombreProducto,
        String descripcionProducto,
        int cantidad,
        int precio,
        int precioUnidad
        ){
        
        OfertaDetalle nuevoOfertaDetalle = new OfertaDetalle();

        nuevoOfertaDetalle.setID_PRODUCTO(idProducto);
        nuevoOfertaDetalle.setNOMBRE_PRODUCTO(nombreProducto);
        nuevoOfertaDetalle.setDESCRIPCION_PRODUCTO(descripcionProducto);
        nuevoOfertaDetalle.setCANTIDAD(cantidad);
        nuevoOfertaDetalle.setPRECIO(precio);
        nuevoOfertaDetalle.setPRECIO_UNIDAD(precioUnidad);
        
        

        return nuevoOfertaDetalle;
    }
    
}
