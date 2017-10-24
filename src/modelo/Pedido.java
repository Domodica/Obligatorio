/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author simonlg
 */
public class Pedido {
    private Item item;
    private Mesa mesa;
    private enum Estado{
        PENDIENTE, PROCESANDO, TERMINADO;
    }
    private Estado estado;

    public Pedido(Item item, Mesa mesa) {
        this.item = item;
        this.mesa = mesa;
        this.estado = Estado.PENDIENTE;
    }
    
   
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString(){
        return item.getArt().getNombre() + " cantidad: " + item.getCantidad() + " " + item.getDescripcion() + " Mesa:  " + mesa.getNumero() + " " + mesa.getMozo().getNombreCompleto();
    }
}
