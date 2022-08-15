package lista_arrays;

public class Ex11 {
    public static void main(String[] args) {
        float n [] = {1, 5, 3, 11};

        float soma = 0;
        float countdivisor = 0;
        float media = 0;

        System.out.println("Valores maiores que a média: ");

        for (int i = 0; i != n.length; i++) {
            if (i % 2 == 0) {
                soma += n[i];
                countdivisor++;
            }

            media = soma / countdivisor;

            if (n[i] > media){
                System.out.println(n[i]);
            }
        }
        System.out.println("Media: " + media);
    }
}
