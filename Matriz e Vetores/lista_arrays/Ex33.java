package lista_arrays;

import java.util.Scanner;

public class Ex33 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira quantas linhas: ");
        int l = sc.nextInt();

        System.out.print("Insira quantas colunas: ");
        int c = sc.nextInt();

        int[][] matriz = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Insira o numero do elemento %d, %d: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("\nPosicao dos numeros negativos: ");

        for (int linhan = 0; linhan != l; linhan++) {
            for (int colunan = 0; colunan < c; colunan++) {
                if (matriz[linhan][colunan] < 0){
                    System.out.printf("%d: %d, %d\n", matriz[linhan][colunan], linhan, colunan);
                }
            }
        }
    }

}