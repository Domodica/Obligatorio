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
public class Sistema {

    private SistemaAtencionCliente sm = new SistemaAtencionCliente(); //NO GETS
    private SistemaProcesadorPedidos sg = new SistemaProcesadorPedidos();

    private static Sistema instancia = new Sistema();

    public static Sistema getInstancia() {
        return instancia;
    }

    private Sistema() {
    }

    public Mozo loginMozo(String n, String p) {
        return sm.login(n, p);
    }

    public void agregar(Mozo m) {
        sm.agregar(m);
    }

    public Gestor loginGestor(String n, String p) {
        return sg.login(n, p);
    }

    public void agregar(Gestor g) {
        sg.agregar(g);
    }

}
