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
public class Sistema {

    private SistemaAtencionCliente sa = new SistemaAtencionCliente(); //NO GETS
    private SistemaProcesadorPedidos spp = new SistemaProcesadorPedidos();

    private static Sistema instancia = new Sistema();

    public static Sistema getInstancia() {
        return instancia;
    }

    private Sistema() {
    }

    public void agregarArticuloAlServicio(Integer cantidad, String des, Articulo art, Mesa mesa) {
        sa.agregarArticuloAlServicio(cantidad, des, art, mesa);
        
    }
    
    public void getLogeados(){
        for(Mozo m : sa.getMozos()){
            if(m.getLogueado())
                System.out.println(m.getNombre() + " logeado  ----");
        }
        for(Gestor g : spp.getGestores()){
            if(g.getLogueado())
                System.out.println(g.getNombre() + " logeado  ----");
        }
        
    }

    public Mozo loginMozo(String n, String p) {
        return sa.login(n, p);
    }

    public void agregar(Mozo m) {
        sa.agregar(m);
    }

    public Gestor loginGestor(String n, String p) {
        return spp.login(n, p);
    }

    public void agregar(Gestor g) {
        spp.agregar(g);
    }

    public void agregar(UnidadProcesadora up) {
        spp.agregar(up);
    }

    public void asignarUPaGestor(Gestor g, UnidadProcesadora up) {
        spp.asignarUPaGestor(g, up);
    }
       
//    public void agregarMesa(Mesa mesa){ 
//        sa.agregarMesa(mesa);
//    }

    public void agregar(Articulo art) {
        sa.agregar(art);
    }

    public ArrayList<Mozo> getMozos() {
        return sa.getMozos();
    }

    public ArrayList<Articulo> getArticulosDisponibles() {
        return sa.getArticulosDisponibles();
    }

    public ArrayList<Gestor> getGestores() {
        return spp.getGestores();
    }

    public ArrayList<UnidadProcesadora> getUnidadesProcesadoras() {
        return spp.getUnidadesProcesadoras();
    }

    public void agregarPedidoPendiente(Pedido pedido) {
        spp.agregarPedidoPendiente(pedido);
    }
    
  

}
