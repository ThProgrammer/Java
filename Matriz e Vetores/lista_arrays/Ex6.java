package lista_arrays;

public class Ex6 {
    public static void main(String[] args) {
        int [] n = {2, 2, 2};

        int result = 1;

        for (int i = 0; i != n.length; i++){
            result = result * n[i];
        }
        System.out.println("Produto dos itens do vetor = " + result);
    }
}
