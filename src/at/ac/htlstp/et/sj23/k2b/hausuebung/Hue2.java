package at.ac.htlstp.et.sj23.k2b.hausuebung;

import java.util.Scanner;

/**
 * Schreibe ein Java Programm, welches eine Ganzzahl welche maximal 5
 * Stellen haben darf einliest, die Ziffernsumme berechnet und anschließend die Ziffernsumme ausgibt.
 *
 * Die Ausgabe sollte dabei wie folgt aussehen:
 *
 * Gib eine Zahl ein : 34
 * Ziffernsumme : 7
 *
 * (c) Schauer Armin
 * Datum: 10.10.2023
 */

public class Hue2 {

    public static void main(String[] args) {

        int ziffer, ziffernsumme;
        Scanner sc = new Scanner(System.in);

        // Ziffer von der Konsole einlesen
        System.out.print("Gib eine Zahl ein : ");
        ziffer = sc.nextInt();
        sc.close();

        // Sicherstellen das die Ziffer nicht mehr als 5 Stellen hat
        if(ziffer < 100000 && ziffer > -100000) {
            // Berechen der Ziffernsumme
            ziffernsumme = (ziffer / 10000) % 10
                    + (ziffer / 1000) % 10
                    + (ziffer / 100) % 10
                    + (ziffer / 10) % 10
                    + ziffer % 10;

            // Ausgabe
            System.out.printf("Ziffernsumme : %d\n", ziffernsumme);
        }
        else {
            System.out.println("Die eingebene Ziffer darf nicht mehr als 5 Stellen haben!");
        }
    }

}