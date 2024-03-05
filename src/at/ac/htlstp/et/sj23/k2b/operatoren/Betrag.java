package at.ac.htlstp.et.sj23.k2b.operatoren;

import java.util.Scanner;

public class Betrag {
    public Betrag() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zahl : ");
        double x = sc.nextDouble();
        sc.close();
        double abs = x < 0.0 ? -x : x;
        System.out.printf("Absulutbetrag von %f = %f\n", x, abs);
    }
}
