package br.com.residencia.projetopoo.pessoas;

import java.util.Date;

public class Gerente extends Funcionario {

	private Integer idGerente;
	private Integer idAgencia;
	
	public Gerente(String nome, String genero, String estadoCivil, String cpf, String telefone, String endereco,
			String email, Date dataNascimento, String tipoPessoa, Integer idFuncionario, String senha, String login,
			Double salario, String cargo, Integer idGerente, Integer idAgencia) {
		super(nome, genero, estadoCivil, cpf, telefone, endereco, email, dataNascimento, tipoPessoa, idFuncionario,
				senha, login, salario, cargo);
		this.idGerente = idGerente;
		this.idAgencia = idAgencia;
	}

	public Integer getIdGerente() {
		return idGerente;
	}

	public void setIdGerente(Integer idGerente) {
		this.idGerente = idGerente;
	}

	public Integer getIdAgencia() {
		return idAgencia;
	}

	public void setIdAgencia(Integer idAgencia) {
		this.idAgencia = idAgencia;
	}
	
	
	
	

	}


