package at.ac.htlstp.et.sj23.k2b.dateien;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class DateiTest1 {

    public static final String PATH1 = "res/test1.txt";
    public static final String PATH2 = "res/out.txt";

    public static void main(String[] args) {

        File file = new File(PATH1);
        File out = new File(PATH2);
        List<String> fileData = new ArrayList<>();
        if(!file.exists()) {
            System.out.println("Datei existiert nicht!");
        }

        try {
            /* Datei lesen */
            fileData = Files.readAllLines(file.toPath());

            /* Datei verarbeiten  -> groß schreiben */
            for(int i = 0; i < fileData.size(); i++) {
                fileData.set(i, fileData.get(i).toUpperCase());
            }

            /* Datei speichern */
            Files.write(out.toPath(), fileData);
        } catch(IOException e) {
            e.printStackTrace();
        }

    }

}
