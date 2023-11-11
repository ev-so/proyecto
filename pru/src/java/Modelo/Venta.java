/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author HP
 */
public class Venta {
    int id;
    Integer item;
    Integer idCliente;
    Integer idEmpleado;
    Integer idProducto;
    String Numserie;
    String Descripcionp;
    String fecha;
    Double precio;
    Integer cantidad;
    Double subtotal;
    Double monto;
    String estado;

    public Venta() {
    }

    public Venta(int id, Integer item, Integer idCliente, Integer idEmpleado, Integer idProducto, String Numserie, String Descripcionp, String fecha, Double precio, Integer cantidad, Double subtotal, Double monto, String estado) {
        this.id = id;
        this.item = item;
        this.idCliente = idCliente;
        this.idEmpleado = idEmpleado;
        this.idProducto = idProducto;
        this.Numserie = Numserie;
        this.Descripcionp = Descripcionp;
        this.fecha = fecha;
        this.precio = precio;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.monto = monto;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNumserie() {
        return Numserie;
    }

    public void setNumserie(String Numserie) {
        this.Numserie = Numserie;
    }

    public String getDescripcionp() {
        return Descripcionp;
    }

    public void setDescripcionp(String Descripcionp) {
        this.Descripcionp = Descripcionp;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    
}
