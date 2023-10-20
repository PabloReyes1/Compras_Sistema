<<<<<<< HEAD

=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
>>>>>>> 3e94922dc371c5138ce65e325e72e97cb7611ac0
package Entidades;

/**
 *
<<<<<<< HEAD
 * @author ajane
 */

public class Proveedor {
    private int idProveedor;
    private String nombreP;
    private int nit;
    private String direccion;
    private String descripcion;
   
    public Proveedor(){
    }

    public Proveedor(int idProveedor,String nombreP, int nit, String direccion, String descripcion) {
        
        this.idProveedor=idProveedor;
        this.nombreP = nombreP;
        this.nit = nit;
        this.direccion = direccion;
        this.descripcion = descripcion;
    }

    /**
     * @return the idProveedor
     */
    public int getIdProveedor() {
        return idProveedor;
    }

    /**
     * @param idProveedor the idProveedor to set
     */
    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    /**
     * @return the nombreP
     */
    public String getNombreP() {
        return nombreP;
    }

    /**
     * @param nombreP the nombreP to set
     */
    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    /**
     * @return the nit
     */
    public int getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(int nit) {
        this.nit = nit;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
=======
 * @author ProcesosE
 */
public class Proveedor {
    
    int ID_PROVEEDOR;
    String NOMBRE_PROVEEDOR;
    int NIT;
    String DIRECCION;
    String DESCRIPCION;

    public Proveedor() {
    }

    public Proveedor(int ID_PROVEEDOR, String NOMBRE_PROVEEDOR, int NIT, String DIRECCION, String DESCRIPCION) {
        this.ID_PROVEEDOR = ID_PROVEEDOR;
        this.NOMBRE_PROVEEDOR = NOMBRE_PROVEEDOR;
        this.NIT = NIT;
        this.DIRECCION = DIRECCION;
        this.DESCRIPCION = DESCRIPCION;
    }

    public int getID_PROVEEDOR() {
        return ID_PROVEEDOR;
    }

    public void setID_PROVEEDOR(int ID_PROVEEDOR) {
        this.ID_PROVEEDOR = ID_PROVEEDOR;
    }

    public String getNOMBRE_PROVEEDOR() {
        return NOMBRE_PROVEEDOR;
    }

    public void setNOMBRE_PROVEEDOR(String NOMBRE_PROVEEDOR) {
        this.NOMBRE_PROVEEDOR = NOMBRE_PROVEEDOR;
    }

    public int getNIT() {
        return NIT;
    }

    public void setNIT(int NIT) {
        this.NIT = NIT;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }
    
    
    
    
>>>>>>> 3e94922dc371c5138ce65e325e72e97cb7611ac0
}
