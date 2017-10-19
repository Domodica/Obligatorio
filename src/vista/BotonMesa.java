/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import javax.swing.JButton;
import modelo.Mesa;

/**
 *
 * @author docenteFI
 */
public class BotonMesa extends JButton{
    private Mesa mesa;

    public BotonMesa(Mesa mesa) {
        super(mesa.getNumero()+"");
        this.mesa = mesa;
        if(mesa.getLibre()) setBackground(Color.green);
        else setBackground(Color.red);
    }

    public Mesa getMesa() {
        return mesa;
    }
    
    
    
}
