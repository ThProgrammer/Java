package lista_arrays;

import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas linhas deverá ter a matriz?: ");
        int f = sc.nextInt();
        System.out.print("Quantas colunas deverá ter a matriz?: ");
        int p = sc.nextInt();
        int [][] mat = new int[f][p];
        int soma = 0;

        for (int l = 0; l != mat.length; l++) {
            for (int c = 0; c != mat[l].length; c++){
                System.out.printf("Insira um numero para a matriz (%d, %d): ", l, c);
                mat[l][c] = sc.nextInt();
                soma += mat[l][c];
            }
        }

        for (int l = 0; l != mat.length; l++) {
            for (int c = 0; c != mat[l].length; c++){
                System.out.print(mat[l][c] + " ");
            }
            System.out.println(" ");
        }
        System.out.print("Soma de todos os elementos da matriz: "+soma);
    }
}
