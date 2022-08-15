package lista_arrays;

public class Ex20 {
    public static void main(String[] args) {
        int vetor [] = {6, 8, 2, 3, 7, 1, 5, 3, 9};
        int multiplos[] = new int [vetor.length];
        int pos = 0;
        for (int i = 0; i != vetor.length; i++) {
            if (i % 3 == 0){
                multiplos[pos] = vetor [i];
                pos++;
            }
        }
        if (pos != 0) {
            System.out.println("Números multiplos de 3 do vetor: ");
            for (int i = 0; i != pos; i++) {
                System.out.println(multiplos[i]);
            }
        }

        if (pos != 0) {
            System.out.println("Números de posição impar do vetor");
            for (int i = 0; i != vetor.length; i++) {
                if (i % 2 == 0) {
                    System.out.println(vetor[i]);
                }
            }
        }

    }
}
