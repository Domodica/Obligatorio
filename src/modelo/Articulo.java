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
public class Articulo {

    private Integer codigo;
    private String nombre;
    private Double precio;
    private Integer stock;
    private UnidadProcesadora up;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public UnidadProcesadora getUp() {
        return up;
    }

    public void setUp(UnidadProcesadora up) {
        this.up = up;
    }

    public Articulo(Integer codigo, String nombre, Double precio, Integer stock, UnidadProcesadora up) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.up = up;
    }

    @Override
    public String toString(){             
        return getNombre() + " - stock: " + getStock(); ////////////////////////////////////////
    }
    
    public void descontarStock(Integer cantidad) { ////////////////////////////////////////
        this.stock -= cantidad;
    }

}
