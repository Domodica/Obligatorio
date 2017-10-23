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

    private ArrayList<Mozo> mozos = new ArrayList();
    private ArrayList<Articulo> articulos = new ArrayList();

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

    public void agregar(Mozo m) {
        mozos.add(m);
    }

    public void agregar(Articulo art) {
        articulos.add(art);
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

    public void agregarArticuloAlServicio(Integer cantidad, String des, Articulo art, Mesa mesa) {
        if (art.getStock() >= cantidad && cantidad > 0) {
            mesa.getServicio().agregarItem(new Item(art, cantidad, des));
            System.out.println("    agregadpo");
        }
        
    }

    public ArrayList<Articulo> getArticulosDisponibles() {
        ArrayList<Articulo> ret = new ArrayList<>();
        for (Articulo art : articulos) {
            if (art.getStock() > 0) {
                ret.add(art);
            }
        }
        return ret;
    }

}
