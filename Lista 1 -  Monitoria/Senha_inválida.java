//5 - Escreva um programa que repita a leitura de uma senha at� que ela seja v�lida.
//Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida".
//Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido"
//e o algoritmo encerrado. Considere que a senha correta � o valor 2002.

    package br.com.residencia;
    import java.util.Scanner;

    public class Senha_inv�lida {
	public static void main(String[] args) {
	try (Scanner scan = new Scanner(System.in)) {
		int senha;
			
		System.out.println("==== Senha incorreta ====\n");
			System.out.print("Digite a sua senha: ");
			senha = scan.nextInt();
			while (senha != 2002) 
			{System.out.print("\nSenha Inv�lida, digite novamente: ");
			senha = scan.nextInt();}
			System.out.print("\nAcesso Permitido");
			
	}
			 
			
			
	}
}
