public class CartaEstadoEmTransito extends CartaEstado {
    private CartaEstadoEmTransito() {};
    private static CartaEstadoEmTransito instance = new CartaEstadoEmTransito();
    public static CartaEstadoEmTransito getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em Trânsito";
    }

    public boolean entregue(Carta carta) {
        carta.setEstado(CartaEstadoEntregue.getInstance());
        return true;
    }
}
