/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import modelo.Articulo;
import modelo.Gestor;
import modelo.Mesa;
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
        new InicioAppJDialog().setVisible(true);
        cargarDatos();
    }

    private static void cargarDatos() {

        Sistema logica = Sistema.getInstancia();
        Mozo m = new Mozo("m m", "m", "m", false);
        Mozo j = new Mozo("Juan Perez", "Juan", "moon", false);
        Mozo a = new Mozo("Ana Lopez", "Ana", "moon", false);
        Gestor p = new Gestor("Pepe", "p", "p", false);
        logica.agregar(m);
        logica.agregar(j);
        logica.agregar(a);
        logica.agregar(p);
        UnidadProcesadora parrilla = new UnidadProcesadora("Parrilla");
        UnidadProcesadora bar = new UnidadProcesadora("Bar");
        UnidadProcesadora cocina = new UnidadProcesadora("Cocina");
        UnidadProcesadora sushi = new UnidadProcesadora("Sushi");
        logica.agregar(parrilla);
        logica.agregar(sushi);
        logica.agregar(cocina);
        logica.agregar(bar);

        Mesa m1 = new Mesa(false, 1, m);
        Mesa m2 = new Mesa(false, 2, m);
        Mesa m3 = new Mesa(false, 3, m);
        Mesa m4 = new Mesa(false, 4, m);
        Mesa m5 = new Mesa(false, 5, m);
        Mesa m6 = new Mesa(false, 6, j);
        Mesa m7 = new Mesa(false, 7, j);
        Mesa m8 = new Mesa(false, 8, j);

        logica.agregar(new Articulo(1, "Chivito", 350.0, 80, cocina));
        logica.agregar(new Articulo(2, "Panchos", 150.0, 80, cocina));
        logica.agregar(new Articulo(3, "Sopa", 120.0, 10, sushi));
        logica.agregar(new Articulo(4, "Hambur", 250.0, 3, parrilla));

    }

}
