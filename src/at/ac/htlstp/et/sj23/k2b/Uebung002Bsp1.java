package at.ac.htlstp.et.sj23.k2b;

/**
 * Schreibe die Methoden "isPos","isNeg","isNull" welche prüfen ob eine double Zahl positiv, negativ oder null ist. Das Ergebnis soll true oder false sein!
 * (c) Schauer Armin
 * Datum: 21.11.2023
 */

public class Uebung002Bsp1 {

    public static void main(String[] args) {

        double number = -34d;
        boolean istPos, istNeg, istNull;
        istPos = isPos(number);
        istNeg = isNeg(number);
        istNull = isNull(number);

    }

    /**
     * ist die Zahl positiv
     * @param num Number
     * @return isPos
     */
    public static boolean isPos(double num) {
        boolean isPos;

        if (num > 0d) {
            isPos = true;
        } else {
            isPos = false;
        }

        return isPos;
    }

    /**
     * ist die Zahl negativ
     * @param num Number
     * @return isNeg
     */
    public static boolean isNeg(double num) {
        boolean isNeg;

        if (num < 0d) {
            isNeg = true;
        } else {
            isNeg = false;
        }

        return isNeg;
    }

    /**
     * ist die Zahl null
     * @param num Number
     * @return isNull
     */
    public static boolean isNull(double num) {
        boolean isNull;

        if (num == 0d) {
            isNull = true;
        } else {
            isNull = false;
        }

        return isNull;
    }

}