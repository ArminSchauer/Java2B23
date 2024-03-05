package at.ac.htlstp.et.sj23.k2b.smue;

import java.util.Scanner;

/**
 * Schreibe je eine Methode für das kleinste gemeinsame Vielfache und für den größten gemeinsamen Teiler zweier Integer Zahlen.
 *
 * Bei negativen Zahlen soll das Ergebnis immer positiv sein!
 *
 * Hilfe: ggT  kgV
 *
 * Verwende dazu folgende Methodensignatur:
 *
 * public static int ggT(int x, int y)
 * public static int kgV(int x, int y)
 *
 * (c) Schauer Armmin
 * Datum: 19.12.2023
 */

public class SMUE08Bsp1 {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a, b, ggT, kgV;

        System.out.print("Gib die erste Zahl ein: ");
        a = sc.nextInt();
        System.out.print("Gib die zweite Zahl ein:");
        b = sc.nextInt();

        ggT = ggT(a, b);
        kgV = kgV(a, b);
        System.out.printf("Das ggT von %d und %d ist %d\n", a, b, ggT);
        System.out.printf("Das kgV von %d und %d ist %d\n", a, b, kgV);
    }

    /**
     * ggT einer Zahl
     * @param a erste Zahl
     * @param b zweite Zahl
     * @return ggT
     */
    public static int ggT(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        int erg;
        if(a == 0) {
            erg = b;
        }
        else {
            while(b != 0) {
                if(a > b) {
                    a = a - b;
                }
                else {
                    b = b - a;
                }
            }
            erg = a;
        }
        return erg;
    }

    /**
     * kgV einer Zahl
     * @param a erste Zahl
     * @param b zweite Zahl
     * @return kgV
     */
    public static int kgV(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        int erg, ret;
        ret = a * b;
        erg = ggT(a, b);
        ret /= erg;
        return ret;
    }

}
