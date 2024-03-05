package at.ac.htlstp.et.sj23.k2b.hausuebung;

import java.util.Scanner;

/**
 * Entwickle ein Java-Programm, welches folgende Aufgabenstellung erfüllt:
 * Lies vom Benutzer den Radius eines Kreises ein und gib Umfang und Fläche aus.
 * Die Ausgabe des Ergebnisses sollte wie folgt aussehen:
 * A = 30,35
 * U = 14,80
 *
 * (c) Schauer Armin
 * Datum: 26.09.2023
 */

public class Hue1Bsp3 {

    public static void main(String[] args) {

        // Deklarationen
        double pi = 3.1415926536d;
        double radius;
        double flaeche;
        double umfang;
        Scanner sc = new Scanner(System.in);

        // Konsole: Einlesen des Radius
        System.out.print("Radius = ");
        radius = sc.nextDouble();
        sc.close();

        // Flaeche/Umfang des Keis berechnen
        flaeche = radius * radius * pi;
        umfang = 2d * radius * pi;

        // Ausgabe der Berechnung
        System.out.printf("A = %.2f\nU = %.2f\n", flaeche, umfang);

    }

}