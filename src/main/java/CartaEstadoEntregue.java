public class CartaEstadoEntregue extends CartaEstado {
    private CartaEstadoEntregue() {};
    private static CartaEstadoEntregue instance = new CartaEstadoEntregue();
    public static CartaEstadoEntregue getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Entregue";
    }
}
