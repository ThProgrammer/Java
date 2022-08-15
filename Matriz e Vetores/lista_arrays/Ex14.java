package lista_arrays;

public class Ex14 {
    public static void main(String[] args) {
        int a [] = {1, 3, 5, 7};
        int b [] = {2, 4, 6, 8};

        int c [] = new int [4];

        for (int i = 0; i != c.length; i++){

            if (i % 2 == 0){
                c[i] = a[i];
            }

            else {
                c[i] = b[i];
            }
        }

        for (int valor : c){
            System.out.println(valor);
        }
    }
}
