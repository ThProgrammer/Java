import java.util.Scanner;

public class validacaoSN
{
	public static void main(String[] args) {
	    
	    char resp = 'a';
	    String nome = "placeholder";
	    
		Scanner teclado = new Scanner (System.in);
		
		do {
		    
		    System.out.print("Insira seu nome: ");
		    nome = teclado.next();
		    
		    System.out.printf("Seu nome é %s mesmo? [S/N]\n", nome);
		    resp = Character.toUpperCase(teclado.next().charAt(0)); //Manipulação de String: .charAt(0) pega o primeiro caractere digitado e Character.toUpperCase o transforma em maiusculo
		}
		
		while (resp != 'S');
		
		System.out.printf("Ok %s, vamos começar!", nome);
	}
}



