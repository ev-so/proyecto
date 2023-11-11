/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author HP
 */
public class Cliente {
    int idc;
    String dnic;
    String nomc;
    String direccion;
    String estac;

    public Cliente() {
    }

    public Cliente(int idc, String dnic, String nomc, String direccion, String estac) {
        this.idc = idc;
        this.dnic = dnic;
        this.nomc = nomc;
        this.direccion = direccion;
        this.estac = estac;
    }

    public int getIdc() {
        return idc;
    }

    public void setIdc(int idc) {
        this.idc = idc;
    }

    public String getDnic() {
        return dnic;
    }

    public void setDnic(String dnic) {
        this.dnic = dnic;
    }

    public String getNomc() {
        return nomc;
    }

    public void setNomc(String nomc) {
        this.nomc = nomc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstac() {
        return estac;
    }

    public void setEstac(String estac) {
        this.estac = estac;
    }
    
    
    
}
