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
    private String estado; //////////////// Deberia ser un enumerable
    //private enum estado{Pendiente,Tomado,Finalizado;}

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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Pedido(Item item, Mesa mesa) {
        this.item = item;
        this.mesa = mesa;
        this.estado = "Pendiente"; ////// Cuando creo el pedido el estado por defecto es Pendiente
    }

    public void cambiarEstadoATomado() {
        if (this.estado.equals("Pendiente")) {
            this.estado = "Tomado";
        }
    }

    public void cambiarEstadoAFinalizado() {
        if (this.estado.equals("Tomado")) {
            this.estado = "Finalizado";
        }
    }

}
