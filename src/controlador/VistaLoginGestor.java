/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Gestor;

/**
 *
 * @author simonlg
 */
public interface VistaLoginGestor {

    public void error(String login_incorrecto);

    public void ingresar(Gestor gestor);
    
}
