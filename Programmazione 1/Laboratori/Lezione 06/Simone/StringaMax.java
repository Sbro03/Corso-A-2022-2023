import java.util.Scanner;
public class StringaMax {
    public static void main(String[] args) {
        
        String max = "";
        String s;
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci una sequenza di stringhe. Premi invio per temrinare");
        
        do
        {
            s = in.nextLine();
            max = maxString(s, max);
        }while (s.length() > 0);

        in.close();

        System.out.println("La stringa più lunga è: " + max);
    }

    public static String maxString(String a, String b)
    {
        if (a.length() > b.length())
        {
            return a;
        }
        else 
        {
            return b;
        } 
    }
}
