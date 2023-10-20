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
public class Adjudicacion {
    
        int ID_ADJUDICACION;
	int ID_OFERTA;
	int MONTO_ADJUDICACION;
        String TIPO_ADJUDICACION;
	Date FECHA_ADJUDICACION;
	String USUARIO_ADJUDICA;

    public Adjudicacion() {
    }

    public Adjudicacion(int ID_ADJUDICACION, int ID_OFERTA, int MONTO_ADJUDICACION, String TIPO_ADJUDICACION, Date FECHA_ADJUDICACION, String USUARIO_ADJUDICA) {
        this.ID_ADJUDICACION = ID_ADJUDICACION;
        this.ID_OFERTA = ID_OFERTA;
        this.MONTO_ADJUDICACION = MONTO_ADJUDICACION;
        this.TIPO_ADJUDICACION = TIPO_ADJUDICACION;
        this.FECHA_ADJUDICACION = FECHA_ADJUDICACION;
        this.USUARIO_ADJUDICA = USUARIO_ADJUDICA;
    }

    public int getID_ADJUDICACION() {
        return ID_ADJUDICACION;
    }

    public void setID_ADJUDICACION(int ID_ADJUDICACION) {
        this.ID_ADJUDICACION = ID_ADJUDICACION;
    }

    public int getID_OFERTA() {
        return ID_OFERTA;
    }

    public void setID_OFERTA(int ID_OFERTA) {
        this.ID_OFERTA = ID_OFERTA;
    }

    public int getMONTO_ADJUDICACION() {
        return MONTO_ADJUDICACION;
    }

    public void setMONTO_ADJUDICACION(int MONTO_ADJUDICACION) {
        this.MONTO_ADJUDICACION = MONTO_ADJUDICACION;
    }

    public String getTIPO_ADJUDICACION() {
        return TIPO_ADJUDICACION;
    }

    public void setTIPO_ADJUDICACION(String TIPO_ADJUDICACION) {
        this.TIPO_ADJUDICACION = TIPO_ADJUDICACION;
    }

    public Date getFECHA_ADJUDICACION() {
        return FECHA_ADJUDICACION;
    }

    public void setFECHA_ADJUDICACION(Date FECHA_ADJUDICACION) {
        this.FECHA_ADJUDICACION = FECHA_ADJUDICACION;
    }

    public String getUSUARIO_ADJUDICA() {
        return USUARIO_ADJUDICA;
    }

    public void setUSUARIO_ADJUDICA(String USUARIO_ADJUDICA) {
        this.USUARIO_ADJUDICA = USUARIO_ADJUDICA;
    }
        
        
    
}
