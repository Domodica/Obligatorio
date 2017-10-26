/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author simonlg
 */
public interface VistaGestor {

    public void mostrarUnidadesProcesadoras();

    public void ingresarPuesto();

    public void mostrarPedidosPendientes();
    
    public void mostrarPedidosEnProceso();

    public void tomarPedido();

    public void finalizarPedido();

    public void error(String mensaje);

}
