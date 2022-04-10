//1 - Faça um programa para ler dois valores inteiros, e 
//depois mostrar no console a soma desses números.

package br.com.residencia;
import java.util.Scanner;
public class Dois_números_inteiros {

	static int x;
	static int y;
	static int soma;
	
	public static void main(String[] args) {
	try (Scanner scan = new Scanner(System.in)) {
		
		System.out.println("==== Soma dos números inteiros ====\n");
		System.out.print("Digite um número inteiro: ");
		x = scan.nextInt();
		System.out.print("Digite o segundo número inteiro: ");
		y = scan.nextInt();
		
		soma = x + y;
		
		System.out.println("\nA soma dos dois números é: " + soma);
				
				
	}
	

	}

}
