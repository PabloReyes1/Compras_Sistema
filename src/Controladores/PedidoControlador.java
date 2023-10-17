/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Entidades.Pedido;
import Entidades.PedidoDetalle;

/**
 *
 * @author ProcesosE
 */
public class PedidoControlador {
    
    public static Pedido insertarPedidoEncabezado(
        int idPedido, 
        String DESCRIPCION
        ){
        
        Pedido nuevoPedido = new Pedido();

        nuevoPedido.setID_DEPARTAMENTO_SUCURSAL(idPedido);
        nuevoPedido.setDESCRIPCION(DESCRIPCION);

        return nuevoPedido;
    }
    
    public static PedidoDetalle insertarPedidoDetalle(
        int idPedido,
        String nombreProducto,
        String descripcionProducto,
        int cantidadSolicitada
        ){
        
        PedidoDetalle nuevoPedidoDetalle = new PedidoDetalle();

        nuevoPedidoDetalle.setID_PEDIDO(idPedido);
        nuevoPedidoDetalle.setNOMBRE_PRODUCTO(nombreProducto);
        nuevoPedidoDetalle.setDESCRIPCION_PRODUCTO(descripcionProducto);
        nuevoPedidoDetalle.setCANTIDAD_SOLICITADA(cantidadSolicitada);

        return nuevoPedidoDetalle;
    }
    
    public static Pedido pedidoVista(
        int idPedido, 
        String DESCRIPCION
        ){
        
        Pedido nuevoPedido = new Pedido();

        nuevoPedido.setID_PEDIDO(idPedido);
        nuevoPedido.setDESCRIPCION(DESCRIPCION);

        return nuevoPedido;
    }
    
    
}
