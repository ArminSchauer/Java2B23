package at.ac.htlstp.et.sj23.k2b.hausuebung;

import java.util.Scanner;

/**
 * Entwickle ein Java-Programm, welches folgende Aufgabenstellung erfüllt:
 * Lies die 3 Seitenlängen eines Dreiecks ein und bestimme welches Dreieck sie bilden (keines, rechtwinkelig, gleichschenkelig, gleichseitig, allgemein, gleichschenkelig-rechtwinkelig)
 * Die Bestimmung soll auf etwa 0.1Prozent genau erfolgen!
 * Gib anschließend die Art des Dreiecks mit den folgenden Texten aus:
 * "kein Dreieck","rechtwinkeliges Dreieck","gleichschenkeliges Dreieck", "rechtwinkeliges gleichschenkeliges Dreieck","gleichseitiges Dreieck","allgemeines Dreieck"
 *
 * (c) Schauer Armin
 * Datum: 07.11.2023
 */

public class Hue3 {

    public static void main(String[] args) {

        double a, b, c, h;
        Scanner sc = new Scanner(System.in);

        // Einlesen der Konsole
        System.out.print("Seitelänge a des Dreiecks: ");
        a = sc.nextDouble();
        System.out.print("Seitelänge b des Dreiecks: ");
        b = sc.nextDouble();
        System.out.print("Seitelänge c des Dreiecks: ");
        c = sc.nextDouble();
        sc.close();

        if (a > b) { h = a; a = b; b = h; }
        if (a > c) { h = a; a = c; c = h; }
        if (b > c) { h = b; b = c; c = h; }

        double toleranz = 0.001;
        if (a +b < c)  {
            System.out.println("kein Dreieck");
        }
        else if ((Math.abs(a - c) < toleranz)) {
            System.out.println("gleichseitiges Dreieck");
        }
        else if ((Math.abs(a-b) < toleranz) && (Math.abs(a*a + b*b - c*c) < toleranz)) {
            System.out.println("rechtwinkeliges gleichschenkeliges Dreieck");
        }
        else if (Math.abs(a-b) < toleranz || Math.abs(b-c) < toleranz) {
            System.out.println("gleichschenkeliges Dreieck");
        }
        else if (Math.abs(a*a + b*b - c*c) < toleranz) {
            System.out.println("rechtwinkeliges Dreieck");
        }
        else {
            System.out.println("allgemeines Dreieck");
        }

    }

}
