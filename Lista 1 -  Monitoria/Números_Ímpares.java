//6 - Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os �mpares de 1 at� X, 
//um valor por linha, inclusive o X, se for o caso.


package br.com.residencia;
import java.util.Scanner;
public class N�meros_�mpares {
	 static int num;

	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("==== N�meros �mpares ====\n");	
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

