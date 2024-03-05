package at.ac.htlstp.et.sj23.k2b.arrays;

import java.util.Vector;

public class Primzahlen2 {

    public static Vector<Integer> prims(long max) {
        Vector<Integer> p = new Vector<Integer>();
        int i, j;


        LOOP:
        for(i = 3; i <= max; i += 2) {
            for(j = 0; j < p.size(); j++) {
                if(i % p.get(j) == 0) continue LOOP;
            }
            p.add(i);
        }
        p.insertElementAt(2, 0);

        return p;
    }

    public static void main(String[] args) {

        Vector<Integer> p;
        long t = System.currentTimeMillis();
        p = prims(Integer.MAX_VALUE);
        t = System.currentTimeMillis() - t;
        System.out.println("PZ:" + p);
        System.out.println("Dauer: " + t + "ms");

    }

}
