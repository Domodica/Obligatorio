/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Gestor;
import modelo.Sistema;

/**
 *
 * @author simonlg
 */
public class ControladorLoginGestor {

    private VistaLogin vista;
    private Sistema fachada = Sistema.getInstancia();

    public ControladorLoginGestor(VistaLogin vista) {
        this.vista = vista;
    }

    public void login(String u, String p) {
        Gestor gestor = fachada.loginGestor(u, p);
        if (gestor == null) {
            vista.error("Login incorrecto");
        } else {
            vista.ingresar(gestor);
        }
    }
}
