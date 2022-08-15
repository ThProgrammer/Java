package funcoes_matematicas;

import java.util.Scanner;

public class NumeroPrimo {
    public static boolean numeroPrimo (float n){ //Exercício 6
        int countd = 0; //Contador de divisores
        boolean resp;
        for (int i = 1; i < n+1; i++){
            if (n % i == 0) {
                countd ++;
            }
        }
        resp = countd == 2; //Se o contador for igual a 2 (número divisível por 1 e ele mesmo) o número é primo, logo resp == True
        return resp;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira a: ");
        float a = input.nextFloat();

        System.out.printf("%.1f (a) é primo: %b\n", a, numeroPrimo(a));

    }
}
