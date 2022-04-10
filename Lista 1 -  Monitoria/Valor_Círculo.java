//2- Faça um programa para ler o valor do raio de um círculo, 
//e depois mostrar o valor da área deste círculo com quatro casas decimais.
//Fórmula da área: area = π . raio². Considere o valor de π = 3.14159.

package br.com.residencia;
import java.util.Scanner;
public class Valor_Círculo {
public static void main(String[] args) {

    double r, a;
    try (Scanner scan = new Scanner(System.in)) {
		System.out.println("==== Valor do raio do círculo ===\n");
		System.out.print("Digite o valor do raio do círcilo: ");
		r = scan.nextDouble();
	}
	a = 3.14159*Math.pow(r,2);
	
	System.out.println("\nO valor da área é: %.4f %n\"" + a);
	
	
 }
}