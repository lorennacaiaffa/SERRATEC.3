package br.com.residencia;
import java.util.Scanner;
public class Mini_calculadora {

public static void main(String[] args) {
		
int n1, n2, soma, sub, mult, div;
Scanner leia = new Scanner(System.in);
	
System.out.println("==== Mini Calculadora ====\n");
	
System.out.print("\nDigite um n�mero: ");
n1 = leia.nextInt();
	
System.out.print("\nDigite o segundo n�mero: ");
n2 = leia.nextInt();
leia.close();
	
	soma = (n1 + n2);
	sub = (n1 - n2);
	mult = (n1 * n2);
	div = (n1 / n2);
	
System.out.print("\nSoma: "+ soma);
System.out.print("\nSubtra��o: "+ sub);
System.out.print("\nMultiplica��o: "+ mult);
System.out.print("\nDivis�o: "+ div);
		
		
		
		
	}
}
