package br.com.residencia;

import java.util.Scanner;

public class Termômetro {
public static void main(String[] args) {
	
	double f, c;
	Scanner leia = new Scanner(System.in);
	
	System.out.println("==== Termômetro ====\n");
	System.out.print("Digite a temperatura em °C: ");
	c = leia.nextInt();
	leia.close();
	
	f = (c * 1.8 + 32);
	
	System.out.println("\nTemperatura em °C: "+c);
	System.out.println("Temperatura em °F: "+f);
		
		
		
		
		
		
		
		
		
		
	}
}
