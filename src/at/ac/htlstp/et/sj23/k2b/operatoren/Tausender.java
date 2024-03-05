package at.ac.htlstp.et.sj23.k2b.operatoren;

import java.util.Scanner;

public class Tausender {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Wert: ");
        int wert = sc.nextInt();
        sc.close();
        int tz = wert / 1000 % 10;
        System.out.printf("Die tausender Ziffen von %d ist %d !\n", wert, tz);
    }
}
