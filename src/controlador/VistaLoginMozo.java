/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Mozo;

/**
 *
 * @author alumnoFI
 */
public interface VistaLoginMozo {

    public void error(String mensaje);

    public void ingresar(Mozo mozo);
    
}
