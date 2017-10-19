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
public class Mesa {
    
    Boolean libre;
    Integer numero;
    Servicio servicio;
    
    public Boolean getLibre() {
        return libre;
    }

    public void setLibre(Boolean libre) {
        this.libre = libre;
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

    public Mesa(Boolean libre, Integer numero) {
        this.libre = libre;
        this.numero = numero;
    }
    
 public void setAbierta(boolean abierta) {
        this.libre = abierta;
    }
 
    
    
}
