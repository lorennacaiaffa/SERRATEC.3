
//Um programa "Total de produtos" irá solicitar que o cliente digite quantos produtos irá comprar.
//Depois, exibe a mensagem: "Parabéns por comprar x produtos!", substituindo x pela quantidade.

package br.com.residencia;
import java.util.Scanner;

public class Total_de_Produtos {
	
public static void main(String[] args) {
try (Scanner leia = new Scanner(System.in)) {
	int p;
			
	System.out.println("==== Total de Produtos ====");
	System.out.print("\nQuantos produtos você irá comprar? ");
	p = leia.nextInt();
	
	System.out.println("\nObrigada por comprar "+ p + " produtos!");
}
    
    
    
	}

}
