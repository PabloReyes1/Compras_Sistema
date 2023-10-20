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
public class Empleados {
    private String nom;
    private String ape;
    private int iddepto;
    private String pues;
    private String sal;
    private String direc;
    private String tel;
    private String corr;

    public Empleados() {
        
    }
    
    public Empleados(String nom, String ape, int iddepto, String pues, String sal, String direc, String tel, String corr) {
        this.nom = nom;
        this.ape = ape;
        this.iddepto = iddepto;
        this.pues = pues;
        this.sal = sal;
        this.direc = direc;
        this.tel = tel;
        this.corr = corr;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the ape
     */
    public String getApe() {
        return ape;
    }

    /**
     * @param ape the ape to set
     */
    public void setApe(String ape) {
        this.ape = ape;
    }

    /**
     * @return the iddepto
     */
    public int getIddepto() {
        return iddepto;
    }

    /**
     * @param iddepto the iddepto to set
     */
    public void setIddepto(int iddepto) {
        this.iddepto = iddepto;
    }

    /**
     * @return the pues
     */
    public String getPues() {
        return pues;
    }

    /**
     * @param pues the pues to set
     */
    public void setPues(String pues) {
        this.pues = pues;
    }

    /**
     * @return the sal
     */
    public String getSal() {
        return sal;
    }

    /**
     * @param sal the sal to set
     */
    public void setSal(String sal) {
        this.sal = sal;
    }

    /**
     * @return the direc
     */
    public String getDirec() {
        return direc;
    }

    /**
     * @param direc the direc to set
     */
    public void setDirec(String direc) {
        this.direc = direc;
    }

    /**
     * @return the tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * @return the corr
     */
    public String getCorr() {
        return corr;
    }

    /**
     * @param corr the corr to set
     */
    public void setCorr(String corr) {
        this.corr = corr;
    }
    
}
