
//Um programa "Total de produtos" ir� solicitar que o cliente digite quantos produtos ir� comprar.
//Depois, exibe a mensagem: "Parab�ns por comprar x produtos!", substituindo x pela quantidade.

package br.com.residencia;
import java.util.Scanner;

public class Total_de_Produtos {
	
public static void main(String[] args) {
try (Scanner leia = new Scanner(System.in)) {
	int p;
			
	System.out.println("==== Total de Produtos ====");
	System.out.print("\nQuantos produtos voc� ir� comprar? ");
	p = leia.nextInt();
	
	System.out.println("\nObrigada por comprar "+ p + " produtos!");
}
    
    
    
	}

}
