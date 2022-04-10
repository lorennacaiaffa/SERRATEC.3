package br.com.residencia;

import java.util.Scanner;

public class Tempo_de_vida {
public static void main(String[] args) {
Scanner leia = new Scanner(System.in);

int c1, c2, c3, c4, c5, eu, soma;

System.out.print("==== Tempo de Vida ====\n");
System.out.print("\nQual é a idade do colega 1? ");
c1 = leia.nextInt();
System.out.print("\nQual é a idade do colega 2? ");
c2 = leia.nextInt();
System.out.print("\nQual é a idade do colega 3? ");
c3 = leia.nextInt();
System.out.print("\nQual é a idade do colega 4? ");
c4 = leia.nextInt();
System.out.print("\nQual é a idade do colega 5? ");
c5 = leia.nextInt();
System.out.print("\nQual é a sua idade? ");
eu = leia.nextInt();

leia.close();

soma = (c1 + c2 + c3 + c4 + c5 + eu);

System.out.println("\nO tempo de vida meu e dos meus colegas é "+ soma);

}


}
