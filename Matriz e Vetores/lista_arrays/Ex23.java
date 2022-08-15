package lista_arrays;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira quantas linhas: ");
        int l = sc.nextInt();

        System.out.print("Insira quantas colunas: ");
        int c = sc.nextInt();

        int[][] matriz = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {

                if (i % 2 ==0){
                    matriz[i][j] = 10;}

                else {
                    matriz[i][j] = 21;}
            }
        }

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
