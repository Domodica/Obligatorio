/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author simonlg
 */
public class Gestor extends Usuario {

    private UnidadProcesadora up;

    public UnidadProcesadora getUp() {
        return up;
    }
    public void setUp(UnidadProcesadora up) {
        this.up = up;
    }

    public Gestor(String nombreCompleto, String nombre, String password, Boolean logueado) {
        super(nombreCompleto, nombre, password, logueado);

    }

}
