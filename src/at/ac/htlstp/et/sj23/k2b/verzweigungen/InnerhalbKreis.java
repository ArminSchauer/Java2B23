package at.ac.htlstp.et.sj23.k2b.verzweigungen;

import java.util.Scanner;

/**
 * Entwickle ein Java-Programm, welches folgende Aufgabenstellung erfüllt:
 * Lies einen Kreis (x, y Koordinate von Mittelpunkt und Radius) und einen Punkt ein und bestimme,
 * ob dieser Punkt innerhalb des Kreises liegt!
 * Lies der Reihe nach ein: Mittelpunkt x, Mittelpunkt y, Radius, zweiter Punkt x, zweiter Punkt y.
 * Als Antwort gibt entweder "innerhalb des Kreises" oder "außerhalb des Kreises" aus!
 *
 * (c) Armin Schauer
 * Datum: 6.11.2023
 */

public class InnerhalbKreis {

    public static void main(String[] args) {

        double mittelpunktX, mittelpunktY;
        double radius;
        double punktX, punktY;
        double vektorPunktX, vektorPunktY;
        double betragVektorPunkt;
        Scanner sc = new Scanner(System.in);

        //Einlesen der Konsole
        System.out.print("X Koordinate des Mittelpunkts: ");
        mittelpunktX = sc.nextDouble();
        System.out.print("Y Koordinate des Mittelpunkts: ");
        mittelpunktY = sc.nextDouble();
        System.out.print("Radius: ");
        radius = sc.nextDouble();
        System.out.print("X Koordinate vom einem Punkt: ");
        punktX = sc.nextDouble();
        System.out.print("X Koordinate von einem Punkt: ");
        punktY = sc.nextDouble();
        sc.close();

        // Berechnen der Vektoren
        vektorPunktX = punktX - mittelpunktX;
        vektorPunktY = punktY - mittelpunktY;
        betragVektorPunkt = Math.sqrt((vektorPunktX * vektorPunktX) + (vektorPunktY * vektorPunktY));

        // Logic & Ausgabe
        if (radius > betragVektorPunkt) {
            System.out.println("innerhalb des Kreises");
        }
        else {
            System.out.println("außerhalb des Kreises");
        }

    }

}