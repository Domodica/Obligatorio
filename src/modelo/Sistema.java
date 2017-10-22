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

    private SistemaAtencionCliente sa = new SistemaAtencionCliente(); //NO GETS
    private SistemaProcesadorPedidos spp = new SistemaProcesadorPedidos();

    private static Sistema instancia = new Sistema();

    public static Sistema getInstancia() {
        return instancia;
    }

    private Sistema() {
    }

    public Mozo loginMozo(String n, String p) {
        return sa.login(n, p);
    }

    public void agregar(Mozo m) {
        sa.agregar(m);
    }

    public Gestor loginGestor(String n, String p) {
        return spp.login(n, p);
    }

    public void agregar(Gestor g) {
        spp.agregar(g);
    }

    public void agregar(UnidadProcesadora up) {
        spp.agregar(up);
    }

    public void asignarUPaGestor(Gestor g, UnidadProcesadora up) {
        spp.asignarUPaGestor(g, up);
    }
    
  

}
