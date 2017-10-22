/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Mesa;

/**
 *
 * @author simonlg
 */
public interface VistaMozo {

    public void mostrarNumeroMesaSeleccionada(int numero);

    public void mostrarMesas(ArrayList<Mesa> mesas);

}
