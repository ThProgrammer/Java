package lista_arrays;

public class Ex19 {
    public static void main(String[] args) {
        int vetor [] = {6, 8, 2, 3, 7, 1, 5, 3, 9};

        for (int i = 0; i != vetor.length; i++) {
            if (i % 2 == 0){
                System.out.println(vetor[i]);
            }
        }

    }
}
