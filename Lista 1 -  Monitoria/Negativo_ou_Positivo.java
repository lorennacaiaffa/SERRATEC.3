//3 - Fazer um programa para ler um número inteiro, 
//e depois dizer se este número é negativo ou não.

package br.com.residencia;
import java.util.Scanner;
public class Negativo_ou_Positivo {

	public static void main(String[] args) {
	int n;
	try (Scanner scan = new Scanner(System.in)) {
		System.out.println("==== Negatico ou Positivo? ====\n");
		System.out.print("Digite um némero: ");
		n = scan.nextInt();
	}
	if (n < 0) {
	System.out.println("\nO número "+ n +" é negativo!");
	}
	else {
		System.out.println("\nO némero "+ n + " é positivo!");
	}
	
	
	
	
	
	}

}
