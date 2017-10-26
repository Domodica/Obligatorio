/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author simonlg
 */
public class UnidadProcesadora extends Observable {

    private String nombre;
    private ArrayList<Pedido> pendientes;
    private Gestor gestor;


    public UnidadProcesadora(String nombre) {
        this.nombre = nombre;
        this.pendientes = new ArrayList<>();
        gestor = null;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Pedido> getPendientes() {
        return pendientes;
    }

    public void setPendientes(ArrayList<Pedido> pendientes) {
        this.pendientes = pendientes;
    }

    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }
    
    
    
    public void avisar(eventos eventos) { //esto deberia ser privado o protectes, entonces el item y el pedido se cren en el mozo?
        setChanged();
        notifyObservers(eventos);
    }

    void removerPendiente(Pedido p) {
        pendientes.remove(p);
        avisar(eventos.pedidoTomado);
    }

    public enum eventos {
        nuevoPedido, pedidoFinalizado, pedidoTomado, procesandoPedido;
    }

    @Override
    public String toString() {
        return this.getNombre();
    }

}
