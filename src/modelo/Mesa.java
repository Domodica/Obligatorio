/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;



public class Mesa {
    
    private Boolean abierta;
    private Integer numero;
    private Servicio servicio;
    private Mozo mozo;
    private ArrayList<Pedido> pedidos;
    //la mesa deberia tener una lista de sus pedidos, al iniciar el servicio se le hace new
    
    public Mozo getMozo() {
        return mozo;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    public void setMozo(Mozo mozo) {
        this.mozo = mozo;
    }
    public Boolean getAbierta() {
        return abierta;
    }
    public void setAbierta(Boolean abierta) {
        this.abierta = abierta;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public Servicio getServicio() {
        return servicio;
    }
    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Mesa(Boolean libre, Integer numero, Mozo mozo) {
        this.abierta = libre;
        this.numero = numero;
        this.mozo = mozo;
        mozo.agregarMesa(this);
    }
    
    public void agregarItemServicio(Item item){
        if(servicio != null && pedidos != null){
            servicio.agregarItem(item);
            pedidos.add(new Pedido(item, this));
        }
    }
    
    public boolean tieneServicioPendiente(){
        boolean pendiente = false;
        for (Pedido p : pedidos){
            if(!p.getEstado().equals(Estado.TERMINADO))
                pendiente = true;
        }
        return pendiente;
    }
   
    void abrir() {
        abierta = true;
        servicio = new Servicio();
        pedidos = new ArrayList<>();
        
    }

    void cerrar() {
        abierta = false;
        servicio = null;
        pedidos = null;
    }

}

