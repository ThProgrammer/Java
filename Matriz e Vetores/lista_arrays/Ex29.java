package lista_arrays;

public class Ex29 {
    public static void main(String[] args) {

        int[][] matriz = new int[4][4];
        int[] n = {0,1,2,3};

        for (int f = 0; f < 4; f++) {
            for (int p = 0; p < 4; p++) {
                matriz[f][p] = n[p];
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
