package funcoes_matematicas;

import java.util.Scanner;

public class quantDivisores {
    public static int quantDivisores (int a){ //Exercício 9
        int countd = 0;

        for (int i = 1; i < a+1; i++){
            if (a%i == 0) {
                countd++;
            }
        }
        return countd;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira um número para saber a quantidade de divisores: ");
        int n = input.nextInt();

        System.out.printf("Quantidade de divisores de %d: %d", n, quantDivisores(n));

    }
}
