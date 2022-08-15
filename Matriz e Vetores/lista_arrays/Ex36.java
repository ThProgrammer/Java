package lista_arrays;

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.print("Quantas linhas deverá ter a matriz?: ");
        int f = input.nextInt();
        System.out.print("Quantas colunas deverá ter a matriz?: ");
        int p = input.nextInt();
        int [] diagonalprincipal = new int [p];

        int [][]matriz = new int [f][p];

        for (int l = 0; l != matriz.length ; l++) {
            for (int c = 0; c != matriz[l].length ; c++) {
                System.out.printf("Insira o número do elemento %d, %d: ", l, c);
                matriz[l][c] = input.nextInt();
                if(c == l){
                    diagonalprincipal[c] = matriz[l][c];
                }
            }
        }
        System.out.println(" ");


//SAÍDA DE DADOS: ============================================================

        for (int l = 0; l != matriz.length ; l++) {
            for (int c = 0; c != matriz[l].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("\nDiagonal principal: ");
        for (int dp: diagonalprincipal) {
            System.out.print(dp + " ");
        }
    }
}
