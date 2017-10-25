/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Mesa;
import modelo.Mozo;

/**
 *
 * @author simonlg
 */
public interface VistaMozo {
    
    public void mostrarNumeroMesaSeleccionada(int numero);

    public void mostrarMesas(ArrayList<Mesa> mesas);
    
    public void agregarItem(); 
    
    public void transferirMesa();

    public void mostrarListaServicioMesa(Mesa seleccionada);

    public void notificarTransferencia(Mozo mozo, Mozo mozoDestino);
    
    public void verServicioMesa(Mesa seleccionada);

    public void notificarTransferencia(Mozo mozo, Mozo mozoDestino, Mesa seleccionada);

    public void error(String mensaje);
    
    public void mostarListaArticulos();

}
