/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Observable;
import java.util.Observer;
import modelo.Gestor;
import modelo.Sistema;
import modelo.UnidadProcesadora;

/**
 *
 * @author simonlg
 */
public class ControladorGestor implements Observer{
    
    private UnidadProcesadora puesto;
    private VistaGestor vista;
    private Sistema fachada = Sistema.getInstancia();
    private Gestor gestor;

    public UnidadProcesadora getPuesto() {
        return puesto;
    }

    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    public void setPuesto(UnidadProcesadora puesto) {
        this.puesto = puesto;
    }

    public VistaGestor getVista() {
        return vista;
    }

    public void setVista(VistaGestor vista) {
        this.vista = vista;
    }

    public Sistema getFachada() {
        return fachada;
    }

    public void setFachada(Sistema fachada) {
        this.fachada = fachada;
    }

    public ControladorGestor( VistaGestor vista, Gestor gestor) {

        this.vista = vista;
        this.gestor = gestor;
    }
    
    
    
    
    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
  
}    