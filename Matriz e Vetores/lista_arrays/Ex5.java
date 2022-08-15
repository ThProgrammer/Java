package lista_arrays;

public class Ex5 {
    public static void main(String[] args) {
        int [] n = {2, 4, 2, 2, 0};

        int soma = 0;

        for (int i = 0; i != n.length; i++){
            soma += n[i];
        }
        System.out.println(soma/n.length);
    }
}
