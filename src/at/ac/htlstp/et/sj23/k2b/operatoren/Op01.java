package at.ac.htlstp.et.sj23.k2b.operatoren;

public class Op01 {

    public static void main(String[] args) {
        int x;
        int y = 9;
        double a = 3.6;
        double b = 7.4;
        double c = a * b;
        System.out.printf("c: %f\n", c);
        c = a / b;
        System.out.printf("c: %f\n", c);
        x = (int)((double)y * a);
        System.out.printf("x: %d\n", x);
        x = y * (int)a;
        System.out.printf("x: %d\n", x);
        x = 13;
        int z = x / y;
        System.out.printf("z: %d\n", z);
        a = (double)(x / y);
        System.out.printf("a: %f\n", a);
        a = (double)x / (double)y;
        System.out.printf("a: %f\n", a);
    }
}
