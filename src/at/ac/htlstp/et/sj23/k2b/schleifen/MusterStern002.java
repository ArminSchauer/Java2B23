package at.ac.htlstp.et.sj23.k2b.schleifen;

/**
 * Schreibe eine prozedurale Methode "dreieckL" welche ein Dreieck aus Sternen auf den Bildschirm zeichnet.
 *
 * Die Größe des Dreiecks soll dabei als Parameter übergeben werden.
 *
 * Methode:
 *
 * public static void dreieckL(int size)
 * Ausgabe für size=4
 *
 * (c) Schauer Armin
 * Datum: 05/12/2023
 */

public class MusterStern002 {

    /**
     * Erstellt ein Dreicke
     * @param size Größe des Dreiecks
     */
    public static void dreieckL(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int size = 4;
        dreieckL(size);
    }

}