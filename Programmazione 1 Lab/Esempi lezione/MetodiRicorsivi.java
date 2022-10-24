class Metodi {  // in questa classe proviamo metodi ricorsivi

    // metodo iterativo per calcolo del fattoriale
    public static int FattIt (int n) {
        // condizione di ingresso: n >= 0
        int i = 0;
        int r = 1;
        while (i < n) { // invariante: r == i!
            i = i + 1;
            r = i * r;
        }
        return r;
    }

    // metodo ricorsivo per calcolo del fattoriale
    public static int Fatt (int n) {
        // condizione di ingresso: n >= 0
        if (n == 0) return 1;   // 0! == 1 (caso base della ricorsione)
        else    
            return n * Fatt(n - 1); // ad ogni passo moltiplichiamo il valore di n per il suo precedente;
    }

    public static void main (String[] args) {
        System.out.println("Scrivere un numero naturale, seguito da Invio: ");
        int n = SIn.readLineInt();
        System.out.println("Metodo iterativo: Il fattoriale di " + n + "è: " + FattIt(n));
        System.out.println("Metodo ricorsivo: Il fattoriale di " + n + "è: " + Fatt(n));
    }

}