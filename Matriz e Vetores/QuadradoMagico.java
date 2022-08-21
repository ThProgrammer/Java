package quadradomagico;

import java.util.Scanner;

public class QuadradoMagico {
    public static boolean quadradoMagico (int[][] matriz){

        if (matriz.length != matriz[0].length) {
            System.out.println("A matriz inserida não é quadrada");
            System.exit(1); //Se a matriz não for quadrada, parar
        }

        // ========== Criação de Varíaveis ==========

        int [] somal = new int[matriz.length]; //Vetor que recebe a soma das linhas
        int [] somac = new int[matriz[0].length]; //Vetor que recebe a soma das colunas
        int somadp = 0; int somads= 0; //Soma diagonal principal e soma diagonal secundaria
        int check = 0; //Contador de verificações corretas
        boolean magico = false;

        // ====================

        // ========== Processamento ==========

        for (int i = 0; i != matriz.length ; i++) {
            for (int j = 0; j != matriz[0].length; j++) {

                if (i == j) somadp += matriz[i][j]; //Somando a diagonal principal

                if (j == (matriz[0].length-1) - i) somads += matriz[i][j]; //Somando a diagona secundária

                // ============

                if (j == 0) somal[i] = matriz[i][j]; //Somando as linhas e adicionando ao vetor
                else somal[i] += matriz[i][j];

                // ============

                if (i == 0) somac[j] = matriz[i][j]; //Somando as colunas e adicionando ao vetor
                else somac[j] += matriz[i][j];

            }
        }

            // Verificando se todos os valores são iguais:
        for (int k = 1; k != matriz.length; k++) {

            if (somal[k] == somal[0]) { //Verificando se todas as somas dos elementos de linhas são iguais | (l)-1
                check += 1;
            }
            if (somac[k] == somac[0]) { //Verificando se todas as somas dos elementos de coluna são iguais | (l*2)-2
                check += 1;
            }

            if (check == (matriz.length*2) - 2) { //Verificar se todas as outras verificações estarem corretas

                if (somal[0] == somac[0]) { //Verificando se todas as somas dos elementos de coluna são iguais a soma de todos os elementos de linha | (+1)
                    check += 1;
                }

                if (check == (matriz.length*2)-1 && somadp == somads && somads == somal[0]){ //Verificando se somadp é igual a somads e se os 2 são iguais as outras somas.
                    magico = true;
                }
            }
                /* Check == ((l*2) - 2) + 1: Faremos l*2 de verificações pois é o numero de elementos que passaremos,
                 -2, que são as vezes que o laço comparará o mesmo elemento,
                 +1 que é uma verificação adicional*/
        }

        // ====================

        // ========== Saída de dados ==========
        return magico;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        int l; int c;

        System.out.println("Insira a quantidade de linhas da matriz (OBS: A matriz devera ser quadrada): ");
        l = input.nextInt();
        System.out.println("Insira a quantidade de colunas da matriz (OBS: A matriz devera ser quadrada): ");
        c = input.nextInt();


        int [][]matriz = new int[l][c];
        for (int i = 0; i != l ; i++) {
            for (int j = 0; j != c; j++) {
                System.out.printf("(%d %d): ", i, j);
                matriz[i][j] = input.nextInt();

            }
        }

        System.out.println(quadradoMagico(matriz));

    }
}
