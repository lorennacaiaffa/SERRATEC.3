package br.com.residencia;
//O sistema �Mais que mil� ir� apresentar o resultado da soma dos 4 primeiros m�ltiplos de 4 acima de mil,
//subtraindo dos 4 primeiros n�meros primos a partir de um.
public class Mais_que_Mil {

	public static void main(String[] args) {
		
            
	        System.out.println("==== Mais que Mil ====\n");
	        int n1 = 1004, n2 = 1008, n3 = 1012, n4 = 1016;
	        int p1 = 2, p2 = 3, p3 = 5, p4 = 7;
	        int resul1 = n1 + n2 + n3 + n4;
	        int resul2 = p1 + p2 + p3 + p4;
	        int resul3 = resul1 - resul2;
	        System.out.println("Soma dos 4 primeiros m�ltiplos acima de mil: "+resul1);
	        System.out.println("Soma dos 4 primeiros n�meros primos: "+resul2);
	        System.out.println("Subtra��o dos m�ltiplos menos os n�meros primos: "+resul3);


		
		
		
	}

}
