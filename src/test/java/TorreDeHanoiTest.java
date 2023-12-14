import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TorreDeHanoiTest {
    @Test
    public void testCalcularMovimentos() {
        TorreDeHanoi torreTeste = new TorreDeHanoi(1);
        assertEquals(1, TorreDeHanoi.calcularMovimentos());

        torreTeste.setNumDiscos(2);
        assertEquals(3, TorreDeHanoi.calcularMovimentos());

        torreTeste.setNumDiscos(3);
        assertEquals(7, TorreDeHanoi.calcularMovimentos());

        torreTeste.setNumDiscos(4);
        assertEquals(15, TorreDeHanoi.calcularMovimentos());

        torreTeste.setNumDiscos(5);
        assertEquals(31, TorreDeHanoi.calcularMovimentos());

        torreTeste.setNumDiscos(6);
        assertEquals(63, TorreDeHanoi.calcularMovimentos());
    }

}
