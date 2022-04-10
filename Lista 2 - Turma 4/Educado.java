package br.com.residencia;

import java.util.Scanner;

public class Educado {

	public static void main(String[] args) {

		String nom, apelido;
		Scanner scan = new Scanner(System.in);

		System.out.println("==== Educado ====");
		System.out.print("\nQual o seu nome? ");
		nom = scan.next();
		System.out.print("\nOlá " + nom + ".Mas como gostaria de ser chamado? ");
		apelido = scan.next();
		scan.close();

		System.out.println("\nOkay então " + apelido + ", saudações!!");

	}

}
