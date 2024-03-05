package at.ac.htlstp.et.sj23.k2b.operatoren;

public class KonditionalOperator {

    public static void main(String[] args) {
        double x = 3.6;
        int y = 5;
        double z = 2.0 * (x < (double)y ? x : (double)y);
        System.out.printf("%f", z);
        z = 2.0 * (x >= (double)y ? x : (double)y);
        System.out.printf("%f", z);
    }
}