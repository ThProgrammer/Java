package lista_arrays;

public class Ex4 {
    public static void main(String[] args) {

        int [] n = {0, 9, 1, 7, 27, 4, 22};
        int menor = n[0];

        for (int i = 1; i != n.length; i++) {
            if (n[i] <= menor){
                menor = n[i];
            }
        }

        System.out.println("O menor valor do vetor é: " + menor);

    }
}
