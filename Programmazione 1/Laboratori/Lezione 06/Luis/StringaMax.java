public class StringaMax{
	public static void main (String [] args){
		String s1 ="ciao";
		String s2 ="hola mundo";
		String max = "";
		System.out.println("Confronto tra : "+ s1 +" e "+s2);
		if(s1.length()>s2.length()){
			max = s1;
		}
		else{
			max=s2;
		}
		System.out.println("La parola piu grande e' :"+ max);
	}
}