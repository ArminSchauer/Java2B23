package at.ac.htlstp.et.sj23.k2b;

import java.util.Scanner;

public class Uebung001 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Gib den ersten Widerstand ein: ");
        double r1 = sc.nextDouble();
        System.out.print("Gib den zweiten Widerstand ein: ");
        double r2 = sc.nextDouble();
        sc.close();

        double serie = r1 + r2;
        double parallel = r1 * r2 / (r1 + r2);

        System.out.printf("Serie : %.2f", serie);
        System.out.printf("\nParallel : %.2f", parallel);

    }

}