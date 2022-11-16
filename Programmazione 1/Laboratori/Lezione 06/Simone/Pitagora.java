public class Pitagora {

    public static void main(String[] args) {
        tavolaPitagorica();
    }

    public static void tavolaPitagorica() {
        final int RIGHE_COLONNE = 10;

        for (int i = 1; i <= RIGHE_COLONNE; i++) {
            for (int j = 1; j <= RIGHE_COLONNE; j++) {
                System.out.printf(i*j + "\t");
            }
            System.out.println("");
        }
    }
}
