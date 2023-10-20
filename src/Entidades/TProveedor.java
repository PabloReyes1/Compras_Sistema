/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author ajane
 */
public class TProveedor {
    
    private int idTP;
    private String nombreProveedor;
    private String descripcionProveedor;
     
    public TProveedor(){
        
    }

    public TProveedor(int idTP,String nombreProveedor, String descripcionProveedor) {
        this.idTP=idTP;
        this.nombreProveedor = nombreProveedor;
        this.descripcionProveedor = descripcionProveedor;
    }

    /**
     * @return the idTP
     */
    public int getIdTP() {
        return idTP;
    }

    /**
     * @param idTP the idTP to set
     */
    public void setIdTP(int idTP) {
        this.idTP = idTP;
    }
    
    /**
     * @return the nombreProveedor
     */
    public String getNombreProveedor() {
        return nombreProveedor;
    }

    /**
     * @param nombreProveedor the nombreProveedor to set
     */
    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    /**
     * @return the descripcionProveedor
     */
    public String getDescripcionProveedor() {
        return descripcionProveedor;
    }

    /**
     * @param descripcionProveedor the descripcionProveedor to set
     */
    public void setDescripcionProveedor(String descripcionProveedor) {
        this.descripcionProveedor = descripcionProveedor;
    }

    
    
}
