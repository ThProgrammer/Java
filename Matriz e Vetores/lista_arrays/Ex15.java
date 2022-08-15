package lista_arrays;

import java.util.Arrays;

public class Ex15 {
    public static void main(String[] args) {
        int a [] = {2, 8, 4, 22, 10};
        Arrays.sort(a); //Método sort para organizar arrays.

        for (int vetor : a){
            System.out.println(vetor);
        }
    }
}
