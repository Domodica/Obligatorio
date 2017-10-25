/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import modelo.Articulo;
import modelo.Item;
import modelo.Mesa;
import modelo.Mozo;
import modelo.Servicio;
import modelo.Sistema;
import modelo.Transferencia;
import vistaMozo.PanelMesas;

/**
 *
 * @author simonlg
 */
public class ControladorMozo implements Observer {

    private Mesa seleccionada;
    private VistaMozo vista;
    private Mozo mozo;
    private Sistema fachada = Sistema.getInstancia();
    private Item item;

    public Mesa getSeleccionada() {
        return seleccionada;
    }

    public void setSeleccionada(Mesa seleccionada) {
        this.seleccionada = seleccionada;
    }

    public Mozo getMozo() {
        return mozo;
    }

    public void setMozo(Mozo mozo) {
        this.mozo = mozo;
    }

    public Sistema getFachada() {
        return fachada;
    }

    public void setFachada(Sistema fachada) {
        this.fachada = fachada;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public ControladorMozo(VistaMozo vista, Mozo mozo) {
        this.vista = vista;
        this.mozo = mozo;
        vista.mostrarMesas(mozo.getListaMesas());

        //TRANSFERENCIA
        mozo.addObserver(this);
    }

    public void seleccionar(Mesa m) {
        seleccionada = m;
        vista.mostrarNumeroMesaSeleccionada(m.getNumero());
    }

    public void abrir() {
        if (seleccionada != null && !seleccionada.getAbierta()) { //////!seleccionada.getAbierta( en LN
            mozo.abrirMesa(seleccionada); /// PROFE dijo abrirMesa() lo tiene que tener el mozo
            System.out.println("Mesa abierta");
            vista.mostrarMesas(mozo.getListaMesas());
        } else {
            System.out.println("Para abrir una mesa debe seleccionar una cerrada");
        }
    }

    public void cerrar() {
        if (!fachada.evaluarPedidosPendientesMesa(seleccionada)) {
            mozo.cerrarMesa(seleccionada);
            System.out.println("Mesa cerrada");
            vista.mostrarMesas(mozo.getListaMesas());
        } else {
            System.out.println("Para cerrar la mesa no debe tener pedidos pendientes");
        }
    }

    public ArrayList<Articulo> articulosDisponibles() {
        return fachada.getArticulosDisponibles();
    }

    @Override
    public void update(Observable origen, Object evento) {
        if(evento.equals(Mozo.eventos.transferenciaIniciada)){
            notificarMozoDestino();         
        }
    }

    public void verServicio() {
        if (seleccionada != null && seleccionada.getAbierta()) {
            vista.mostrarListaServicioMesa(seleccionada);
        } else {
            System.out.println("No se puede mostrar el servicio. Seleccione una mesa abierta.");
        }
    }

    public void tranferirMesa() {
        mozo.solicitudTransferencia(mozo, seleccionada);
    }

    private void notificarMozoDestino() {
       vista.notificarTransferencia(this.getMozo(), this.getMozo().getTransferencia().getMozoDestino()); 
        
    }

}
