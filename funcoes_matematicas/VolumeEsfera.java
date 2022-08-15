package funcoes_matematicas;

import java.util.Scanner;

public class VolumeEsfera {
    static float volumeEsfera (float n) { //Exercício 7
        return (float) ((4/3) * Math.PI * Math.pow(n,3));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o raio da circunferencia: ");
        float raio = input.nextFloat();

        System.out.printf("Volume da circunferencia de raio %.1f = %.1f", raio, volumeEsfera(raio));

    }
}
