package controlador;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import modelo.Articulo;
import modelo.Item;
import modelo.Mesa;
import modelo.Mozo;
import modelo.Pedido;
import modelo.Servicio;
import modelo.Sistema;

/**
 *
 * @author simonlg
 */
public class ControladorMozo implements Observer{ 

    private Mesa seleccionada;
    private VistaMozo vista;
    private Mozo mozo;
    private Sistema fachada = Sistema.getInstancia();
    private Item item;
    private Pedido pedido;

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
        seleccionada = m;
        vista.mostrarNumeroMesaSeleccionada(m.getNumero());
    }
    
//  public void verServicio() {
//        if(seleccionada.getAbierta())
//            new ServicioMesa(seleccionada).setVisible(true);
//    }
  
    public void abrir() {
        if (seleccionada != null && !seleccionada.getAbierta()) {
            seleccionada.setAbierta(true);
            seleccionada.setServicio(new Servicio());
            vista.mostrarMesas(mozo.getListaMesas());
        }
    }
    
    public ArrayList<Articulo> articulosDisponibles(){
        return fachada.getArticulosDisponibles();
    }

    
    
    @Override
    public void update(Observable origen, Object evento) { 
         if(evento.equals(Mozo.eventos.agregarArticulo)){
             System.out.println(" entro controlador mozo  ");
        }
    }
    public void agregarItemAlServicio(Articulo articulo, Integer cantidad, String des) {
       //new en el controlador, pueden ir?
        item = new Item(articulo,cantidad,des);
        pedido = new Pedido(item, seleccionada);
        this.seleccionada.agregarItemServicio(item);
        fachada.agregarPedidoPendiente(pedido);
        mozo.avisar(Mozo.eventos.agregarArticulo);
    }


}
