public abstract class CartaEstado {

    public abstract String getEstado();

    public boolean enviada(Carta carta) {
        return false;
    }
    public boolean emTransito(Carta carta) {
        return false;
    }
    public boolean entregue(Carta carta) {
        return false;
    }

}