import java.util.Scanner;

public class Array {
    public static int[] crea(int n) {
        int[] x = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Inserire un intero: ");
            x[i] = sc.nextInt();
        }
        return x;
    }

    public static boolean uguali(int[] x, int[] y){
        boolean b = false;
        if(x.length == y.length) {
            b = true;
            for(int i = 0; i < x.length && b; i++)
                if(x[i] != y[i])
                    b = false;
        }
        return b;
    }

    public static boolean uguali_var(int[] x, int[] y){
        int i = -1;
        if(x.length == y.length)
            for(i = 0; i < x.length && x[i] == y[i]; i++);
        
        return i == x.length;
    }

    public static void main(String[] args) {
        int[] x = crea(4);
        int[] y = {1,2,3,4};
        boolean b = uguali(x, y);
        System.out.println(b);
        int[] z = {3,4,55,2};
        b = uguali_var(x, z);
        System.out.println(b);
    }
}