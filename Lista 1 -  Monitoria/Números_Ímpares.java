//6 - Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, 
//um valor por linha, inclusive o X, se for o caso.


package br.com.residencia;
import java.util.Scanner;
public class Números_Ímpares {
	 static int num;

	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("==== Números Ímpares ====\n");	
	 System.out.print("Digite um valor inteiro: ");
		num = scan.nextInt();
		
	     for(int i = 1; i <= num; i++){
	       if(i % 2 != 0){
		System.out.println(i);
	 }
	}
	     scan.close();
	
	  }
			
	}

