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
public class SistemaGestor {
    
    private ArrayList<Gestor> gestores = new ArrayList();
    
     public void agregar(Gestor g){
        gestores.add(g);
    }
    public Gestor login(String n,String p){
        for(Gestor g:gestores)
            if(g.getNombre().equals(n) && g.getPassword().equals(p))
                return g;
        return null;
    }
    
}
