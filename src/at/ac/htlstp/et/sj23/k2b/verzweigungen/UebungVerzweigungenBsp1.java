package at.ac.htlstp.et.sj23.k2b.verzweigungen;

import java.util.Scanner;

/**
 * Entwickle ein Java-Programm, welches folgende Aufgabenstellung erfüllt:
 * Es sollen 2 ganze Zahlen eingelesen werden. Wenn die hunderter-Ziffern beider Zahlen gleich sind soll die Summe der beiden Zahlen ausgegeben werden, ansonsten soll die Differenz der beiden Zahlen ausgegeben werden.
 * Die Ausgabe sollte wie folgt aussehen:
 * Ergebnis : 435
 *
 * (c) Schauer Armin
 * Datum: 07.11.2023
 */

public class UebungVerzweigungenBsp1 {

    public static void main(String[] args) {

        int ersteZahl, zweiteZahl;
        int ergebnis;
        Scanner sc = new Scanner(System.in);

        // Einlesen der Konsole
        System.out.print("Erste Zahl: ");
        ersteZahl = sc.nextInt();
        System.out.print("Zweite Zahl: ");
        zweiteZahl = sc.nextInt();
        sc.close();

        // Logic
        if ((ersteZahl / 100) % 10 == (zweiteZahl / 100) % 10) {
            // Berechnen der Summe
            ergebnis = ersteZahl + zweiteZahl;
        }
        // Berechen der Differenz
        else if (ersteZahl > zweiteZahl) {
            ergebnis = ersteZahl - zweiteZahl;
        }
        else {
            ergebnis = zweiteZahl - ersteZahl;
        }

        // Ausgabe
        System.out.printf("Ergebnis : %d", ergebnis);

    }

}