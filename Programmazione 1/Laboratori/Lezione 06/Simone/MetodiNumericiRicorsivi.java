import java.util.Scanner;

/*
 * Utilizzo: java .\MetodiNumericiRicorsivi.java args
 * 
 * args:
 * a = esponenziale
 * b = somma
 * c = prodotto multipli
 * d = intero al rovescio
 * 
 * Esempio per richiamare la somma:
 * java .\MetodiNumericiRicorsivi.java b
 */

public class MetodiNumericiRicorsivi {
    public static void main (String[] args) {

// ESPONENZIALE
        if (args[0].equals("a")) {

            long b;
            long e;
            Scanner in = new Scanner(System.in);
            
            System.out.print("Inserisci base: ");
            b = in.nextLong();
            System.out.println("");
            System.out.print("Inserisci esponente: ");
            e = in.nextLong();
            in.close();

            System.out.println(esponenziale(b, e));
        }

// SOMMA
        if (args[0].equals("b"))
        {
            int a, b;
            Scanner in = new Scanner(System.in);

            System.out.println("Inserisci i due numeri da sommare: ");
            a = in.nextInt();
            b = in.nextInt();
            in.close();

            System.out.println("Somma: " + somma(a, b));
        }

// PRODOTTO MULTIPLI
        if (args[0].equals("c"))
        {
            int n, m, q;
            Scanner in = new Scanner(System.in);
            System.out.print("n: ");
            n = in.nextInt();
            System.out.print("m: ");
            m = in.nextInt();
            System.out.print("q: ");
            q = in.nextInt();
            in.close();

            System.out.println(prodottoMultipli(n, m, q));
        }

// INT AL ROVESCIO
        if (args[0].equals("d"))
        {
            Scanner in = new Scanner(System.in);

            System.out.print("Inserisci il numero >= 0 da stampare al rovescio: ");

            stampaInteroAlRovescio(in.nextInt());

            in.close();
        }
    }

    public static long esponenziale(long base, long esponente) {
        if (esponente < 1)
        {
            return 1;
        }
        return base*esponenziale(base, esponente - 1);
    }

    public static int somma(int a, int b) {
        if (b < 1) {
            return a;
        }
        a = a + 1;
        return somma(a, b - 1);
    }

    public static int prodottoMultipli(int a, int b, int c) {

        int ris = 1;

        if (a > b) {
            return ris;
        }

        if (a % c == 0) {
           return ris * a * prodottoMultipli(a + 1, b, c);
        }

        return prodottoMultipli(a + 1, b, c); 
    }

    public static void stampaInteroAlRovescio(int a) {
        
        if (a < 0) {
            return;
        }

        System.out.print(a + " ");
        stampaInteroAlRovescio(a - 1);
    }

}