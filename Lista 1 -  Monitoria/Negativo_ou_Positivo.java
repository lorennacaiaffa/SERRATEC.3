//3 - Fazer um programa para ler um n�mero inteiro, 
//e depois dizer se este n�mero � negativo ou n�o.

package br.com.residencia;
import java.util.Scanner;
public class Negativo_ou_Positivo {

	public static void main(String[] args) {
	int n;
	try (Scanner scan = new Scanner(System.in)) {
		System.out.println("==== Negatico ou Positivo? ====\n");
		System.out.print("Digite um n�mero: ");
		n = scan.nextInt();
	}
	if (n < 0) {
	System.out.println("\nO n�mero "+ n +" � negativo!");
	}
	else {
		System.out.println("\nO n�mero "+ n + " � positivo!");
	}
	
	
	
	
	
	}

}
