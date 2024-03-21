package at.ac.htlstp.et.sj23.k2b.oop;

/**
 * realisierung einer komplexen Zahl aus der Mathematik
 */
public class Complex {

    private static final double TOLERANZ = 1e-6;
    /**
     * Realteil der Zahl
     */
    private final double re;

    /**
     * Imaginärteil einer Zahl
     */
    private final double im;

    /**
     * Erzeugt eine komplexe Zahl aus Real und Imaginärteil
     *
     * @param re Realteil
     * @param im Imaginärteil
     */
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    /**
     * Erzeugt eine komplexe Zahl mit Realteil und Imaginärteil 0
     *
     * @param re Realteil
     */
    public Complex(double re) {
        this(re, 0);
    }

    /**
     * Erzeugt eine
     *
     * @param abs     Betrag
     * @param arg     Winkel
     * @param radiant true für Rad und false für Grad
     */
    public Complex(double abs, double arg, boolean radiant) {
        //this(abs * Math.cos(arg * (radiant?1:Math.PI/180)), abs * Math.sin(arg * (radiant?1:Math.PI/180)));
        if (!radiant) {
            arg = arg * Math.PI / 180;
        }
        re = abs * Math.cos(arg);
        im = abs * Math.sin(arg);
    }

    /**
     * Statischer Konstruktor der eine komplexe Zahl und einen Winkel erzeugt
     *
     * @param abs Betrag
     * @param arg Winkel in Rad
     * @return Complexe Zahl
     */
    public static Complex createVersor(double abs, double arg) {
        double re = abs * Math.cos(arg);
        double im = abs * Math.sin(arg);
        return new Complex(re, im);
    }

    @Override
    public String toString() {
        return re + " + " + im + "i";
    }

    public double getRe() {
        return re;
    }

    public Complex setRe(double re) {
        return new Complex(re, im);
    }

    public double getIm() {
        return im;
    }

    public Complex setIm(double im) {
        return new Complex(re, im);
    }

    public double getAbs() {
        return Math.sqrt(re * re + im * im);
    }

    public double getArg() {
        return Math.atan2(im, re);
    }

    public Complex setAbs(double abs) {
        double v = abs / getAbs();
        return new Complex(re * v, im * v);
    }

    /*******************************************************************************************************************
     * Berechnungsmethoden
     ******************************************************************************************************************/

    public Complex add(Complex z) {
        return new Complex(re + z.re, im + z.im);
    }

    public Complex add(double r) {
        // return new Complex(re + r, im);
        return add(this, r);
    }
    public static Complex add(Complex z1, Complex z2) {
        // return new Complex(z1.re + z2.re, z1.im + z2.im);
        return z1.add(z2);
    }

    public static Complex add(Complex z1, double r) {
        return new Complex(z1.re + r, z1.im);
    }

    public Complex neg() {
        return new Complex(-re, -im);
    }

    public Complex sub(Complex z) {
        return add(z.neg());
    }

    public Complex mul(Complex z) {
        return createVersor(getAbs() * z.getAbs(), getArg() + z.getArg());
    }

    public Complex mul1(Complex z) {
        return  new Complex(re*z.re-im*z.im, re*z.im+im*z.re);
    }

    public Complex inv() {
        double N = re*re+im*im;
        return new Complex(re/N, -im/N);
    }

    public Complex div(Complex z) {
        return mul(z.inv());
    }

    public boolean equals(Complex z) {
        double s = Math.max(getAbs(), z.getAbs()) * TOLERANZ;
        return (Math.abs(re-z.re) <s && Math.abs(im- z.im) <s);
    }

}