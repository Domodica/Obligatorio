/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaMozo;

import controlador.ControladorMozo;
import controlador.VistaMozo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import modelo.Item;
import modelo.Mesa;
import modelo.Mozo;

/**
 *
 * @author docenteFI
 */
public class PanelPalMozoEstatico extends javax.swing.JPanel implements ActionListener, VistaMozo {

    /**
     * Creates new form PanelPalMozoEstatico
     */
    private PanelMesas panelMesas;
    private ControladorMozo controlador;
    private InfoMesaPanel panelInfo;

    public PanelPalMozoEstatico(PanelMesas pm, Mozo mozo, InfoMesaPanel pi) {
        initComponents();
        panelMesas = pm;
        pm.setEscuchador(this);
        panelInfo = pi;
        pi.setEscuchador(this);
        controlador = new ControladorMozo(this, mozo);
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
        btnSalirSistema = new javax.swing.JButton();
        verServicio = new javax.swing.JButton();

        setLayout(null);

        mesaSel.setText("Mesa seleccionada:");
        add(mesaSel);
        mesaSel.setBounds(30, 20, 170, 40);

        abrirMesa.setText("ABRIR MESA");
        abrirMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirMesaActionPerformed(evt);
            }
        });
        add(abrirMesa);
        abrirMesa.setBounds(150, 90, 110, 40);

        btnSalirSistema.setText("SALIR del sistema");
        add(btnSalirSistema);
        btnSalirSistema.setBounds(450, 10, 80, 30);

        verServicio.setText("VER SERVICIO");
        verServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verServicioActionPerformed(evt);
            }
        });
        add(verServicio);
        verServicio.setBounds(320, 90, 120, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void abrirMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirMesaActionPerformed
        // TODO add your handling code here:
        controlador.abrir();
    }//GEN-LAST:event_abrirMesaActionPerformed

    private void verServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verServicioActionPerformed
//        controlador.verServicio();
    }//GEN-LAST:event_verServicioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abrirMesa;
    private javax.swing.JButton btnSalirSistema;
    private javax.swing.JLabel mesaSel;
    private javax.swing.JButton verServicio;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "AGREGAR ITEM":
                agregarItem();
                break;
            case "TRANSFERIR MESA":
                System.out.println("    transferir");
                break;
            case "CERRAR MESA":
                System.out.println("    cerrar");
                break;
            default:
                BotonMesa b = (BotonMesa) e.getSource();
                controlador.seleccionar(b.getMesa());
                break;
        }

    }

    @Override
    public void mostrarNumeroMesaSeleccionada(int numero) {
        mesaSel.setText("Mesa seleccionada: " + numero);
    }

    @Override
    public void mostrarMesas(ArrayList<Mesa> mesas) {
        panelMesas.mostrar(mesas, 5);
    }

    @Override
    public void agregarItem() {
        AgregarItemJDialog nuevo = new AgregarItemJDialog(this.controlador);
        nuevo.setVisible(true);
    }

    @Override
    public void transferirMesa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}