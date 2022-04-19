package br.com.residencia.poo_project.pessoas;

import java.util.Date;

public class Gerente extends Pessoa {

	Integer idGerente;
	Double salario;
	Double bonus;
	Integer agenciaTrabalho;
	String login;
	String senhaAcesso;
	public Gerente(Integer idEndereco, String cep, String rua, String complemento, Integer numero, String bairro,
			String cidade, String estado, String nome, String cpf, String telefone, String email, Date dataNascimento,
			Integer idGerente, Double salario, Double bonus, Integer agenciaTrabalho, String login,
			String senhaAcesso) {
		super(idEndereco, cep, rua, complemento, numero, bairro, cidade, estado, nome, cpf, telefone, email,
				dataNascimento);
		this.idGerente = idGerente;
		this.salario = salario;
		this.bonus = bonus;
		this.agenciaTrabalho = agenciaTrabalho;
		this.login = login;
		this.senhaAcesso = senhaAcesso;
	}

	

}
