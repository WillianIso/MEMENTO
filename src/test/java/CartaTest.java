import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;

public class CartaTest {
    @Test
    public void deveArmazenarEstados()
    {
        Carta carta = new Carta();
        carta.setEstado(CartaEstadoEnviada.getInstance());
        carta.setEstado(CartaEstadoEmTransito.getInstance());
        assertEquals(2, carta.getEstados().size());
    }

    @Test
    public void deveRetornarEstadoInicial()
    {
        Carta carta = new Carta();
        carta.setEstado(CartaEstadoEnviada.getInstance());
        carta.setEstado(CartaEstadoEmTransito.getInstance());
        carta.restauraEstado(0);
        assertEquals(CartaEstadoEnviada.getInstance(), carta.getEstado());
    }

    @Test
    public void deveRetornarEstadoAnterior()
    {
        Carta carta = new Carta();
        carta.setEstado(CartaEstadoEnviada.getInstance());
        carta.setEstado(CartaEstadoEmTransito.getInstance());
        carta.setEstado(CartaEstadoEntregue.getInstance());
        carta.restauraEstado(1);
        assertEquals(CartaEstadoEmTransito.getInstance(), carta.getEstado());
    }


    @Test
    public void deveRetornarExcecaoIndiceInvalido()
    {
        try
        {
            Carta carta = new Carta();
            carta.restauraEstado(0);
            fail();
        }catch (IllegalArgumentException e)
        {
            assertEquals("Índice inválido", e.getMessage());
        }
    }


}
