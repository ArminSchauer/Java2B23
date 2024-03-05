package at.ac.htlstp.et.sj23.k2b.schleifen;

import java.util.Scanner;

/**
 * Schreibe eine Methode, welche die Ziffernsumme einer Integer-Zahl berechnet. Bei negativen Zahlen soll auch die Ziffernsumme negativ sein!
 *
 * Verwende dazu folgende Methodensignatur:
 *
 * public static int ziffernsumme(int x)
 *
 * (c) Schauer Armin
 * Datum: 14/12/2023
 */

public class Uebung003 {

    /**
     * Diese Funktion nimmt eine Zahl und berechnet von dieser die Ziffernsumme
     * @param x Die Zahl, von welcher die Ziffernsumme brechnet werden soll
     * @return Ziffernsumme sum
     */

    public static int ziffernsumme(int x) {
        int sum = 0;
        int zs = 0;
        boolean isNeg = false;

        if (x < 0) {
            isNeg = true;
            x = Math.abs(x);
        }

        while (x > 0) {
            zs += x%10;
            x = x/10;
        }

        if (isNeg) {
            sum -= zs;
        }
        else {
            sum = zs;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        int ziffernsumme = 0;

        System.out.print("Gib eine Zahl ein: ");
        num = sc.nextInt();

        ziffernsumme = ziffernsumme(num);

        System.out.printf("Die Ziffernsumme beträgt: %d", ziffernsumme);

    }

}