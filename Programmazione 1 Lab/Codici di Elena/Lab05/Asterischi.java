import java.util.Scanner;

public class Asterischi {

    public static void rettangoloAsterischi() {
        Scanner sc = new Scanner(System.in);
        int l, h;
        System.out.print("Inserire altezza rettangolo: ");
        h = sc.nextInt();
        System.out.print("Inserire larghezza rettangolo: ");
        l = sc.nextInt();

        for(int i = 0; i<h; i++){
            for(int j = 0; j<l; j++)
                System.out.print("*");
            System.out.println();
        }

    }
    public static void main(String[] args) {
        rettangoloAsterischi();
    }
}
