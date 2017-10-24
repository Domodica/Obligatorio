/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;



public class Mesa {
    
    private Boolean abierta;
    private Integer numero;
    private Servicio servicio;
    private Mozo mozo;

    public Mozo getMozo() {
        return mozo;
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
        if(servicio != null)
            servicio.agregarItem(item);
    }
    


}

