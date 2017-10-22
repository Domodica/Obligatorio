/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import modelo.Mesa;
import modelo.Mozo;
import vistaMozo.ServicioMesa;

/**
 *
 * @author simonlg
 */
public class ControladorMozo implements Observer{ 

    private Mesa seleccionada;
    private VistaMozo vista;
    private Mozo mozo;

    public ControladorMozo(VistaMozo vista, Mozo mozo) {
        this.vista = vista;
        this.mozo = mozo;
        vista.mostrarMesas(mozo.getListaMesas());
    }

    public void seleccionar(Mesa m) {
        seleccionada = m;
        vista.mostrarNumeroMesaSeleccionada(m.getNumero());
    }

    public void abrir() {
        if (seleccionada != null) {
            seleccionada.setAbierta(true);
            vista.mostrarMesas(mozo.getListaMesas());
            

        }
    }

    @Override
    public void update(Observable o, Object arg) { 
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void verServicio() {
        if(seleccionada.getAbierta())
            new ServicioMesa(seleccionada).setVisible(true);
    }

    

}
