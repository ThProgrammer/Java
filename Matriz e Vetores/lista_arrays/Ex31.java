package lista_arrays;

import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Quantas linhas deverá ter a matriz?: ");
        int f = input.nextInt();
        System.out.print("Quantas colunas deverá ter a matriz?: ");
        int p = input.nextInt();
        int [] colunas = new int[p];


        int [][] matriz = new int[f][p];

        for (int l = 0; l != matriz.length; l++) {
            for (int c = 0; c != matriz[l].length; c++) {
                System.out.printf("Insira o número do elemento %d, %d: ", l, c);
                matriz[l][c] = input.nextInt();
                colunas[c] += matriz[l][c];
            }
        }
        System.out.println(" ");

//LAÇO DE EXIBIÇÃO DA MATRIZ:

        for (int i = 0; i != matriz.length; i++) {
            for (int j = 0; j != matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

// =====================================================

        for (int c = 0; c != colunas.length; c++) {
            System.out.printf("Soma da coluna %d = %d\n", c, colunas[c]);
        }

    }
}