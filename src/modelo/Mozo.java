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
public class Mozo extends Usuario {

    private ArrayList<Mesa> listaMesas;
    private Transferencia transferencia;

    public ArrayList<Mesa> getListaMesas() {
        return listaMesas;
    }
    public void setListaMesas(ArrayList<Mesa> listaMesas) {
        this.listaMesas = listaMesas;
    }
    public Transferencia getTransferencia() {
        return transferencia;
    }
    public void setTransferencia(Transferencia transferencia) {
        this.transferencia = transferencia;
    }
    
    public Mozo(String nombreCompleto, String nombre, String password, Boolean logueado) {
        super(nombreCompleto, nombre, password, logueado);
        this.listaMesas = new ArrayList<>();
    }

    public void agregarMesa(Mesa m) {
        this.listaMesas.add(m);
    }

    public void avisar(eventos eventos) { //esto deberia ser privado o protectes, entonces el item y el pedido se cren en el mozo?
        setChanged();
        notifyObservers(eventos);
    }

    public enum eventos {
        agregarArticulo;
    }

}
