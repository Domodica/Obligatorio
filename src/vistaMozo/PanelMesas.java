/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaMozo;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import modelo.Mesa;

/**
 *
 * @author docenteFI
 */
public class PanelMesas extends JPanel {

    private ActionListener al;

    public void setEscuchador(ActionListener al) {
        this.al = al;
    }

    public void mostrar(ArrayList<Mesa> mesas, int cols) {
        removeAll();
        if (mesas.size() < cols) {
            cols = mesas.size();
        }

        setLayout(new GridLayout(0, cols));

        for (Mesa m : mesas) {
            BotonMesa b = new BotonMesa(m);
            b.addActionListener(al);
            add(b);
        }
        validate();
    }

}
