package at.ac.htlstp.et.sj23.k2b.dateien.cvs;

public class ParseTest {

    public static void main(String[] args) {
        String s1 = "5";
        String s2 = "4.7";
        String s3 = "5,8";
        String s4 = "6A";
        int i;
        double d;

        i = Integer.parseInt(s1);
        d = Double.parseDouble(s1);
        System.out.printf("i = %d, d = %f\n", i, d);

        try{
            i = Integer.parseInt(s2);
        } catch (NumberFormatException e) {
            i = 0;
        }
        //i = (int) Double.parseDouble(s2);
        d = Double.parseDouble(s2);
        System.out.printf("i = %d, d = %f\n", i, d);

        d = Double.parseDouble(s3.replaceAll(",", "."));
        i = (int) d;
        System.out.printf("i = %d, d = %f\n", i, d);

        i = Integer.parseInt(s4.replaceAll("[^0-9.]", ""));
        d = Double.parseDouble(s4.replaceAll("[^0-9]", ""));
        System.out.printf("i = %d, d = %f\n", i, d);
    }

}
