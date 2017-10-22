/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaMozo;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author docenteFI
 */
public class PanelDinamico extends JPanel{

        
    
    public void cargar(int cantidad,int cols){
        if(cantidad<cols) cols = cantidad;
        setLayout(new GridLayout(0,cols));
        for(int x=1;x<=cantidad;x++){
            add(new JButton(x+""));
        }
        
    }
    
}
