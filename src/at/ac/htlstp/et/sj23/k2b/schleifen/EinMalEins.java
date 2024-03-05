package at.ac.htlstp.et.sj23.k2b.schleifen;

import java.util.Scanner;

public class EinMalEins {

    public static void printReihe(int reihe) {
        for(int i = 1; i <= 10; ++i) {
            System.out.printf("%2d * %2d = %2d\n", i, reihe, i * reihe);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welche Reihe soll gedruckt werden?\n> ");
        int reihe = sc.nextInt();
        printReihe(reihe);

        do {
            System.out.print("Welche Reihe soll als nächstes gedruckt werden? (0 = Ende)\n> ");
            reihe = sc.nextInt();
        } while(reihe > 0);

        sc.close();
    }
}