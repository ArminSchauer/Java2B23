package at.ac.htlstp.et.sj23.k2b.arrays;

public class Primzahlen {

    public static void main(String[] args) {
        printArray(isPrim());

    }

    public static boolean[] isPrim() {
        boolean[] zahlen = new boolean[1002];
        int count = 0;

        for(int i = 1; i < zahlen.length; i++) {
            zahlen[i] = true;
        }

        int y;
        for(int i = 2; i < zahlen.length; i++) {
            y = i;
            for(int j = 1; j < zahlen.length; j++) {
                y += i;
                if(y < zahlen.length) {
                    zahlen[y] = false;
                    count++;
                }

            }
        }
        System.out.printf("Anzahl der Primzahlen: %d\n", count);

        return zahlen;
    }

    public static void printArray(boolean[] array) {
        System.out.println("Primzahlen von 2 bis 1000:");

        for(int i = 2; i < array.length; i++) {
            if(array[i]) {
                System.out.println(i);
            }
        }
    }
}
