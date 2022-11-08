import java.util.Scanner;
public class MassimoInteroRicorsivo{
	public static void main(String [] args){
		System.out.println(MaxMin());
	}
	public static int MaxMin(){
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il numero :");
		int m= input.nextInt();
		if(m==0){
			return 0;
		}
		int function = MaxMin();
		if(function<m){
			return m;
		}
		else{
			return function;
		}
	}
}