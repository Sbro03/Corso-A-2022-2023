import java.util.Scanner;

public class ControllaStringa {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String stringa;

        System.out.print("Inserisci una stringa: ");
        stringa = in.nextLine();
        in.close();

        int len = stringa.length();

        System.out.println(tutteCifre(stringa, len));

    }

    public static boolean tutteCifre(String s, int l) {
        
        boolean check = true;

        if (l == 0) {
            return check;
        }

        /* METODO INCLUSO CON JAVA
        * Preso in prestito da "Character", controlla se il carattere è una cifra
        * Restituisce true è il carattere è una cifra
        * Restituisce false se il carattere non è una cifra

        if (!Character.isDigit(s.charAt(l - 1))) {
            return false;
        }

        */

        if(!isInt(s.charAt(l - 1))) {
            return false;
        }

        return tutteCifre(s, l - 1);
    }

/* Questo metodo controlla il char a 
* Restiuisce:
* true se è una cifra -- il suo valore ascii è compreso tra 48 e 57
* false se il suo valore ascii non è compreso tra 48 u 57, ovvero se è un qualsiasi altro carattere ascii
* https://www.asciichart.com/
*/
    public static boolean isInt(char a) {
        if(a >= 48 && a <= 57) {
            return true;
        }
        return false;
    }
}
