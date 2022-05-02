package br.com.residencia.menu;

import java.io.Reader;
import java.util.Scanner;

public class MenuInicial {

	Scanner scan = new Scanner(System.in);

		public void login() {
		String usuario, chave;
		String login = "luis", senha = "123";
		
		do {
			System.out.println("\t\t\t===== Bem-vindo ao Banco <Heli/Code> =====\n");
			System.out.print("\t\t\tDigite seu CPF: ");
			usuario = scan.next();
			System.out.print("\t\t\tDigite sua senha: ");
			chave = scan.next();
					if (usuario.equals(login) && chave.equals(senha)) {
					System.out.println("\n\t\t\t\t==== SEJA BEM-VINDO ====\n");
			} 		else {
					System.out.println("\n\t\tErro, login ou senha incorretos, digite novamente!\n");
					for (int i = 0; i < 2; i++)
					System.out.println(" ");
			}
			
			System.out.println("\t\t*********************************************************\n");
		} while (!usuario.equals(login) || !chave.equals(senha));

	}

	public void menu() {
		int resp;

		do {
			System.out.println("\t\t\t\tEscolha uma opção:\n");
			System.out.println("\t[1] Saldo\t[2] Sacar\t[3] Depositar\t[4]Trasnferir\t[5] Sair");
			resp = scan.nextInt();
			switch (resp) {
			case 1: {
//				cnt.getSaldo();
				break;
			}
			case 2: {
				break;
			}
			case 3: {
				break;
			}
			case 4: {
				break;
			}
			case 5: {
			}

			}
			if (resp < 0 || resp > 5) {
				System.out.println("Escolha uma opção válida.");
			}
			for (int i = 0; i < 20; i++) {
				System.out.println(" ");
			}
			System.out.println("__________________________");
		} while (resp < 0 || resp > 5);
	}
}