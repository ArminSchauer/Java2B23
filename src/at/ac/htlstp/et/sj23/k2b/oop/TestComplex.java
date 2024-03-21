package at.ac.htlstp.et.sj23.k2b.oop;

public class TestComplex {

    public static void main(String[] args) {
        Complex c = new Complex(2, 5);
        Complex d;
        d = c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        c = c.setAbs(3);
        System.out.println("c = " + c);
        System.out.println("abs:" + c.getAbs());
        System.out.println("d = " + d);

        // und jetzt addieren wir
        Complex z1 = new Complex(2, 4);
        Complex z2 = new Complex(1, 3);
        c = z1.add(z2);
        System.out.println(z1 + " + " + z2 + " = " + c);
        c = z1.add(3);
        System.out.println(z1 + " + 3 = " + c);
        c = Complex.add(z1, z2);
        c = z1.mul(z2);
        d = z1.mul1(z2);
        System.out.println(c + " = " + d);
        c = z1.div(z2);
        d = c.mul1(z2);
        System.out.println(c + " = " + d);

        if(z1.equals(d)) {
            System.out.println(z1 + " & " + d + " sind gleich groß!");
        }
    }

}
