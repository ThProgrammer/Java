package lista_arrays;

public class Ex12 {
    public static void main(String[] args) {
        int a [] = {2, 8, 4, 22, 10};
        int b [] = {3, 7, 5, 21, 9};

        int somaa = 0;
        int somab = 0;


        for (int i = 0; i != a.length; i++) {
            somaa += a[i];
            somab += b[i];
        }

        int mediaa = somaa/a.length;
        int mediab = somab/b.length;

        if (somaa > somab){
            System.out.println("Maior soma (a) = " + somaa);
        }

        else {
            System.out.println("Maior soma (b) = " + somab);
        }

        if (mediaa < mediab) {
            System.out.println("Menor média (a) = " + mediaa);
        }
        else {
            System.out.println("Menor média (b) = " + mediab);
        }
    }
}
