//1 - Fa�a um programa para ler dois valores inteiros, e 
//depois mostrar no console a soma desses n�meros.

package br.com.residencia;
import java.util.Scanner;
public class Dois_n�meros_inteiros {

	static int x;
	static int y;
	static int soma;
	
	public static void main(String[] args) {
	try (Scanner scan = new Scanner(System.in)) {
		
		System.out.println("==== Soma dos n�meros inteiros ====\n");
		System.out.print("Digite um n�mero inteiro: ");
		x = scan.nextInt();
		System.out.print("Digite o segundo n�mero inteiro: ");
		y = scan.nextInt();
		
		soma = x + y;
		
		System.out.println("\nA soma dos dois n�meros �: " + soma);
				
				
	}
	

	}

}
