package no.hvl.dat100.tabeller;

public class Tabeller {

    // a)
    public static void skrivUt(int[] tabell) {
        tabell = new int [] {1, 3, 6, 8};
    }

    // b)
    public static String tilStreng(int[] tabell) {
        if(tabell.length == 0) {
            return "[]";
        }
        String resultat = "[";
        for (int i = 0; i < tabell.length; i++) {
            resultat += tabell[i];
            if (i <tabell.length - 1) {
                resultat += ",";
            }
        }
        resultat += "]";
        return resultat;
    }

    // c)
    public static int summer(int[] tabell) {
        int summen = 0;

        for (int i = 0; i < tabell.length; i++){
            summen += tabell[i];
        }
        return summen;

    }

    // d)
    public static boolean finnesTall(int[] tabell, int tall) {
        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return true;
            }
        }
        return false;
    }

    // e)
    public static int posisjonTall(int[] tabell, int tall) {
        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return i;
            }
        }
        return -1;
    }

    // f)
    public static int[] reverser(int[] tabell) {
        int[] reversert = new int[tabell.length];
        //Lager ny tom tabell med den samme lengden.
        for (int i = 0; i < tabell.length; i++) {                       //Går gjennom alle de originale elementene i tabellen med for løkke
            reversert[i] = tabell[tabell.length - 1 - i];               //Setter inn elementene i motsatt rekkefølge i den nye tabellen. sette det siste elementet og setter det først i den nye tabellen
        }                //f.eks lengde(4) - 1 - i(0); første element i ny tabell.
        return reversert;
    }

    // g)
    public static boolean erSortert(int[] tabell) {
        for (int i = 0; i < tabell.length - 1; i++) {
            if(tabell[i] > tabell[i+1]) {
                return false;
            }
        }
        return true;
    }

    // h)
    public static int[] settSammen(int[] tabell1, int[] tabell2) {
        int[] samlettabell = new int[tabell1.length + tabell2.length];

        for (int i = 0; i < tabell1.length; i++) {
            samlettabell[i] = tabell1[i];
        }

        for (int i = 0; i < tabell2.length; i++) {
            samlettabell[i+tabell1.length] = tabell2[i];
        }

        return samlettabell;
    }
}
