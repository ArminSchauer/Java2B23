package at.ac.htlstp.et.sj23.k2b.hausuebung;

import java.util.Scanner;

/**
 * Schreibe je eine Methode für die Berechnung der Fläche und des Umfanges eines Kreises.
 *
 * Verwende hierzu folgende Methodenköpfe:
 *
 * public static double kreisUmfang(double r)
 * public static double kreisFlaeche(double r)
 * Schreibe dazu ein Testprogramm, welches von der Tastatur den Radius einliest und dann Fläche und Umfang ausgibt.
 *
 * Die Ausgabe des Ergebnisses sollte wie folgt aussehen:
 *
 * A = 30,35
 * U = 14,80
 *
 * (c) Schauer Armin
 * Datum: 20.11.2023
 */

public class Hue4 {

    public static void main(String[] args) {

        double umfang, fleache, radius;
        Scanner sc = new Scanner(System.in);

        // Konsole einlesen
        System.out.print("Gib einen Radius ein: ");
        radius = sc.nextDouble();
        sc.close();

        // Methoden aufrufen
        umfang = kreisUmfang(radius);
        fleache = kreisFlaeche(radius);

        // Ausgabe
        System.out.printf("A = %f\n", fleache);
        System.out.printf("U = %f\n", umfang);

    }

    /**
     * Hier wird der Umfang des
     * Kreises berechnet
     * @param r Radius des Keises
     * @return kreisUmfang
     */
    public static double kreisUmfang(double r) {
        double kreisUmfang;

        // Berechnung des Umfangs
        kreisUmfang = 2d * r * Math.PI;

        return kreisUmfang;
    }

    /**
     * Hier wird die Fläche des
     * Kreises berechnet
     * @param r Radius des Keises
     * @return kreisFlache
     */
    public static double kreisFlaeche(double r) {
        double kreisFlaeche;

        // Berechnung der Fläche
        kreisFlaeche = r*r * Math.PI;

        return kreisFlaeche;
    }

}