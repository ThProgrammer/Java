package funcoes_matematicas;

import java.util.Scanner;

public class Fatorial {
    public static float fatorial(float a){ //Exercício 3
        float result = 1;

        if (a == 0) result = 0;
        for (float i = 1; i < a; i++){
            result += result*i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira um número: ");
        float a = input.nextFloat();

        System.out.printf("Fatorial de %.1f = %.1f",a , fatorial(a));

    }
}
