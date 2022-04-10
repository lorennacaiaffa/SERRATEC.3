//4 - Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

package br.com.residencia;
import java.util.Scanner;
public class Par_ou_Ímpar {

	public static void main(String[] args) {
		
		float n = 0;
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("==== Par ou Ímpar? ====\n");
			System.out.print("Digite um número: ");
			n = scan.nextInt();
	}
	        if (n % 2 == 0) {
	        System.out.println("\nO Número é par!");	
	        }
	        else {
	        System.out.println("\nO número é impar");	
	        }
	
	}
	
}
