package at.ac.htlstp.et.sj23.k2b.dateien.cvs;

import java.util.Arrays;

public class SplitTest {

    public static void main(String[] args) {

        String s = "ab;34;;xy;0";
        String[] spalten;

        spalten = s.split(";");
        System.out.println(Arrays.toString(spalten));
        System.out.println("2. Spalte: " + spalten[1]);
        try {
            System.out.println("8. Spalte: " + spalten[7]);
        } catch (Exception e) {
            System.out.println("Keine 8. Spalte vorhanden");
        }


    }

}
