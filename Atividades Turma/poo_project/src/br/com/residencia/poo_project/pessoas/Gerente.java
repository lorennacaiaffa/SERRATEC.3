package br.com.residencia.poo_project.pessoas;

public class Gerente extends Pessoa {

	Integer idGerente;
	Double salario;
	Double bonus;
	Integer agenciaTrabalho;
	String login;
	String senhaAcesso;

	public Integer getIdGerente() {
		return idGerente;
	}

	public void setIdGerente(Integer idGerente) {
		this.idGerente = idGerente;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}

	public Integer getAgenciaTrabalho() {
		return agenciaTrabalho;
	}

	public void setAgenciaTrabalho(Integer agenciaTrabalho) {
		this.agenciaTrabalho = agenciaTrabalho;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenhaAcesso() {
		return senhaAcesso;
	}

	public void setSenhaAcesso(String senhaAcesso) {
		this.senhaAcesso = senhaAcesso;
	}

}
