package at.ac.htlstp.et.sj23.k2b.hausuebung;

import java.util.Scanner;

/**
 * Entwickle ein Java-Programm, welches vom Benutzer eine Temperatur in °C abfrägt und dann die Temperatur in Kelvin ausgibt.
 * Verwende eine formatierte Ausgabe mit drei Nachkommastellen!
 *
 * (c) Schauer Armin
 * Datum: 26.09.2023
 */

public class Hue1Bsp2 {

    public static void main(String[] args) {

        // Deklarationen
        double temperaturCelsius;
        double temperaturKelvin;
        Scanner sc = new Scanner(System.in);


        // Konsole: Einlesen der Temperatur in Grad Celsius
        System.out.print("Temperatur in Celsius: ");
        temperaturCelsius = sc.nextDouble();
        sc.close();

        // Temperatur in Kelvin umrechnen
        temperaturKelvin = temperaturCelsius + 273.15d;

        // Ausgabe der Berechnung
        System.out.printf("Temperatur in Kelvin: %.3f K\n", temperaturKelvin);

    }

}
