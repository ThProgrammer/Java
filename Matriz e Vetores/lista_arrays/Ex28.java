package lista_arrays;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        int soma = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Insira quantas linhas: ");
        int l = sc.nextInt();

        System.out.print("Insira quantas colunas: ");
        int c = sc.nextInt();

        int[][] matriz = new int[l][c];

        for (int f = 0; f < l; f++) {
            for (int p = 0; p < c; p++) {
                matriz[f][p] = 20;
                soma +=matriz[f][p];
            }
        }

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.print("A soma de todos os elementos dos vetores é igual a: "+soma);
    }
}
