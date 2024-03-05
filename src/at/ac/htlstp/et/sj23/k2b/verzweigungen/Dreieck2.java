package at.ac.htlstp.et.sj23.k2b.verzweigungen;

import java.util.Scanner;

public class Dreieck2 {
    public static double a, b, c, h;

    public static void sortieren() {
        if (a > b) {
            h = a;
            a = b;
            b = h;
        }

        if (a > c) {
            h = a;
            a = c;
            c = h;
        }

        if (b > c) {
            h = b;
            b = c;
            c = h;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("erste Seitelänge: ");
        a = sc.nextDouble();
        System.out.print("zweite Seitelänge: ");
        b = sc.nextDouble();
        System.out.print("dritte Seitelänge: ");
        c = sc.nextDouble();
        sc.close();
        sortieren();
        Dreiecksbestimmung.bestimme(a, b, c);
    }
}
