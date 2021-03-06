/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Sistema;
import modelo.Mozo;


public class ControladorLoginMozo {
    
    private VistaLoginMozo vista;
    private Sistema fachada = Sistema.getInstancia();

    public ControladorLoginMozo(VistaLoginMozo vista) {
        this.vista = vista;
    }
            
    public void login(String u,String p){
        Mozo mozo = fachada.loginMozo(u, p);
        if(mozo == null){
            vista.error("Login incorrecto");
        }else{  
            vista.ingresar(mozo);
        }
    }
}
