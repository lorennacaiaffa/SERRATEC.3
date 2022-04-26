package br.com.residencia.menu;

import java.util.Scanner;

public class MenuInicial {
	String login = "luis";
	String senha = "123";

	Scanner scan = new Scanner(System.in);
	
	public MenuInicial(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
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
			System.out.println("\t\t\t===== Bem-vindo ao Banco <Heli/Code> =====\n");
			System.out.print("\t\t\tDigite seu CPF: ");
			usuario = scan.next();
			System.out.print("\t\t\tDigite sua senha: ");
			chave = scan.next();
			if (usuario.equals(login) && chave.equals(senha)) {
				System.out.println("\n\t\t\t\t==== SEJA BEM-VINDO ====\n");
			} else {
				System.out.println("\n\t\tErro, login ou senha incorretos, digite novamente!");
				for(int i = 0; i < 2; i++)
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