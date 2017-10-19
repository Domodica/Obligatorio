/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.Mozo;
import modelo.Sistema;

/**
 *
 * @author simonlg
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VentantaPrincipalJFrame v = new VentantaPrincipalJFrame();
        v.setVisible(true);
        cargarDatos();
    }
    
    private static void cargarDatos() {
        
        Sistema logica = Sistema.getInstancia();
        
        logica.agregar(new Mozo("Gabriel Rodriguez","Gabriel","moon",false));
        logica.agregar(new Mozo("Juan Perez","Juan","moon",false));
        logica.agregar(new Mozo("Ana Lopez","Ana","moon",false));
        
        
        
        
        
    }
    
}
