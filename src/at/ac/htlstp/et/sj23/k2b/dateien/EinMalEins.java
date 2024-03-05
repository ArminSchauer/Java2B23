package at.ac.htlstp.et.sj23.k2b.dateien;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EinMalEins {

    public static final String PATH = "res/einmaleins.txt";

    public static void main(String[] args) {
        int reihe, zahl;
        String line;

        System.out.print("Gib eine Reihe ein: ");
        Scanner sc = new Scanner(System.in);
        reihe = sc.nextInt();

        File file = new File(PATH);
        List<String> fileData = new ArrayList<>();
        for(int i = 1; i <= 10; i++) {
            zahl = i * reihe;
            line = reihe + " * " + i + " = " + zahl;
            fileData.add(line);
        }

        try {
            Files.write(file.toPath(), fileData);
        } catch(IOException e) {
            e.printStackTrace();
        }


    }
}
