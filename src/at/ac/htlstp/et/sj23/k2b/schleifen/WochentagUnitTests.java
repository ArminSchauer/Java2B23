package at.ac.htlstp.et.sj23.k2b.schleifen;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WochentagUnitTests {

    @Test
    public void testeWochentag() {
        pruefe(2023, 12, 19, 2);
        pruefe(1970, 5, 13, 3);
        pruefe(1888, 8, 18, 6);
        pruefe(750, 3, 2, 4);
        pruefe(1587, 7, 6, 1);
        pruefe(2024, 3, 10, 0);
    }

    public static void pruefe(int jahr, int monat, int tag, int tagIndex) {
        int ti = Wochentag.wochentag(jahr, monat, tag);
        assertEquals(tagIndex, ti);
    }
}
