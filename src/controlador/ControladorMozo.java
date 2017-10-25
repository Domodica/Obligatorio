package controlador;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import modelo.Articulo;
import modelo.Item;
import modelo.Mesa;
import modelo.Mozo;
import modelo.Pedido;
import modelo.Sistema;

/**
 *
 * @author simonlg
 */
public class ControladorMozo implements Observer {

    private Sistema fachada = Sistema.getInstancia();
    private Mesa mesaSeleccionada;
    private VistaMozo vista;
    private Mozo mozo;
    private Item item;
    private Pedido pedido;

    public Mesa getMesaSeleccionada() {
        return mesaSeleccionada;
    }

    public void setMesaSeleccionada(Mesa seleccionada) {
        this.mesaSeleccionada = seleccionada;
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

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public ControladorMozo(VistaMozo vista, Mozo mozo) {
        this.vista = vista;
        this.mozo = mozo;
        this.mozo.addObserver(this);
        vista.mostrarMesas(mozo.getListaMesas());
    }

    public void seleccionar(Mesa m) {
        mesaSeleccionada = m;
        vista.mostrarNumeroMesaSeleccionada(m.getNumero());
    }

    public void verServicio() {
        if (mesaSeleccionada != null && mesaSeleccionada.getAbierta()) {
            vista.verServicioMesa(mesaSeleccionada);
        } else {
            vista.error("La mesa seleccionada esta cerrada o no a seleccionado ninguna");
        }
    }

    public void abrir() {
        if (mesaSeleccionada != null) {
            if (mozo.abrirMesa(mesaSeleccionada)) {
                vista.mostrarMesas(mozo.getListaMesas());
            } else {
                vista.error("La mesa ya se encuentra abierta");
            }
        } else {
            vista.error("No hay mesa seleccionada");
        }
    }

    public void cerrar() {
        if (mesaSeleccionada != null) {
            if (mozo.cerrarMesa(mesaSeleccionada)) {
                vista.mostrarMesas(mozo.getListaMesas());
            } else {
                vista.error("La mesa ya se encuentra cerrada o tiene pedidos pendientes");
            }
        } else {
            vista.error("No hay mesa seleccionada");
        }
    }

    public ArrayList<Articulo> articulosDisponibles() {
        return fachada.getArticulosDisponibles();
    }

    @Override
    public void update(Observable origen, Object evento) {
        if (evento.equals(Mozo.eventos.transferencia)) {
            notificarMozoDestino();
        }
    }

    public void agregarItemAlServicio(Articulo articulo, Integer cantidad, String des) {
        if (mesaSeleccionada.getAbierta()) {
            item = new Item(articulo, cantidad, des);
            if (fachada.agregarItemServicio(mesaSeleccionada, item)) {
                pedido = new Pedido(item, mesaSeleccionada);
                fachada.agregarPedidoPendiente(pedido);
                vista.mostarListaArticulos();
            } else {
                vista.error("No hay stock suficiente para ese pedido");
            }
        } else {
            vista.error("La mesa seleccionada debe estar abierta.");
        }

    }

    public void tranferirMesa() {
        mozo.solicitarTransferencia(mozo, mesaSeleccionada);
    }

    private void notificarMozoDestino() {
        vista.notificarTransferencia(this.getMozo(), this.getMozo().getTransferencia().getMozoDestino(), this.getMesaSeleccionada());

    }

    public void errorDatosItem() {
        vista.error("La cantidad ingresada debe ser un numero entero.");
    }

    public void agregarNuevoItem() {
        if(mesaSeleccionada != null && mesaSeleccionada.getAbierta())
            vista.agregarItem();
        else
            vista.error("La mesa se encuentra cerrada o no ha seleccionado ninguna");
    }
}
