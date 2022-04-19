package br.com.residencia.poo_project.pessoas;

public class Diretor extends Pessoa {

	Integer idDiretor;
	Double salario;
	Integer agenciaTrabalho;
	String login;
	String senhaAcesso;

	public Integer getIdDiretor() {
		return idDiretor;
	}

	public void setIdDiretor(Integer idDiretor) {
		this.idDiretor = idDiretor;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
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
