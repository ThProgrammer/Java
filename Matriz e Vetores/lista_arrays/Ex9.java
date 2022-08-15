package lista_arrays;

public class Ex9 {
    public static void main(String[] args) {
        int a [] = {1, 3, 6, 9};

        int b [] = {2, 4, 6, 8};

        int resultados []= new int [4];

        for (int i = 0; i != 4; i++) {
            resultados [i] = a[i] * b[i];
        }

        for (int valor : resultados){
            System.out.println(valor);
        }

    }
}
