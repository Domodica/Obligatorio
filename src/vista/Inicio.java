/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import modelo.Articulo;
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
        new InicioAppJDialog().setVisible(true);
        
        cargarDatos();
    }
    
    private static void cargarDatos() {
        
        Sistema logica = Sistema.getInstancia();
        logica.agregar(new Mozo("m m", "m", "m", false));
        logica.agregar(new Mozo("Juan Perez", "Juan", "moon", false));
        logica.agregar(new Mozo("Ana Lopez", "Ana", "moon", false));
        logica.agregar(new Gestor("Pepe", "Pepe", "moon", false));
        UnidadProcesadora parrilla = new UnidadProcesadora("Parrilla");
        UnidadProcesadora bar = new UnidadProcesadora("Bar");
        UnidadProcesadora cocina = new UnidadProcesadora("Cocina");
        UnidadProcesadora sushi = new UnidadProcesadora("Sushi");
        logica.agregar(parrilla);
        logica.agregar(sushi);
        logica.agregar(cocina);
        logica.agregar(bar);

        logica.agregarMesa("m", false, 1);
        logica.agregarMesa("m", false, 3);
        logica.agregarMesa("m", false, 5);
        logica.agregarMesa("m", false, 7);
        logica.agregarMesa("m", true, 9);
        logica.agregarMesa("m", false, 10);

        //Mesas al mozo Juan ///////////////////// NOMBRE MOZO TIENE QUE SER UNICO PARA HACERLO ASI
        logica.agregarMesa("Juan", false, 2);
        logica.agregarMesa("Juan", false, 4);
        logica.agregarMesa("Juan", false, 6);
        
        logica.agregar(new Articulo(1,"Chivito",350.0,80,cocina));
        logica.agregar(new Articulo(2,"Panchos",150.0,80,cocina));
        logica.agregar(new Articulo(3,"Sopa",120.0,10,sushi));
        logica.agregar(new Articulo(4,"Hambur",250.0,3,parrilla));

        
    }
    
}
