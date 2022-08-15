package lista_arrays;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {

        float media = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Qual a quantidade de alunos da sua sala?: ");
        int quantidade = input.nextInt();

        String nomes[] = new String [quantidade];
        float notas [] = new float [nomes.length];

        for (int i = 0; i != quantidade; i++) {
            System.out.printf("Insira seu nome [%d]: ", i+1);
            nomes[i] = input.next();

            System.out.printf("Insira sua nota [%d]: ",i+1);
            notas[i] = input.nextFloat();

            media += notas[i];
        }

        media /= quantidade;

        System.out.printf("A media da sala foi %.2f\nOs alunos que tiveram a nota acima da media foram:\n", media);

        for (int i = 0; i != quantidade; i++) {
            if (notas[i] > media){
                System.out.printf("%s (%.1f)\n",nomes[i], notas[i]);
            }
        }

    }
}
