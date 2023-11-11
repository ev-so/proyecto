/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author HP
 */
public class Producto {
    int idp;
    String nomp;
    String precio;
    String stock;
    String estp;

    public Producto() {
    }

    public Producto(int idp, String nomp, String precio, String stock, String estp) {
        this.idp = idp;
        this.nomp = nomp;
        this.precio = precio;
        this.stock = stock;
        this.estp = estp;
    }

    public int getIdp() {
        return idp;
    }

    public void setIdp(int idp) {
        this.idp = idp;
    }

    public String getNomp() {
        return nomp;
    }

    public void setNomp(String nomp) {
        this.nomp = nomp;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getEstp() {
        return estp;
    }

    public void setEstp(String estp) {
        this.estp = estp;
    }

   
}

