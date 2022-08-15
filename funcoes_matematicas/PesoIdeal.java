package funcoes_matematicas;

import java.util.Scanner;

public class PesoIdeal {
    public static float pesoIdeal (float alt, int g) { //Exercício 8
        float p = 0;
        if (g == 1) {
            p = (62.1f * alt) - 44.7f;
        }

        else {
            p = (72.7f * alt) - 58f;
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o seu genero: \n[1] F\n[2] M");
        int genero = input.nextInt();

        System.out.print("Insira sua altura (m): ");
        float altura = input.nextFloat();

        System.out.printf("Peso Ideal: %.1f kg\n", pesoIdeal(altura, genero));

    }
}
