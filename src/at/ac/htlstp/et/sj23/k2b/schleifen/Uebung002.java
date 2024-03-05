package at.ac.htlstp.et.sj23.k2b.schleifen;

import java.util.Scanner;

public class Uebung002 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char zeichen = 'A';
        System.out.print("Gib eine Größe ein: ");
        int g = sc.nextInt();
        sc.close();
        int hoehe = 2 * g;

        for(int i = 1; i < hoehe; ++i) {
            int j;
            if (i == 1) {
                System.out.print(' ');

                for(j = 0; j < g - 2; ++j) {
                    System.out.print(zeichen);
                }

                System.out.println(' ');
            }

            if (i == g) {
                for(j = 0; j < g; ++j) {
                    System.out.print(zeichen);
                }

                System.out.print("\n");
            } else {
                System.out.print(zeichen);

                for(j = 0; j < g - 2; ++j) {
                    System.out.print(' ');
                }

                System.out.println(zeichen);
            }
        }

    }
}
