/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaMozo;

import controlador.ControladorLoginMozo;
import javax.swing.JOptionPane;
import controlador.VistaLoginMozo;
import javax.swing.JFrame;
import modelo.Mozo;

/**
 *
 * @author simonlg
 */
public class LoginDialogMozo extends javax.swing.JDialog implements VistaLoginMozo {

    /**
     * Creates new form LoginDialogMozo
     */
    private ControladorLoginMozo controlador;

    public LoginDialogMozo() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        controlador = new ControladorLoginMozo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 30, 60, 20);

        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 80, 60, 20);

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        getContentPane().add(nombre);
        nombre.setBounds(90, 30, 150, 30);

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password);
        password.setBounds(90, 80, 150, 30);

        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(90, 130, 100, 30);

        setBounds(0, 0, 292, 221);
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        login();
    }//GEN-LAST:event_loginActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
        login();
    }//GEN-LAST:event_passwordActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton login;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField password;
    // End of variables declaration//GEN-END:variables

    private void login() {
        controlador.login(nombre.getText(), password.getText());
    }

    @Override
    public void error(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    @Override
    public void ingresar(Mozo mozo) {
        dispose();
        mozo.setLogueado(true);
        JFrame f = new JFrame();
        f.setSize(800, 800);
        PanelMesas pm = new PanelMesas();
        InfoMesaPanel pi = new InfoMesaPanel();
        PanelPalMozoEstatico pe = new PanelPalMozoEstatico(pm, mozo, pi);
        PanelContainerMozo pp = new PanelContainerMozo(pe, pm, pi);
        f.setTitle("Bienvenido " + mozo.getNombreCompleto());
        f.setContentPane(pp);
        f.setVisible(true);
    }
}
