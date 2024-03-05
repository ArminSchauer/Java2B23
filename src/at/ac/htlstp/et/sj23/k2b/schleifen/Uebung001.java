package at.ac.htlstp.et.sj23.k2b.schleifen;

import java.util.Scanner;

public class Uebung001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Gib ein Höhe ein: ");
        int hoehe = sc.nextInt();
        System.out.print("Gib ein Breite ein: ");
        int breite = sc.nextInt();
        sc.close();

        for(int i = 0; i < hoehe; ++i) {
            for(int j = 0; j < breite; ++j) {
                System.out.print('x');
            }

            System.out.print("\n");
        }

    }
}