/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author simonlg
 */
public class SistemaMozo {

 private ArrayList<Mozo> mozos = new ArrayList();

    
    public void agregar(Mozo m){
        mozos.add(m);
    }
    public Mozo login(String n,String p){
        for(Mozo m:mozos)
            if(m.getNombre().equals(n) && m.getPassword().equals(p))
                return m;
        return null;
    }
}