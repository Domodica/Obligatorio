package modelo;

/**
 *
 * @author simonlg
 */
public class Pedido {

    private Item item;
    private Mesa mesa;
    private UnidadProcesadora procesadora;
    private Estado estado;
    
    public Pedido(Item item, Mesa mesa) {
        this.item = item;
        this.mesa = mesa;
        this.estado = Estado.PENDIENTE;
        procesadora = null;
    }

    public Item getItem() {
        return item;
    }

    public UnidadProcesadora getProcesadora() {
        return procesadora;
    }

    public void setProcesadora(UnidadProcesadora procesadora) {
        this.procesadora = procesadora;
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

    public void cambiarEstadoPendienteATomado(UnidadProcesadora up) {
        if (this.estado.equals(Estado.PENDIENTE)) {
            this.estado = Estado.PROCESANDO;
            this.procesadora = up;
        }
    }
        public void cambiarEstadoTomadoAFinalizado() {
        if (this.estado.equals(Estado.PROCESANDO)) {
            this.estado = Estado.TERMINADO;
        }
    }

    @Override
    public String toString() {
        return item.getArt().getNombre() + " cantidad: " + item.getCantidad() + " " + item.getDescripcion() + " Mesa:  " + mesa.getNumero() + " " + mesa.getMozo().getNombreCompleto();
    }

    public String getEstadoItem() {
        if(this.getEstado().equals(Estado.PENDIENTE))
            return getEstado().toString();
        else
            return getEstado().toString() + " -- " + procesadora.getGestor().getNombreCompleto();
    }
}
