/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Entidades.Adjudicacion;
import Entidades.Oferta;
import Entidades.OfertaDetalle;
import java.util.Date;

/**
 *
 * @author ProcesosE
 */
public class AdjudicacionControlador {
    
    public static Adjudicacion insertarAdjudicacion(
        
        int idOferta,
        String tipoAdjudicacion
        ){
        
        Adjudicacion nuevaAdjudicacion = new Adjudicacion();

        nuevaAdjudicacion.setID_OFERTA(idOferta);
        nuevaAdjudicacion.setTIPO_ADJUDICACION(tipoAdjudicacion);

        return nuevaAdjudicacion;
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
    
    public static Adjudicacion adjudicacionVista(
        
                        int idAdjudicacion,
                        int idOferta,
                        int montoAdjudicacion,
                        String tipoAdjudicacion,
                        Date fecha,
                        String usuario
        ){
        
        Adjudicacion nuevaAdjudicacion = new Adjudicacion();

        nuevaAdjudicacion.setID_ADJUDICACION(idAdjudicacion);
        nuevaAdjudicacion.setID_OFERTA(idOferta);
        nuevaAdjudicacion.setMONTO_ADJUDICACION(montoAdjudicacion);
        nuevaAdjudicacion.setTIPO_ADJUDICACION(tipoAdjudicacion);
        nuevaAdjudicacion.setFECHA_ADJUDICACION(fecha);
        nuevaAdjudicacion.setUSUARIO_ADJUDICA(usuario);
            
        return nuevaAdjudicacion;
    }
    
    
    
}
