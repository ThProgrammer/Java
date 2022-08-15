package lista_arrays;

public class Ex13 {
    public static void main(String[] args) {
        int a [] = {2, 8, 4, 22, 10};
        int b [] = {3, 7, 5, 21, 9};
        int c [] = new int [5];

        for (int i = 0; i != c.length; i++){ //Passando A pra C
            c[i] = a[i];
        }

        for (int valor : c) {
            System.out.println(valor);
        }

        for (int i = 0; i != c.length; i++){ //Passando B pra C
            c[i] = b[i];
        }

        for (int valor : c) {
            System.out.println(valor);
        }
    }
}
