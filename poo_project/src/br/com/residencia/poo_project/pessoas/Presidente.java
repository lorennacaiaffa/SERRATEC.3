package br.com.residencia.poo_project.pessoas;

import java.util.Date;

public class Presidente extends Pessoa {

	Integer idPresidente;
	Double salario;
	Integer agenciaTrabalho;
	String login;
	String senhaAcesso;
	public Presidente(Integer idEndereco, String cep, String rua, String complemento, Integer numero, String bairro,
			String cidade, String estado, String nome, String cpf, String telefone, String email, Date dataNascimento,
			Integer idPresidente, Double salario, Integer agenciaTrabalho, String login, String senhaAcesso) {
		super(idEndereco, cep, rua, complemento, numero, bairro, cidade, estado, nome, cpf, telefone, email,
				dataNascimento);
		this.idPresidente = idPresidente;
		this.salario = salario;
		this.agenciaTrabalho = agenciaTrabalho;
		this.login = login;
		this.senhaAcesso = senhaAcesso;
	}

}
