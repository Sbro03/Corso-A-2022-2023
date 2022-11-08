import java.util.Scanner;
public class StringaMaxRicorsiva{
	public static void main ( String [] args){
		System.out.println(MaxMin());
	}
	public static String MaxMin(){
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il numero :");
		String stringa = input.nextLine();
		if(stringa==""){
			return "";
		}
		String function = MaxMin();
		if(function.length()<stringa.length()){
			return stringa;
		}
		else{
			return function;
		}
	}
	
}