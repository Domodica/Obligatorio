/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author simonlg
 */
public class Item {
    
    private Articulo art;
    private Integer cantidad;
    private String descripcion;
    private Pedido pedido;

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    

    public Articulo getArt() {
        return art;
    }
    public void setArt(Articulo art) {
        this.art = art;
    }
    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Item(Articulo art, Integer cantidad, String descripcion) {
        this.art = art;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }
 
    
    
}
