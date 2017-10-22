/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import vista.VentantaPrincipalJFrame;
import modelo.Gestor;
import modelo.Mozo;
import modelo.Sistema;
import modelo.UnidadProcesadora;

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
                logica.agregar(new Mozo("m m", "m", "m", false));
        logica.agregar(new Mozo("Juan Perez", "Juan", "moon", false));
        logica.agregar(new Mozo("Ana Lopez", "Ana", "moon", false));
        logica.agregar(new Gestor("Pepe", "Pepe", "moon", false));
        logica.agregar(new UnidadProcesadora("Parrilla"));
        logica.agregar(new UnidadProcesadora("Bar"));
        logica.agregar(new UnidadProcesadora("Sushi"));
        logica.agregar(new UnidadProcesadora("Cocina"));

        //Mesas al mozo Gabriel ///////////////////// NOMBRE MOZO TIENE QUE SER UNICO PARA HACERLO ASI
        logica.agregarMesa("m", false, 1);
        logica.agregarMesa("m", false, 3);
        logica.agregarMesa("m", false, 5);
        logica.agregarMesa("m", false, 7);
        logica.agregarMesa("m", false, 9);
        logica.agregarMesa("m", false, 10);

        //Mesas al mozo Juan ///////////////////// NOMBRE MOZO TIENE QUE SER UNICO PARA HACERLO ASI
        logica.agregarMesa("Juan", false, 2);
        logica.agregarMesa("Juan", false, 4);
        logica.agregarMesa("Juan", false, 6);

        logica.agregarArt(1, "Chivito", 150.0, 100);
        logica.agregarArt(2, "panchos", 100.0, 80);
        logica.agregarArt(3, "fritas", 80.0, 150);
        logica.agregarArt(4, "pollo", 150.0, 2);

    }

}
