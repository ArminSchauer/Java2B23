package at.ac.htlstp.et.sj23.k2b;

import java.util.Scanner;

public class Widerstand {

    public static void main(String[] args) {

        double spannung = 0.0;
        double strom = 0.0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Spannung = ");
        spannung = sc.nextDouble();
        strom = sc.nextDouble();

        double widerstand = spannung / strom;

        System.out.printf("Widerstand = %8.3f Ohm", widerstand);
        System.out.printf("\nAngabe: U=%8.3f V, I=%8.3f A\n", spannung, strom);

    }

}