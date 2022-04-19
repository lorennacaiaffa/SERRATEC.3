package br.com.residencia.poo_project.pessoas;

import java.util.Date;

public class Diretor extends Pessoa {

	Integer idDiretor;
	Double salario;
	Integer agenciaTrabalho;
	String login;
	String senhaAcesso;
	
	public Diretor(Integer idEndereco, String cep, String rua, String complemento, Integer numero, String bairro,
			String cidade, String estado, String nome, String cpf, String telefone, String email, Date dataNascimento,
			Integer idDiretor, Double salario, Integer agenciaTrabalho, String login, String senhaAcesso) {
		super(idEndereco, cep, rua, complemento, numero, bairro, cidade, estado, nome, cpf, telefone, email,
				dataNascimento);
		this.idDiretor = idDiretor;
		this.salario = salario;
		this.agenciaTrabalho = agenciaTrabalho;
		this.login = login;
		this.senhaAcesso = senhaAcesso;
	}

}
