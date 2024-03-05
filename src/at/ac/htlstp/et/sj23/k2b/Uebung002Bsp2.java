package at.ac.htlstp.et.sj23.k2b;

/**
 * Schreibe eine Methode "zwischen" welche prüft ob eine Zahl in einem Zahlenbereich zwischen zwei Zahlen liegt.
 *
 * Die Methode sollte folgenden Syntax haben:
 *
 * public static boolean zwischen(double x, double a, double b)
 * Die Methode liefert true wenn x zwischen a und b oder genau a oder genau b ist. Alle Werte sind dabei beliebig wählbar.
 *
 * (c) Schauer Armin
 * Datum: 21.11.2023
 */

public class Uebung002Bsp2 {

    public static void main(String[] args) {

        boolean isZwischen;
        isZwischen = zwischen(3d, 11d, 22d);
        System.out.println(isZwischen);

    }

    /**
     * testet ob X zwischen A & B ist
     * @param x Variable X
     * @param a Variable A
     * @param b Variable B
     * @return ist
     */
    public static boolean zwischen(double x, double a, double b) {
        boolean ist;

        if (x == a || x == b) {
            ist = true;
        }
        else if ((x > a && x < b) || (x < a && x > b)) {
            ist = true;
        }
        else {
            ist = false;
        }

        return ist;

    }

}