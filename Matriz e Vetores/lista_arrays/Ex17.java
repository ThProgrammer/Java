package lista_arrays;

public class Ex17 {

    public static void main(String[] args) {
        float vetor [] = {1, 9, 3, 7, 2.5f};

        int numero = 2;

        for (int i = 0; i != 5; i++) {
            vetor [i] *= numero;
        }

        for (float valor : vetor){
            System.out.println(valor);
        }

    }
}