package lista_arrays;

public class Ex3 {
    public static void main(String[] args) {
        int [] n = {0, 8, 5, 2, 7, 4, 20};

        int maior = 0;

        for (int i = 0; i != n.length; i++){
            if (n[i] > maior) {
                maior = n[i];
            }
        }
        System.out.println("O maior número do vetor n é " + maior);
    }
}
