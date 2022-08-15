package funcoes_matematicas;

import java.util.Scanner;

public class Somatoria {
    public static float somatoria (float a){ //Exercício 2
        float soma = 0;

        if (a == 0) soma = 0;
        for (float i = 1; i < a+1; i++){
            soma += i;
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira um número: ");
        float a = input.nextFloat();

        System.out.printf("Somatoria de %.1f = %.1f", a, somatoria(a));

    }
}
