package at.ac.htlstp.et.sj23.k2b.verzweigungen;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TesteSortierungMitUnitTests {

    @Test
    public void testeSortierung() {
        Dreieck2.a = 2.0;
        Dreieck2.b = 1.0;
        Dreieck2.c = 6.0;
        Dreieck2.sortieren();
        assertTrue(Dreieck2.a <= Dreieck2.b);
        assertTrue(Dreieck2.a <= Dreieck2.c);
        assertTrue(Dreieck2.b <= Dreieck2.c);
    }

    public static void pruefe(double x, double y, double z) {
        Dreieck2.a = x;
        Dreieck2.b = y;
        Dreieck2.c = z;
        Dreieck2.sortieren();
        assertTrue(Dreieck2.a <= Dreieck2.b);
        assertTrue(Dreieck2.a <= Dreieck2.c);
        assertTrue(Dreieck2.b <= Dreieck2.c);
    }

    @Test
    public void testeSortierungWeitere() {
        pruefe(2.0, 1.0, 6.0);
        pruefe(6.0, 1.0, 2.0);
        pruefe(1.0, 6.0, 2.0);
        pruefe(7.0, 7.0, 1.0);
        pruefe(5.0, 5.0, 10.0);
        pruefe(1.0, 4.0, 1.0);
    }
}

