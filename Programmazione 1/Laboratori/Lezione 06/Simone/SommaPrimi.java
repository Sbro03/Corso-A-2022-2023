import java.util.Scanner;

public class SommaPrimi {
    public static void main(String[] args) {
        
        int n;
        int ris = 0;
        boolean flag = false;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Inserisci il numero n fino a cui calcolare la somma dei numeri primi: ");
        n = in.nextInt();
        in.close();

        System.out.println(sPrimes(n, n, ris, flag));

    }

    public static int sPrimes(int a, int c, int ris, boolean flag) {
        
// Una sola volta
        if(flag != true) {
            ris = 0;
            c = 2;
        }
        flag = true;

        if (a < 1) {
            return ris;
        }

        if (isPrime(c)) {
            return ris = c + sPrimes(a - 1, c + 1, ris, flag);
        }

        return sPrimes(a, c + 1, ris, flag);

    }

    private static boolean isPrime(int a) {

        if (a <= 1) {
            return false;
        }

        for(int i = 2; i <= a / 2; i++) {
            if(a % i == 0) {
                return false;
            }
        }

        return true;
    }
}
