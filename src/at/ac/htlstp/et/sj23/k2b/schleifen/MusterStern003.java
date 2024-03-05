package at.ac.htlstp.et.sj23.k2b.schleifen;

/**
 * Schreibe eine prozedurale Methode "dreieckR" welche ein Dreieck aus Sternen auf den Bildschirm zeichnet.
 *
 * Die Größe des Dreiecks soll dabei als Parameter übergeben werden.
 *
 * Methode:
 *
 * public static void dreieckR(int size)
 * Ausgabe für size=4
 *
 * (c) Schauer Armin
 * Datum: 05/12/2023
 */

public class MusterStern003 {

    /**
     * Erstellt ein Dreicke
     * @param size Größe des Dreiecks
     */
    public static void dreieckR(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= (size - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int size = 4;
        dreieckR(size);
    }

}