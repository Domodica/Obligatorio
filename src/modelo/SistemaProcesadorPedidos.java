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
public class SistemaProcesadorPedidos {

    private ArrayList<Gestor> gestores = new ArrayList();
    private ArrayList<UnidadProcesadora> unidadesProcesadoras = new ArrayList<>();

    public ArrayList<Gestor> getGestores() {
        return gestores;
    }

    public void setGestores(ArrayList<Gestor> gestores) {
        this.gestores = gestores;
    }

    public ArrayList<UnidadProcesadora> getUnidadesProcesadoras() {
        return unidadesProcesadoras;
    }

    public void setUnidadesProcesadoras(ArrayList<UnidadProcesadora> unidadesProcesadoras) {
        this.unidadesProcesadoras = unidadesProcesadoras;
    }

    public void agregar(Gestor g) {
        gestores.add(g);
    }

    public void agregar(UnidadProcesadora uni) {
        unidadesProcesadoras.add(uni);
    }

    public Gestor login(String n, String p) {
        for (Gestor g : gestores) {
            if (g.getNombre().equals(n) && g.getPassword().equals(p)) {
                g.setLogueado(true);
                return g;
            }
        }
        return null;
    }

    public void asignarUPaGestor(Gestor g, UnidadProcesadora up) {
        g.entrarEnServicio(up);
        up.setGestor(g);
    }

    public void agregarPedidoPendiente(Pedido pedido) {
        pedido.getItem().setPedido(pedido);//feo feo esto parece
        for (UnidadProcesadora up : unidadesProcesadoras) {
            if (pedido.getItem().getArt().getUp().equals(up)) {
                up.getPendientes().add(pedido);
                up.avisar(UnidadProcesadora.eventos.nuevoPedido);
            }
        }
    }

    void procesarPedidoPendiente(Pedido pedido, Gestor gestor) {
        gestor.agregarPedidoTomado(pedido);
        gestor.getUp().avisar(UnidadProcesadora.eventos.procesandoPedido);
    }

}
