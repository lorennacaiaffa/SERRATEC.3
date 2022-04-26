package br.com.residencia.menu;

import java.util.Scanner;

public class MenuInicial {
	private String login = "luis";
	private String senha = "123";
	
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
	
	public void logar(String login) {
		String usuario, chave;
		do {	
		Scanner scan = new Scanner(System.in);
		System.out.println("Bem vindo.");
		System.out.print("Digite seu CPF: ");
		usuario = scan.next();
		System.out.println("Digite sua senha: ");
		chave = scan.next();
		scan.close();
		if(usuario.equals(login) && chave.equals(senha)) {
			System.out.println("Bem vindo");
		}
		
		for(int i = 0; i < 10; i++);
		System.out.println(" ");
		System.out.println("_______________________");
		}
		while (!usuario.equals(login) && !chave.equals(senha));	
		
	}
	
}
