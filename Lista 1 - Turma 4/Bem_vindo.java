package br.com.residencia;

import java.util.Scanner;

public class Bem_vindo {

 public static void main(String[] args) {
 	 
 String nome, sobrenome;
 Scanner leia = new Scanner(System.in);
 
 System.out.println("===== Bem-vindo =====\n\n");
 
 System.out.print("Qual o seu nome? ");
 nome = leia.next();
 System.out.print("\nQual o seu sobrenome? ");
 sobrenome = leia.next();
 leia.close();
 System.out.println("\nOlá "+ nome+ " "+ sobrenome+ ",bem-vindo(a) ao universo da programação!");
 
 
 
     }
 }
