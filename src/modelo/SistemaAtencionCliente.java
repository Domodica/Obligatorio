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
public class SistemaAtencionCliente {

    private ArrayList<Mozo> mozos = new ArrayList();
    private ArrayList<Articulo> articulos = new ArrayList();

    public ArrayList<Mozo> getMozos() {
        return mozos;
    }

    public void setMozos(ArrayList<Mozo> mozos) {
        this.mozos = mozos;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

    public void agregar(Mozo m) {
        mozos.add(m);
    }

    public void agregar(Articulo art) {
        articulos.add(art);
    }

    public Mozo login(String n, String p) {
        for (Mozo m : mozos) {
            if (m.getNombre().equals(n) && m.getPassword().equals(p) && m.getLogueado() == false) {
                m.setLogueado(true);
                return m;
            }
        }
        return null;
    }

    public boolean agregarNuevoItemPedido(Mesa mesa, Item item) {
        //la mesa esta abierta, hace falta verificar aca otra vez?? cuando es mucho hablando de verificar?
        boolean agregado = false;
        if (item.getArt().getStock() >= item.getCantidad()) {
            mesa.agregarItemServicio(item);
            item.getArt().descontarStock(item.getCantidad());
            agregado = true;
        }
        return agregado;
    }

//    public void agregarItemAlServicio(Integer cantidad, String des, Articulo art, Mesa m) {
//        Item i = new Item(art, cantidad, des);
//        if (m.getAbierta()) {
//            if (art != null) {
//                if (art.getStock() < cantidad) {
//                    System.out.println("sin stock");
//                } else if (cantidad <= 0) {
//                    System.out.println("cantidad Invalida");
//                } else {
//                    m.getServicio().agregarItem(i);
//                    System.out.println("Item agregado a la mesa " + m.getNumero());
//                    art.descontarStock(cantidad);
//                    enviarPedidoAUp(i, m);
//                }
//            } else {
//                System.out.println("Debe seleccionar un artículo de la lista");
//            }
//        } else {
//            System.out.println("Debe abrir la mesa");
//        }
//
////        if (art.getStock() >= cantidad && cantidad > 0) {
////            mesa.getServicio().agregarItem(new Item(art, cantidad, des));
////            System.out.println("    agregado");
////        }
//    }
    public ArrayList<Articulo> getArticulosDisponibles() {
        ArrayList<Articulo> ret = new ArrayList<>();
        for (Articulo art : articulos) {
            if (art.getStock() > 0) {
                ret.add(art);
            }
        }
        return ret;
    }

    public void enviarPedidoAUp(Item i, Mesa m) { ////////////////////////////////
//        Pedido p = new Pedido(i, m);
//        UnidadProcesadora upPedido = i.getArt().getUp();
//        upPedido.agregarPedidoPendiente(p);
    }

    ArrayList<Mozo> getMozosLogueados(Mozo miMozo) { //----------------------------------------
        ArrayList<Mozo> mozosLog = new ArrayList<Mozo>();
        for (Mozo m : getMozos()) {
            if (m.getLogueado() && !m.equals(miMozo)) {
                mozosLog.add(m);
            }
        }
        return mozosLog;
           
    }

    void avisarPedidoProcesado(Mesa mesa) {
        mesa.getMozo().avisar(Mozo.eventos.pedidoProcesado);
    }

}
