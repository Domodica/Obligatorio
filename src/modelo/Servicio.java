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
public class Servicio {
    
    private ArrayList<Item> items;
    private Double total;

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    
    public void agregarItem (Item item){
        items.add(item);
    }

    public Servicio() {
        items = new ArrayList<>();
        total = 0.0;
    }
    
    
    
}
