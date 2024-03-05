package at.ac.htlstp.et.sj23.k2b.verzweigungen;

import java.util.Scanner;

/**
 * Gegeben sind die zwei Geraden:
 * y = 1.4x + 2.4
 * y = −1.5x − 0.78
 * Lies von der Tastatur die x- und y-Koordinate eines Punktes ein und bestimme, ob der Punkt oberhalb,zwischen(oder direkt auf einer Geraden) oder unterhalb der beiden Geraden liegt.
 * Verwende für die Angabe der Position die Wörter "über","zwischen" und "unter", die Ausgabe sollte dabei wie folgt aussehen:
 * Punkt x: 4,5
 * Punkt y: 2,3
 * Der Punkt liegt zwischen den Geraden.
 *
 * (c) Schauer Armin
 * Datum: 07.11.2023
 */

public class UebungVerzweigungenBsp2 {

    public static void main(String[] args) {

        double x, y, y1, y2;
        double punktX, punktY;
        Scanner sc = new Scanner(System.in);

        // Einlesen der Konsole
        System.out.print("Punkt x: ");
        punktX = sc.nextDouble();
        System.out.print("Punkt y: ");
        punktY = sc.nextDouble();
        sc.close();

        // Berechnen
        x = punktX;
        y1 = 1.4d * x + 2.4d;
        y2 = -1.5d * x - 0.78d;

        // Logic & Ausgabe
        if (punktY > Math.max(y1, y2)) {
            System.out.print("über");
        }
        else if (punktY < Math.min(y1, y2)) {
            System.out.print("unter");
        }
        else {
            System.out.print("zwischen");
        }

    }

}