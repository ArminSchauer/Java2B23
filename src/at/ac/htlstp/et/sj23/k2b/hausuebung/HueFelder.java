package at.ac.htlstp.et.sj23.k2b.hausuebung;

/**
 * Schreibe ein Methode removeElement, welche aus einem gegebenen Feld ein Element herauslöscht und dann als neues Feld zurückgibt. Hierbei darf das ursprüngliche Feld nicht verändert werden.
 * Der Import vom Package "Arrays" ist nicht erlaubt!
 * verwende folgenden Methodenkopf:
 * public static double[] removeElement(double feld[], int pos)
 * Beispiel:
 * double x[] = { 4,5,6,7};
 * double y[] = removeElement(x,2);
 * Im Feld y[] steht nun [4,5,7] da der Index 2 gelöscht wurde und x[] bleibt unverändert
 *
 * (c) Schauer Armin
 * Datum: 19.01.2024
 */

public class HueFelder {

    public static void main(String[] args) {
        double x[] = {23, 3, 77, 1, 3};
        double y[] = removeElement(x, 2);
    }

    /**
     * Einem Array soll bei einer bestimmten Position ein Element entfernt werden
     * @param array Array welchem ein Element entfernt werden soll
     * @param pos Die Position an der das Element entfernt werden soll
     * @return Das Array mit den zurückgebliebenen Elementen
     */
    public static double[] removeElement(double[] array, int pos) {
        double[] result = new double[array.length - 1];

        int y = 0;
        for(int i = 0; i <= result.length; i++) {
            if(pos != i) {
                result[y] = array[i];
                y++;
            }
        }

        return result;
    }

}
