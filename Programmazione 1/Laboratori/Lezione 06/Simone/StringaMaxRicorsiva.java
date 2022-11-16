import java.util.Scanner;

public class StringaMaxRicorsiva {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String m = "";
        System.out.println("Inserisci una sequenza di stringhe, premi invio per terminare");
        smaxRicorsiva(m, sc);
        sc.close();
    }

    public static void smaxRicorsiva(String max, Scanner sc) {

        String a;
        a = sc.nextLine();

        if(a.length() == 0) {
            System.out.println("La stringa più lunga è: " + max);
            return;
        }

        if(a.length() > max.length()) {
            max = a;
        }

        smaxRicorsiva(max, sc);
    }
}

// Ogni volta che un metodo richiama se stesso, crea il *suo* set di variabili e scanner, di conseguenza per evitare memory leak lo scanner viene passato da main
    // In questo modo lo scanner è sempre uno e uno solo
    // Chiuderlo nel main e non nel metodo è una buona pratica poiché chiudere lo scanner nel metodo vorrebbe dire chiuderlo anche in main
    // (uno scanner chiuso non può più essere riaperto)