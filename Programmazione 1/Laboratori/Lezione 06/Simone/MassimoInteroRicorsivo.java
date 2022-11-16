import java.util.Scanner;

public class MassimoInteroRicorsivo {
    public static void main(String[] args) {

        int m = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci una serie di numeri interi > 0 - Inserisci 0 per terminare");
        maxintRicorsivo(m, in);
        in.close();
    }

    public static void maxintRicorsivo(int max, Scanner in) {

        int a = in.nextInt();

        if (a <= 0) {
            System.out.println("Il numero massimo inserito è: " + max);
            return;
        }

        if (a > max) {
            max = a;
        }
        maxintRicorsivo(max, in);
    }
}

// Ogni volta che un metodo richiama se stesso, crea il *suo* set di variabili e scanner, di conseguenza per evitare memory leak lo scanner viene passato da main
    // In questo modo lo scanner è sempre uno e uno solo
    // Chiuderlo nel main e non nel metodo è una buona pratica poiché chiudere lo scanner nel metodo vorrebbe dire chiuderlo anche in main
    // (uno scanner chiuso non può più essere riaperto)