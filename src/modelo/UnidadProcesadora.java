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
public class UnidadProcesadora extends Observable{
    
    private String nombre;
    private ArrayList<Pedido> pendientes;
    private ArrayList<Pedido> tomados;
    private ArrayList<Pedido> finalizados;
    
    public void procesarPedido(Pedido p){       
    };

    public UnidadProcesadora(String nombre) {
        this.nombre = nombre;
        this.pendientes = new ArrayList<>();
        this.tomados = new ArrayList<>();
        this.finalizados = new ArrayList<>();
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

    public ArrayList<Pedido> getTomados() {
        return tomados;
    }

    public void setTomados(ArrayList<Pedido> tomados) {
        this.tomados = tomados;
    }

    public ArrayList<Pedido> getFinalizados() {
        return finalizados;
    }

    public void setFinalizados(ArrayList<Pedido> finalizados) {
        this.finalizados = finalizados;
    }
    
    @Override
    public String toString(){
        return this.getNombre();
    }
    
    public void agregarPedidoPendiente (Pedido p){
        this.pendientes.add(p);
        System.out.println("Pedido pendiente agregado.");
    }
    
    public void agregarPedidoTomado (Pedido p){
        this.tomados.add(p);
    }
    
    public void agregarPedidoFinalizado (Pedido p){
        this.finalizados.add(p);
    }
    
}
