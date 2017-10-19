/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Observable;

/**
 *
 * @author simonlg
 */
public abstract class Usuario extends Observable {

    private String nombreCompleto;
    private String nombre;
    private String password;
    private Boolean logueado;

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getLogueado() {
        return logueado;
    }

    public void setLogueado(Boolean logueado) {
        this.logueado = logueado;
    }

    public Usuario(String nombreCompleto, String nombre, String password, Boolean logueado) {
        this.nombreCompleto = nombreCompleto;
        this.nombre = nombre;
        this.password = password;
        this.logueado = logueado;
    }
    
    
    
}
