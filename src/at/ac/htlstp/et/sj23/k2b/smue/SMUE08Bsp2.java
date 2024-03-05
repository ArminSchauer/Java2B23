package at.ac.htlstp.et.sj23.k2b.smue;

/**
 * Schreibe eine prozedurale Methode "paintZ" welche ein großes Z wie angegeben auf den Bildschirm zeichnet.
 *
 * Die Größe des Buchstabens soll dabei als Parameter übergeben werden.
 *
 * Methode:
 *
 * public static void paintZ(int size)
 * Ausgabe für size=4:
 *
 * ---->
 *    /
 *   /
 *  /
 * <----
 *
 * (c) Schauer Armin
 * Datum: 19.12.2023
 */
public class SMUE08Bsp2 {

    public static void main(String[] args) {
        paintZ(4);
    }

    /**
     * Zeichnet das Z
     * @param size Größe
     */
    public static void paintZ(int size) {
        ersteZeile(size);
        for(int i = 1; i < size; i++) {
            for(int j = 0; j < (size -i); j++) {
                System.out.print(" ");
            }
            System.out.print("/\n");
        }
        letzteZeile(size);
    }

    /**
     * erste Zeile
     * @param size Größe
     */
    public static void ersteZeile(int size) {
        for(int i = 0; i < size; i++) {
            System.out.print("-");
        }
        System.out.println(">");
    }

    /**
     * letzte Zeile
     * @param size Größe
     */
    public static void letzteZeile(int size) {
        System.out.print("<");
        for(int i = 0; i < size; i++) {
            System.out.print("-");
        }
    }

}