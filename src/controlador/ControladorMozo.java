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
public class ControladorMozo {

    private Mesa seleccionada;
    private VistaMozo vista;
    private ArrayList<Mesa> mesas;

    public ControladorMozo(VistaMozo vista) {
        crearMesas(); //TRUCHO LAS MESAS
        this.vista = vista;
        vista.mostrarMesas(mesas);
    }

    public void seleccionar(Mesa m) {

        seleccionada = m;
        vista.mostrarNumeroMesaSeleccionada(m.getNumero());

    }

    public void abrir() {
        if (seleccionada != null) {
            seleccionada.setAbierta(true);
            vista.mostrarMesas(mesas);
        }
    }

    private void crearMesas() {
        mesas = new ArrayList();
        for (int x = 10; x <= 30; x += 2) {
            mesas.add(new Mesa(false, x));
        }

    }

}
