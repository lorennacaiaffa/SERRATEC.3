package br.com.residencia.menu;

public class MenuInicial {
	private String login;
	private String Senha;
	
	public MenuInicial(String login, String senha) {
		super();
		this.login = login;
		Senha = senha;
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
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}
	
	
}
