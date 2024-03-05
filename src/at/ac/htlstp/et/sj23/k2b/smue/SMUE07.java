package at.ac.htlstp.et.sj23.k2b.smue;

/**
 * Schreibe je eine Methode "ser" und "par" welche den Serien- und Parallelersatzwiderstand von zwei Widerständen (double!) berechnet!
 * (c) Schauer Armin
 * Datum: 21.11.2023
 */

public class SMUE07 {

    public static void main(String[] args) {

        double widerstand1 = 10d, widerstand2 = 50d;
        double ergSer, ergPar;
        ergSer = ser(widerstand1, widerstand2);
        ergPar = par(widerstand1, widerstand2);

    }


    /**
     * Serienschaltung
     * @param r1 Widerstand 1
     * @param r2 Widerstand 2
     * @return seriellerWiderstand
     */
    public static double ser(double r1, double r2) {
        double seriellerWiderstand;

        seriellerWiderstand = r1 + r2;

        return seriellerWiderstand;
    }

    /**
     * Parallelschlatung
     * @param r1 Widerstand 1
     * @param r2 Widerstand 2
     * @return parallelerWiderstand
     */
    public static double par(double r1, double r2) {
        double parallelerWiderstand;

        parallelerWiderstand = (r1 * r2) / (r1 + r2);

        return parallelerWiderstand;
    }

}