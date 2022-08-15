package lista_arrays;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vetor [] = {1, 9, 2, 15};
        System.out.println("Insira um número para verificar se está no vetor: ");
        int numero = input.nextInt();
        int posicao = -1;

        for (int i = 0; i != 4 ; i++) {
            if (numero == vetor[i]){
                posicao = i;
            }
        }

        if (posicao != -1){
            System.out.printf("O número %d foi encontrado na posição %d", numero, posicao+1);
        }
        else{
            System.out.printf("O número %d não foi encontrado no vetor. :(", numero);
        }
    }
}
