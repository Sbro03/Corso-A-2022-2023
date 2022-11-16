import java.util.Scanner;

//PROGRAMMA CHE LEGGA DA TASTIERA UNA SEQUENZA DI NUMERI INTERI STRETTAMENTE MAGGIORI DI ZERO TERMINATA DAL NUMERO ZERO
//TERMINATA LA SEQUENZA, PRINT NUMERO MAX

public class MassimoIntero {
    public static void main(String[] args) {

        int max = 0;
        int n;

        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci una sequenza di numeri interi strettamente maggiori di zero, inserisci il numero zero per terminare in qualsiasi momento.");

        do {
            n = in.nextInt();
            if (n > max) {
                max = n;
            }
        }while (n > 0);

        in.close();

        System.out.println("Massimo numero inserito: " + max);
    }    
}
