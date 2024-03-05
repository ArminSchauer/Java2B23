package at.ac.htlstp.et.sj23.k2b.schleifen;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Uebung003UnitTest {

    @Test
    public void testeZiffernsumme() {
        pruefen(15, 6);
        pruefen(45, 9);
        pruefen(44, 8);
        pruefen(-123, -6);
        pruefen(200, 2);
        pruefen(-321, -6);
        pruefen(11, 2);
        pruefen(43, 7);
    }

    public static void pruefen(int ziffer, int ziffernsumme) {
        int zs = Uebung003.ziffernsumme(ziffer);
        assertEquals(ziffernsumme, zs);
    }
}
