package at.ac.htlstp.et.sj23.k2b.schleifen;

public class Wochentag {

    public static void main(String[] args) {
        String[] tage = {"Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag"};
        int index = wochentag(2024, 1, 9);
        String tag = tage[index];
        System.out.println(tag);
    }

    public static int wochentag(int jahr, int monat, int tag) {
        int index = 6;
        int tage;
        int[] monatsTage = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(isSchaltjahr(jahr)) {
            monatsTage[1] = 29;
        }

        tage = tag;
        for(int i = 0; i < (jahr - 1); i++) {
            tage += 365;
            if(isSchaltjahr(i)) {
                tage++;
            }
        }
        for(int i = 0; i < (monat - 1); i++) {
            tage += monatsTage[i];
        }
        for(int i = 0; i < tage; i++) {
            if(index >= 6) {
                index = 0;
            }
            else {
                index++;
            }
        }

        return index;
    }

    public static boolean isSchaltjahr(int jahr) {
        if(jahr%400 == 0) {
            return true;
        }
        if(jahr%100 == 0) {
            return false;
        }
        return jahr % 4 == 0;
    }

}