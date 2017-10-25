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
public class Gestor extends Usuario {

    private UnidadProcesadora up;
    private ArrayList<Pedido> tomados;
    private ArrayList<Pedido> finalizados;
    
    
    public UnidadProcesadora getUp() {
        return up;
    }
    
    public void setUp(UnidadProcesadora up) {
        this.up = up;
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

    
    
    
    public Gestor(String nombreCompleto, String nombre, String password, Boolean logueado) {
        super(nombreCompleto, nombre, password, logueado);
        tomados = new ArrayList<>();
        finalizados = new ArrayList<>();
    }

    
    public void agregarPedidoTomado (Pedido p){
        tomados.add(p);
        p.cambiarEstadoATomado();
        up.removerPendiente(p);
    }
    
  

    public boolean quedanPendientes(){
        return (up.getPendientes().size()>0);
    }
    
    public void entrarEnServicio(UnidadProcesadora up) {
        this.setUp(up);
    }
    

}
