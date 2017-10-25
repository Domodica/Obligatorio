/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.ControladorMozo;
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

    public void borrarMesa(Mesa m) {
        this.listaMesas.remove(m);
    }

    public void avisar(eventos eventos) { 
        setChanged();
        notifyObservers(eventos);
    }

    public void solicitudTransferencia(Mozo mDestino, Mesa seleccionada) {
        Transferencia t = new Transferencia(mDestino, seleccionada);
        mDestino.transferencia = t;
        mDestino.avisar(eventos.transferenciaIniciada);
    }

    public void transferir() {
        Mesa m = this.getTransferencia().getMesaATransferir();
        this.getTransferencia().getMozoDestino().agregarMesa(m);        
        this.borrarMesa(m);
        this.transferencia = null;        
    }

    public enum eventos {
        agregarArticulo, 
        transferencia, 
        transferenciaIniciada;
    }

    public boolean tieneMesasAbiertas() {
        for (Mesa m : getListaMesas()) {
            if (m.getAbierta()) {
                return true;
            }
        }
        return false;
    }

    public void solicitarTransferencia(Mozo mDestino, Mesa seleccionada) {
        System.out.println("mozo origen: " + this.getNombreCompleto());
        System.out.println("mozo destino: " + mDestino.getNombreCompleto());
        Transferencia t = new Transferencia(mDestino, seleccionada); //////////// La creo??
        this.transferencia = t;
        avisar(eventos.transferencia);
    }

    public boolean tieneTransferenciaPendiente() {
        return getTransferencia() == null;
    }

    public boolean abrirMesa(Mesa seleccionada) {
        if (seleccionada != null && !seleccionada.getAbierta()) {
            seleccionada.abrir();
            return true;
        } else {
            return false;
        }
    }

    public boolean cerrarMesa(Mesa seleccionada) {
        if (seleccionada != null && seleccionada.getAbierta() && !seleccionada.tieneServicioPendiente()) {
            seleccionada.cerrar();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.getNombreCompleto();
    }
}
