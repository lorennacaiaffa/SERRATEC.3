package br.com.residencia.poo_project.pessoas;

import java.util.Date;

public class Pessoa extends Endereco {

	String nome;
	String cpf;
	String telefone;
	String email;
	Date dataNascimento;
	public Pessoa(Integer idEndereco, String cep, String rua, String complemento, Integer numero, String bairro,
			String cidade, String estado, String nome, String cpf, String telefone, String email, Date dataNascimento) {
		super(idEndereco, cep, rua, complemento, numero, bairro, cidade, estado);
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.dataNascimento = dataNascimento;
	}


	
	
}
