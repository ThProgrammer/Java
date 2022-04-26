package lista3;

import java.util.Scanner;

public class Lista3 {

    //Exercício 1;
    static float menorValor (float a, float b, float c) { //Exercício 1
        float menor = a;

        if (b < menor) {
            menor = b;
        }

        if (c < menor){
            menor = c;
        }
        return menor;
    }

    //Exercício 2
    static float somatoria (float a){ //Exercício 2
        float soma = 0;
        for (float i = 1; i < a+1; i++){
            soma += i;
        }
        return soma;
    }

    //Exercício 3
    static float fatorial (float a){ //Exercício 3
        float soma = 1;
        for (float i = 1; i < a; i++){
            soma += soma*i;
        }
        return soma;
    }

    //Exercício 5
    static float bhaskara (float a, float b, float c) { //Exercício 5

        float x = 0;

        float delta = (b*b) - (4*a*c);
        float x1 = ((b*-1) + (float) Math.sqrt(delta)) / (2*a);
        float x2 = ((b*-1) - (float) Math.sqrt(delta)) / (2*a);

        x = Math.max(x1, x2);

        if (delta < 0){
            x = -1;
        }
        return x;
    }

    //Exercício 6
    static float bhaskara2 (float a, float b, float c, int saida) { //Exercício 6
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
        return x;
    }

    //Exercício 7
    static float volumeEsfera (float r) { //Exercício 7
        return (float) ((4/3) * Math.PI * Math.pow(r,3));
    }

    //Exercício 8
    static boolean numeroPrimo (float a){ //Exercício 8
        int countd = 0;
        boolean resp;
        for (int i = 1; i < a+1; i++){
             if (a % i == 0) {
                 countd ++;
            }
        }
        resp = countd == 2;
        return resp;
    }

    //Exercício 9
    static float dias (float anos, float meses, float dias) {
        return (anos * 365) + (meses * 30) + dias;
    }

    //Exercício 10
    static String categoriaNadador (float idade){ //Exercício 10
        String categoria = "";
        if (idade >= 5 && idade <= 7){
            categoria = "Infantil A";
        }
        else if (idade >= 8  && idade <= 10){
            categoria = "Infantil B";
        }
        else if (idade >= 11 && idade <= 13){
            categoria = "Infantil A";
        }
        else if (idade >= 14  && idade <= 17){
            categoria = "Infantil B";
        }
        else {
            categoria = "Adulto";
        }
        return categoria;
    }

    //Exercício 11
    static char nota (float media){ //Exercício 11
        char conceito = '.';
        if (media >= 0 && media <= 4.9){
            conceito = 'D';
        }

        else if (media >= 5 && media <= 6.9){
            conceito = 'C';
        }

        else if (media >= 7 && media <= 8.9){
            conceito = 'B';
        }

        else {
            conceito = 'A';
        }
        return conceito;
    }

    //Exercício 12
    static float pesoIdeal (float alt, int g) { //Exercício 12
        float p = 0;
        if (g == 1) {
            p = (62.1f * alt) - 44.7f;
        }

        else {
            p = (72.7f * alt) - 58f;
        }
        return p;
    }

    //Exercício 13
    static int quantDivisores (int a){ //Exercício 13
        int countd = 0;

        for (int i = 1; i < a+1; i++){
            if (a%i == 0) {
                countd++;
            }
        }
        return countd;
    }

    //Exercício 15
    static float potenciacao (int x, int z){ //Exercício 15
        int soma = 0;
        for (int i = 1; i != z; i++){
            soma += x*x;
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Insira a: ");
        float a = input.nextFloat();

        System.out.print("Insira b: ");
        float b = input.nextFloat();

        System.out.print("Insira c: ");
        float c = input.nextFloat();

        System.out.print("Insira qual raiz de bhaskara:\n[1] Positiva\n[2] Negativa\n");
        int saida = input.nextInt();

        System.out.println("Insira o raio da circunferência: ");
        float r = input.nextFloat();

        System.out.println("Insira os anos que deseja converter em dias: ");
        float anos = input.nextFloat();

        System.out.println("Insira os meses");
        float meses = input.nextFloat();

        System.out.println("Insira os dias: ");
        float dias = input.nextFloat();

        System.out.println("Insira a idade do nadador: ");
        float idade = input.nextFloat();

        System.out.println("Insira sua média: ");
        float media = input.nextFloat();

        System.out.println("Insira o seu genero: \n[1] F\n[2] M");
        int g = input.nextInt();

        System.out.println("Insira sua altura (m): ");
        float alt = input.nextFloat();

        System.out.println("Insira um número para saber a quantidade de divisores: ");
        int n = input.nextInt();

//Saida de dados -------------------------------------------------------------

        System.out.println("Menor valor adicionado: " + menorValor(a,b,c));

        if (a > 0) {
            System.out.println("Somatoria de a: " + somatoria(a));
        }
        if (a > 0) {
            System.out.println("Fatorial de a: " + fatorial(a));
        }
        if (a > 0) {
            System.out.println("Fatorial de a divido pela somatoria de a: " + fatorial(a) / somatoria(a));
        }

        //Saída dos módulos de Bháskara:
        System.out.println("Maior raiz da equacao de 2 grau de a,b e c: " + bhaskara(a, b, c));
        System.out.println("Raiz selecionada: " + bhaskara2(a, b, c, saida));

        System.out.println("Raio da circunferência: " + volumeEsfera(r));
        System.out.printf("%.1f (a) é primo: %b\n", a, numeroPrimo(a));
        System.out.println("O total de dias é: " + dias(anos, meses, dias));
        System.out.println("Categoria do nadador" + categoriaNadador(idade));
        System.out.println("Conceito: " + nota(media));
        System.out.printf("Peso Ideal: %.1f kg\n", pesoIdeal(alt, g));
        System.out.printf("Quantidade de divisores de %d: \n", n, quantDivisores(n));

    }
}
