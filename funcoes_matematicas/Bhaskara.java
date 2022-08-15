package funcoes_matematicas;

import java.util.Scanner;

public class Bhaskara {
    static float bhaskara (float a, float b, float c) { //Exercício 4
        Scanner input = new Scanner(System.in);
        System.out.println("Qual a raiz desejada?\n[1] Maior raiz \n[2] Menor raiz");
        int saida = input.nextInt();

        float x = 0;

        float delta = (b*b) - (4*a*c);
        float x1 = ((b*-1) + (float) Math.sqrt(delta)) / (2*a);
        float x2 = ((b*-1) - (float) Math.sqrt(delta)) / (2*a);

        if (saida == 1){
            x = Math.max(x1, x2);
        }

        else {
            x = Math.min(x1, x2);
        }

        if (delta < 0){
            x = -1;
        }

        return x;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira a: ");
        float a = input.nextFloat();

        System.out.print("Insira b: ");
        float b = input.nextFloat();

        System.out.print("Insira c: ");
        float c = input.nextFloat();

        System.out.print("Resultado = " + bhaskara(a, b, c));
    }
}
