package at.ac.htlstp.et.sj23.k2b.operatoren;

public class Op02 {

    public static void main(String[] args) {
        int x = 5;
        int y = x++;
        System.out.printf("x=%d y=%d\n", x, y);
        x = 5;
        x = x + 1;
        y = x + x++ * 3;
        System.out.printf("x=%d y=%d\n", x, y);
        x = 5;
        x = x + 1;
        y = x * 3 + x++;
        System.out.printf("x=%d y=%d\n", x, y);
        x = 5;
        x = x + 1;
        --x;
        y = x * x + x++ * x--;
        System.out.printf("x=%d y=%d", x, y);
    }
}