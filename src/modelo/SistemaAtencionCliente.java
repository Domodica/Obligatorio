/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author simonlg
 */
public class SistemaAtencionCliente {

    public ArrayList<Mozo> getMozos() {
        return mozos;
    }

    public void setMozos(ArrayList<Mozo> mozos) {
        this.mozos = mozos;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

    private ArrayList<Mozo> mozos = new ArrayList();
    private ArrayList<Articulo> articulos = new ArrayList();

    public void agregar(Mozo m) {
        mozos.add(m);
    }

    public Mozo login(String n, String p) {
        for (Mozo m : mozos) {
            if (m.getNombre().equals(n) && m.getPassword().equals(p) && m.getLogueado() == false) {
                m.setLogueado(true);
                return m;
            }
        }
        return null;
    }

    public void agregarMesa(String nombreMozo, Boolean libre, Integer numero) {

        for (Mozo m : mozos) {
            if (m.getNombre().equals(nombreMozo)) {

                Mesa nuevaMesa = new Mesa(libre, numero);
                m.agregarMesa(nuevaMesa);
            }
        }
    }

    public void agregarArticuloAlServicio(){
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //este es para cargar los datos
    public void agregarArt(Integer codigo, String nombre, Double precio, Integer stock){
        Articulo nuevo = new Articulo(codigo, nombre, precio, stock);
        articulos.add(nuevo);
    }

    
    
}
