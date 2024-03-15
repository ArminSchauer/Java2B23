package at.ac.htlstp.et.sj23.k2b.oop;

/**
 * realisierung einer komplexen Zahl aus der Mathematik
 */
public class Complex {

    /** Realteil der Zahl */
    private double re;

    /** Imaginärteil einer Zahl */
    private double im;

    /**
     * Erzeugt eine komplexe Zahl aus Real und Imaginärteil
     * @param re Realteil
     * @param im Imaginärteil
     */
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    /**
     * Erzeugt eine komplexe Zahl mit Realteil und Imaginärteil 0
     * @param re Realteil
     */
    public Complex(double re) {
        this(re, 0);
    }

    /**
     * Erzeugt eine
     * @param abs Betrag
     * @param arg Winkel
     * @param radiant true für Rad und false für Grad
     */
    public Complex(double abs, double arg, boolean radiant) {
        //this(abs * Math.cos(arg * (radiant?1:Math.PI/180)), abs * Math.sin(arg * (radiant?1:Math.PI/180)));
        if(!radiant) {arg = arg * Math.PI/180;}
        re = abs * Math.cos(arg);
        im = abs * Math.sin(arg);
    }

    /**
     * Statischer Konstruktor der eine komplexe Zahl und einen Winkel erzeugt
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


}
