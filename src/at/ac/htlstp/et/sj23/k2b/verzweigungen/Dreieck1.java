package at.ac.htlstp.et.sj23.k2b.verzweigungen;

import java.util.Scanner;

public class Dreieck1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("erste Seitelänge: ");
        double a = sc.nextDouble();
        System.out.print("zweite Seitelänge: ");
        double b = sc.nextDouble();
        System.out.print("dritte Seitelänge: ");
        double c = sc.nextDouble();
        sc.close();
        double h;
        if (a > b) {
            h = a;
            a = b;
            b = h;
        } else if (a > c) {
            h = a;
            a = c;
            c = h;
        } else if (b > c) {
            h = b;
            b = c;
            c = h;
        }

        System.out.printf("%f <= %f <= %f\n", a, b, c);
    }
}
