/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Articulo;
import modelo.Sistema;

/**
 *
 * @author simonlg
 */
public class ControladorAgregarItem {

    private Sistema fachada = Sistema.getInstancia();
    private VistaAgregarItem vista;

    public ControladorAgregarItem(VistaAgregarItem vista) {
        this.vista = vista;
    }
    
   public ArrayList<Articulo> getArticulosDisponibles(){
       
       ArrayList<Articulo> ret = new ArrayList<>();
       for (Articulo art : fachada.getArticulos()) {
           if(art.getStock()> 0)
               ret.add(art);
       }
       return ret;
       //esto va en logica
   
   }
   
   public void agregarItem(){
   
   }

}
