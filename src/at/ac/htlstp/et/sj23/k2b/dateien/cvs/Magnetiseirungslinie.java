package at.ac.htlstp.et.sj23.k2b.dateien.cvs;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Magnetiseirungslinie {

    public static final String CSVFILE = "res/Magnetisierungslinie.csv";

    public static double[] getPointsAsVec(String[] spalten) {
        double[] ret = {0, 0};

        try {
            String sh = spalten[0];
            String sDyn3 = spalten[3];

            try {
                ret[0] = Double.parseDouble(sh.replaceAll(",", "."));
                ret[1] = Double.parseDouble(sDyn3.replaceAll(",", "."));
            } catch(NumberFormatException ex) {

            }


        } catch (ArrayIndexOutOfBoundsException e) {}

        return ret;
    }

    public static void main(String[] args) {

        Vector<double[]> kennlinie = new Vector<>();
        try {
            List<String> data = Files.readAllLines(new File(CSVFILE).toPath());

            for(int i = 0; i < data.size(); i++) {
                String line = data.get(i);
                String[] spalten = line.split(";");

                kennlinie.add(getPointsAsVec(spalten));

            }

        } catch (IOException e) {
            System.out.println("Datei " + CSVFILE + " kann nicht gelesen werden");
        }

        for(int i = 0; i < kennlinie.size(); i++) {
            System.out.println(Arrays.toString(kennlinie.get(i)));
        }

    }

}
