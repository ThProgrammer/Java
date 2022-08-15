package matriz;

import java.util.Random;
import java.util.Scanner;

public class MatrizMaior {
    public static int maiorElementoMatriz (int [][] matriz){
        int maior = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                if (matriz[i][j] > maior) maior = matriz[i][j];

            }
        }
        return maior;
    }

    public static void main(String[] args) {
        Random random = new Random ();
        Scanner input = new Scanner(System.in);
        int l = 3;
        int c = l;
        int [][] matriz = new int[l][c];

    //Preenchimento matriz ----------------

        for (int i = 0; i != l; i++) {
            for (int j = 0; j != c; j++) {
                matriz[i][j] = random.nextInt(9) + 1;
            }
        }

    //Exibição: --------------------
        System.out.println();
        for (int e = 0; e != l; e++) {
            for (int p = 0; p != c; p++) {
                System.out.print(matriz[e][p] + " ");
            }
            System.out.println();
        }

        System.out.printf("\nMaior elemento da matriz: %d", maiorElementoMatriz(matriz));
    }

}
