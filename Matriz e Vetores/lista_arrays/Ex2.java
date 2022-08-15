package lista_arrays;

public class Ex2 {
    public static void main(String[] args) {
        int [] n = {8, 9, 7, 5, 2};

        int soma = 0;

        for (int i = 0; i < n.length; i++) {
            soma += n[i];
        }

        System.out.println(soma);
    }
}
