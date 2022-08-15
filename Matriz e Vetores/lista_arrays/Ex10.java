package lista_arrays;

public class Ex10 {
    public static void main(String[] args) {

        float n [] = {2, 4, 6, 8};
        float result = 1;

        for (int i = 0; i != n.length; i++){
            if (i % 2 != 0) {
                System.out.println(result * n[i]);
            }
        }
    }
}
