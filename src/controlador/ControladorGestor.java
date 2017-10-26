/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Observable;
import java.util.Observer;
import modelo.Gestor;
import modelo.Pedido;
import modelo.Sistema;
import modelo.UnidadProcesadora;

/**
 *
 * @author simonlg
 */
public class ControladorGestor implements Observer{
    
    private VistaGestor vista;
    private Sistema fachada = Sistema.getInstancia();
    private Gestor gestor;


    public Gestor getGestor() {
        return gestor;
    }
    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }
    public VistaGestor getVista() {
        return vista;
    }
    public void setVista(VistaGestor vista) {
        this.vista = vista;
    }
    public Sistema getFachada() {
        return fachada;
    }
    public void setFachada(Sistema fachada) {
        this.fachada = fachada;
    }
   
    public ControladorGestor( VistaGestor vista, Gestor gestor) {
        this.vista = vista;
        this.gestor = gestor;
    }
     
    @Override
    public void update(Observable origen, Object evento) {
        if(evento.equals(UnidadProcesadora.eventos.nuevoPedido) || evento.equals(UnidadProcesadora.eventos.pedidoTomado)){
            vista.mostrarPedidosPendientes();
        }
        else if(evento.equals(UnidadProcesadora.eventos.procesandoPedido)){
            vista.mostrarPedidosEnProceso();
        }
    }

    public void entrarUP(UnidadProcesadora up){
        fachada.asignarGestorUP(up, gestor);
    }

    
    public void tomarPedido(Pedido pedido) {
        fachada.procesarPedidoPendiente(pedido, gestor);
    }

    private void cargarPedidosProcesados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void finalizarPedidoProcesado(Pedido p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
  
}    