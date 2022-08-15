package funcoes_matematicas;

import java.util.Scanner;

public class TotalDias {
    public static float dias (float anos, float meses, float dias) {
        return (anos * 365) + (meses * 30) + dias;
    } //Exercício 7

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira os anos que deseja converter em dias: ");
        float anos = input.nextFloat();

        System.out.println("Insira os meses");
        float meses = input.nextFloat();

        System.out.println("Insira os dias: ");
        float dias = input.nextFloat();

    }
}
