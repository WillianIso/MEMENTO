import java.util.ArrayList;
import java.util.List;

public class CartaEstadoEnviada extends CartaEstado {
    private CartaEstadoEnviada() {};
    private static CartaEstadoEnviada instance = new CartaEstadoEnviada();
    public static CartaEstadoEnviada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Enviada";
    }

    public boolean enviada(Carta carta) {
        carta.setEstado(CartaEstadoEnviada.getInstance());
        return true;
    }

    public boolean emTransito(Carta carta) {
        carta.setEstado(CartaEstadoEmTransito.getInstance());
        return true;
    }

}
