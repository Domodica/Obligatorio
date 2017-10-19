/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorMozo;
import controlador.VistaMozo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import modelo.Mesa;

/**
 *
 * @author docenteFI
 */
public class PanelEstatico extends javax.swing.JPanel implements ActionListener,VistaMozo{

    /**
     * Creates new form PanelEstatico
     */
    private PanelMesas panelMesas;
    private ControladorMozo controlador;
    public PanelEstatico(PanelMesas pm) {
        initComponents();
        panelMesas = pm;
        pm.setEscuchador(this);
        controlador = new ControladorMozo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mesaSel = new javax.swing.JLabel();
        abrirMesa = new javax.swing.JButton();

        setLayout(null);

        mesaSel.setText("SELECCIONADA:");
        add(mesaSel);
        mesaSel.setBounds(180, 40, 120, 20);

        abrirMesa.setText("ABRIR");
        abrirMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirMesaActionPerformed(evt);
            }
        });
        add(abrirMesa);
        abrirMesa.setBounds(50, 90, 110, 70);
    }// </editor-fold>//GEN-END:initComponents

    private void abrirMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirMesaActionPerformed
        // TODO add your handling code here:
        controlador.abrir();
    }//GEN-LAST:event_abrirMesaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abrirMesa;
    private javax.swing.JLabel mesaSel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("ACTION");
        BotonMesa b = (BotonMesa) e.getSource();
        controlador.seleccionar(b.getMesa());
    }

    @Override
    public void mostrarNumeroMesaSeleccionada(int numero) {
        mesaSel.setText("SELECCIONADA: " + numero);
    }

    @Override
    public void mostrarMesas(ArrayList<Mesa> mesas) {
        panelMesas.mostrar(mesas, 5);
    }
}