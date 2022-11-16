import java.util.Scanner;
import java.lang.String;

public class Metodi 
{
    public static void main(String[] args) {

        //Chiedi parola
        Scanner in = new Scanner(System.in);

        System.out.print("Inserisci la parola potenzialmente palindroma: ");
        String userin = in.nextLine();
        System.out.println();

        System.out.println(palindroma(userin, userin.length()));
        
        System.out.println("Inserisci due parole da confrontare");
        System.out.print("1: ");
        String s = in.nextLine();
        System.out.println(" ");
        System.out.print("2: ");
        String s2 = in.nextLine();
        in.close();

        System.out.println(elementiComuni(s, s2));
        
    }

/*TURE: è palindroma
FALSE: non lo è lol hiusadhiusdahiuads*/
    public static boolean palindroma(String s, int len) {
        
        for (int i = 0; i <= len / 2; i++ ) {
            if (s.charAt(i) == s.charAt(len - 1 - i)) {
                    //do nothing
            }
            else {
                    return false;
            }
        }
        
        return true;
    }

/*TRUE : ci sono elementi comuni
FALSE: nessun elemento in comune*/
    public static boolean elementiComuni(String a, String b) {
        int alen = a.length();
        int blen = b.length();

        // 1: meee 2:aaam
        if (alen == blen) {
            for (int e = 0; e < alen; e++) {
                for (int ee = 0; ee < alen; ee++) {
                    if (a.charAt(e) == b.charAt(ee)) {
                        return true;
                    }
                }
            }
            return false;
        }

        // 1: Ciaone    2: Memk
        if (alen > blen) { 
            for (int i = 0; i < alen; i++ ) {
                for (int j = 0; j < blen; j++) {
                    if (b.charAt(j) == a.charAt(i)) {
                        return true;
                    }
                }
           }
           return false;
        }
        else // 1: memk    2: ciaone
        {
            for (int k = 0; k < blen; k++) {
                for (int z = 0; z < alen; z++) {
                    if (b.charAt(k) == a.charAt(z)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
