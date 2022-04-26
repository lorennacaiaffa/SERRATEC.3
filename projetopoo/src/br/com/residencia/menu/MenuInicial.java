package br.com.residencia.menu;

import java.util.Scanner;

public class MenuInicial {
	String login = "luis";
	String senha = "123";

	Scanner scan = new Scanner(System.in);
	
	public MenuInicial(String login, String senha) {
		super();
		this.login = login;
		senha = senha;
	}

	public MenuInicial() {
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void login() {
		String usuario, chave;
		do {
			System.out.println("===== Bem-vindo ao Banco <Heli/Code>=====\n");
			System.out.print("Digite seu CPF: ");
			usuario = scan.next();
			System.out.print("Digite sua senha: ");
			chave = scan.next();
			if (usuario.equals(login) && chave.equals(senha)) {
				System.out.println("Seja bem-vindo!\n");
			} else {
				System.out.println("ERROR");
				for(int i = 0; i < 20; i++)
					System.out.println(" ");
			}
			System.out.println("__________________________");
		} while (!usuario.equals(login) || !chave.equals(senha));		
		
	}
	public void menu() {
		int resp;
		
		do {
			System.out.println("Escolha uma opção:");
			System.out.println("[1] Saldo\t[2] Sacar\t[3] Depositar\t[4]Trasnferir\t[5] Sair");
			resp = scan.nextInt();
			switch(resp) {
			case 1:
			break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				
			}
			if(resp < 0 || resp > 5) {
				System.out.println("Escolha uma opção válida.");				
			}
			for(int i = 0; i < 20; i++) {
				System.out.println(" ");				
			}
			System.out.println("__________________________");
		}
		while (resp < 0 || resp > 5);
	}	
}