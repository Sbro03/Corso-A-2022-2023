public class MetodiSuArray{
	
	//Esercizio 1
	
	static int[] initArray(){
		int [] array; // inizializzo l'array
		System.out.println("Metti un numero per la lunghezza dell'array");
		int length = SIn.readInt(); // leggo da input la lunghezza dell'array
		array = new int[length];
		//ciclo for per chiedere all'utente i valori da mettere nell'array
		for(int i = 0; i < length; i++){ 
			System.out.println("Metti un numero");
			int n = SIn.readInt(); //il valore che l'utente metterà con l'input
			array[i] = n; //assegno al "quadrato" in posizione i il valore di n 
		}
		
		return array; //ritorno il nuovo array creato
	}
	
	static void stampaArrayInt(int [] a){
		System.out.println("Ecco il tuo array");
		//ciclo for per stampare uno alla volta i valori nella posizione i
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	//Esercizio 2
	
	static void copiaElementi(int[] from, int [] to){
		if(from.length == to.length){
			for(int i = 0; i < from.length; i++){
				to[i] = from[i];
			}
		}else
			return;
	}
	
	static int[] clonaArray(int[] a){
		int length = a.length;
		int[] clone;
		clone = new int[length];
		
		if(a == null)
			return null;
		else{
			copiaElementi(a,clone);
			return clone;
		}
	}

}