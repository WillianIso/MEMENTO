import java.util.ArrayList;
import java.util.List;

public class Carta {

    private String nomeCarta;
    private CartaEstado estado;

    private List<CartaEstado> memento = new ArrayList<CartaEstado>();

    public CartaEstado getEstado() {
        return this.estado;
    }

    public void setEstado(CartaEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<CartaEstado> getEstados() {
        return this.memento;
    }






    public Carta() {
        this.estado = CartaEstadoEnviada.getInstance();
    }
    public boolean enviada() {
        return estado.enviada(this);
    }

    public boolean emTransito() {
        return estado.emTransito(this);
    }

    public boolean entregue() {
        return estado.entregue(this);
    }

    public String toString() {
        return "Carta " + estado.toString();
    }
}