package lista_arrays;

public class Ex16 {
    public static void main(String[] args) {
        int vetor[] = {1,8,5,4,2};
        int ordem[] = new int [5];
        int par = 0;

        for (int i = 0; i != 5; i++) {

            if (vetor[i] % 2 == 0){
                ordem[par] = vetor[i];
                par++;
            }
            if (vetor[i] % 2 != 0){
                ordem[i+par] = vetor[i];
            }
        }

        for (int valor: ordem) {
            System.out.println(valor);
        }


    }
}
