package at.ac.htlstp.et.sj23.k2b.arrays;

import at.ac.htlstp.et.sj23.k2b.smue.SMUE09;

public class ArrayTest1 {

    public static void main(String[] args) {
        double[] r = {5, 3, 2.5, 7, 8};

        System.out.println("r="+r);
        System.out.println("r[1]="+r[1]);
        System.out.println("Elemente:" + r.length);
        ArrayMethods.printArrayln("r=", r);
        System.out.println("Summe der Elemente:" + ArrayMethods.sum(r));
        System.out.println("Mittelwert der Elemente:" + ArrayMethods.mw(r));
        //System.out.println("r[7]="+r[7]);

        //r = new double[7];

        System.out.println("Array: [5, 3, 2.5, 7, 8]");
        System.out.println("SMUE09 MW:" +SMUE09.mw(r));
        System.out.println("SMUE09 MAX:" +SMUE09.max(r));
        System.out.println("SMUE09 MIN:" +SMUE09.min(r));




        System.out.println("r="+r);
        System.out.println("r[1]="+r[1]);
        System.out.println("Elemente:" + r.length);

        r = ArrayMethods.insert(r, 12, 3);
        System.out.println("Elemente:" + r.length);
        ArrayMethods.printArrayln("r=", r);

        r = ArrayMethods.delete(r, 1);
        System.out.println("Elemente:" + r.length);
        ArrayMethods.printArrayln("r=", r);

        // r = {2, 3}
        double[] u = {2, 3};
    }
}
