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
public class Transferencia {
    private Mozo mozoDestino;
    private Mesa mesaATransferir;

    public Mesa getMesaATransferir() {
        return mesaATransferir;
    }

    public void setMesaATransferir(Mesa mesaATransferir) {
        this.mesaATransferir = mesaATransferir;
    }

    public Mozo getMozoDestino() {
        return mozoDestino;
    }

    public void setMozoDestino(Mozo mozoDestino) {
        this.mozoDestino = mozoDestino;
    }

    public Transferencia(Mozo mozoDestino, Mesa mesaATransferir) {
        this.mozoDestino = mozoDestino;
        this.mesaATransferir = mesaATransferir;
    }


    
    
    
}
