package at.ac.htlstp.et.sj23.k2b.arrays;

/**
 * Methoden für Arrays
 * (c) Schauer Armin
 * Datum: 09.01.2024
 */

public class ArrayMethods {

    /**
     * Gib jedes Element eines Array in die Konsole aus
     * @param prefix Der Prefix ist ein String der vor dem Array folgt
     * @param array Array wird in die Konsole ausgegeben
     * @param suffix Der Suffix ist ein String der nach dem Array ausgeben wird
     */
    public static void printArrayln(String prefix, double[] array, String suffix) {
        System.out.print(prefix);

        for(int i = 0; i < array.length; i++) {
            System.out.print((i == 0?"":" | ") + array[i]);
        }

        System.out.println(suffix);
    }

    /**
     * Überladene Methode printArrayln(), da der Suffix optional ist
     * @param prefix Der Prefix ist ein String der vor dem Array folgt
     * @param array Array wird in die Konsole ausgegeben
     */
    public static void printArrayln(String prefix, double[] array) {
        printArrayln(prefix, array, "");
    }

    /**
     * Die Summe der Elemente eines Arrays wird berechnet
     * @param array Array von welchem die Summe der Elemente berechnet wird
     * @return Summe der Elemente
     */
    public static double sum(double[] array) {
        double sum = 0d;

        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }

    /**
     * Es soll an das Array ein Wert angehängt werden
     * @param array Array
     * @param x Wert
     * @return neues Array
     */
    public static double[] push(double[] array, double x) {
        double[] result = new double[array.length + 1];

        for(int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        result[array.length] = x;

        return result;
    }

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
     * Einem Array wird bei einer bestimmten Position ein Element hinzugefügt
     * @param array Array welchem ein Element hinzugefügt werden soll
     * @param pos Die Position an der das Element hinzugefügt werden soll
     * @param x Der Wert des hinzuzufügenden Elements
     * @return Das Array mit dem hinzugefügten Element
     */
    public static double[] insert(double[] array, int pos, double x) {
        double[] result = new double[array.length];

        for(int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        if(pos >= array.length) {
            for(int y = 0; y < pos - array.length; y++) {
                result = push(result, 0);
            }
            result = push(result, x);
            return result;
        }
        result[pos] = array[pos];

        return result;
    }

    /**
     * Einem Array soll bei einer bestimmten Position ein Element entfernt werden
     * @param array Array welchem ein Element entfernt werden soll
     * @param pos Die Position an der das Element entfernt werden soll
     * @return Das Array mit den zurückgebliebenen Elementen
     */
    public static double[] delete(double[] array, int pos) {
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
