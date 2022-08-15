package transposta;

import java.util.Random;
import java.util.Scanner;

public class MatrizTransposta {
        public static int[][] matrizTransposta (int[][] matriz){

            //Matriz tranposta:
            int [][] matrizt = new int[matriz[0].length][matriz.length];

            //Laço de transposição:

            for (int m = 0; m < matriz[0].length; m++) {
                for (int n = 0; n < matriz.length; n++) {
                    matrizt[m][n] = matriz[n][m];
                }
            }

            return matrizt;
        }


    public static void main(String[] args){
        Random random = new Random ();
        Scanner input = new Scanner(System.in);

        System.out.println("Insira quantas linhas: ");
        int l = input.nextInt();
        System.out.println("Insira quantas colunas: ");
        int c = input.nextInt();

        int [][] matriz = new int[l][c];

//Preenchimento matriz normal:
        for (int i = 0; i != l; i++) {
            for (int j = 0; j != c; j++) {
                matriz[i][j] = random.nextInt(9) + 1;
            }
        }

//Exibição matriz normal:

        for (int e = 0; e != l; e++) {
            for (int p = 0; p != c; p++) {
                System.out.print(matriz[e][p]);
            }
            System.out.println();
        }
        System.out.println();


//Exibição da função:

        for (int a = 0; a < c; a++) {
            for (int s = 0; s < l; s++) {
                System.out.println(matrizTransposta(matriz)[a][s]);
            }
            System.out.println();
        }
    }
}
