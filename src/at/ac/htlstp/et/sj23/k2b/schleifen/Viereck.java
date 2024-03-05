package at.ac.htlstp.et.sj23.k2b.schleifen;

import java.util.Scanner;

/**
 * Schreibe eine prozedurale Methode "paintQuadrat" welche ein Quadrat aus +-| auf den Bildschirm zeichnet.
 *
 * Die Größe des Quadrats soll dabei als Parameter übergeben werden.
 *
 * Methode:
 *
 * public static void paintQuadrat(int size)
 * Ausgabe für size=4:
 *
 * (c) Schauer Armin
 * Datum: 05.12.2023
 */

public class Viereck {

    /**
     * Zeichnet die einzele Linien des Quarrats
     * @param size Größe Dreieck
     * @param randZeichen Rand Zeichen
     * @param innenZeichen Inneres Zeichen
     */
    public static void vLinie(int size, char randZeichen, char innenZeichen) {
        System.out.print(randZeichen);
        for (int i = 0; i < size; i++) {
            System.out.print(innenZeichen);
        }
        System.out.println(randZeichen);
    }

    /**
     * Zeichnet das Dreick
     * @param size Größe Dreieck
     */
    public static void paintQuadrat(int size) {

        vLinie(size, '+', '-');
        for (int i = 0; i < size; i++) {
            vLinie(size, '|', ' ');
        }
        vLinie(size, '+', '-');

    }

    public static void main(String[] args) {

        int size = 4;
        paintQuadrat(size);

    }

}