package lista_arrays;

public class Ex8 {
    public static void main(String[] args) {
        int [] n = {1, 11, 19, 27, 4, 2};
        boolean presente = false;
        int valor = 4;

        for (int i = 0; i != n.length; i++){
            if (n[i] == valor){
                presente = true;
                break;
            }
        }

        if (presente){
            System.out.printf("O número %d está presente no vetor", valor);
        }
        else {
            System.out.printf("O número %d não está presente no vetor", valor);
        }
    }
}
