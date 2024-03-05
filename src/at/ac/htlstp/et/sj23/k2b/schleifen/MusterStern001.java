package at.ac.htlstp.et.sj23.k2b.schleifen;

public class MusterStern001 {

    public static void main(String[] args) {
        int size = 4;

        for(int i = 0; i < size; ++i) {
            for(int j = 0; j < size - i; ++j) {
                System.out.print("*");
            }

            System.out.print("\n");
        }

    }
}