//4 - Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.

package br.com.residencia;
import java.util.Scanner;
public class Par_ou_�mpar {

	public static void main(String[] args) {
		
		float n = 0;
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("==== Par ou �mpar? ====\n");
			System.out.print("Digite um n�mero: ");
			n = scan.nextInt();
	}
	        if (n % 2 == 0) {
	        System.out.println("\nO N�mero � par!");	
	        }
	        else {
	        System.out.println("\nO n�mero � impar");	
	        }
	
	}
	
}
