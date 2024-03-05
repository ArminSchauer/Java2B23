package at.ac.htlstp.et.sj23.k2b.smue;

/**
 * Methoden:
 * public static double min(double feld[])
 * public static double max(double feld[])
 * public static double mw(double feld[])
 *
 * (c) Schauer Armin
 * Datum: 16.01.2024
 */

public class SMUE09 {

    /**
     * Der Mittelwert aller Elemente des Arrays wird berechnet
     * @param array Array von welchem der Mittelwert aller Elemente berechnet wird
     * @return Mittelwert aller Elemente
     */
    public static double mw(double[] array) {
        double mw = 0d;

        for(int i = 0; i < array.length; i++) {
            mw += array[i];
        }
        mw /= array.length;

        return mw;
    }

    /**
     * Berechnet den maximalen Wert aller Elemente
     * @param array Array von welchem der Maximalwert aller Elemente berechnet wird
     * @return Maximalerwert aller Elemente
     */
    public static double max(double[] array) {
        double max = 0d;
        double lastMax = array[0];

        for(int i = 1; i < array.length; i++) {
            max = array[i];
            if(max > lastMax) {
                lastMax = max;
            }
        }

        return lastMax;
    }

    /**
     * Berechnet den minimalen Wert aller Elemente
     * @param array Array von welchem der Minimalwert aller Elemente berechnet wird
     * @return Minimalen Wert aller Elemente
     */
    public static double min(double[] array) {
        double min = 0d;
        double lastMin = array[0];

        for(int i = 1; i < array.length; i++) {
            min = array[i];
            if(lastMin > min) {
                lastMin = min;
            }
        }

        return lastMin;
    }

}
