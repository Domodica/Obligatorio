/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaMozo;

import controlador.ControladorMozo;
import controlador.VistaMozo;
import java.awt.GridLayout;
import java.util.ArrayList;
import modelo.Mesa;
import modelo.Mozo;

/**
 *
 * @author simonlg
 */
public class PanelContainerMozo extends javax.swing.JPanel {

    private ControladorMozo controlador;
    private PanelMesas pm;
    private PanelPalMozoEstatico pe;
    /**
     * Creates new form PanelPpalMozo
     */
    public PanelContainerMozo(PanelPalMozoEstatico pe, PanelMesas pm, InfoMesaPanel pi) {
        setLayout(new GridLayout(3,1));
        add(pm);
        add(pe); 
        add(pi);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
