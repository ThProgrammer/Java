package funcoes_matematicas;

import java.util.Scanner;

public class ValorMenor {
    //Exercício 1
    static float menorValor (float a, float b, float c) {
        float menor = a;

        if (b < menor) {
            menor = b;
        }

        if (c < menor){
            menor = c;
        }
        return menor;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Insira a: ");
        float a = input.nextFloat();

        System.out.print("Insira b: ");
        float b = input.nextFloat();

        System.out.print("Insira c: ");
        float c = input.nextFloat();

        System.out.printf("Menor valor inserido: %.1f", menorValor(a, b, c));
    }
}
