package br.com.residencia.projetopoo.pessoas;

import java.util.Date;

public class Gerente extends Funcionario {

	private Integer idGerente;
	private Integer idAgencia;
	public Gerente(String nome, String genero, String estadoCivil, String cpf, String telefone, String email,
			Date dataNascimento, String tipoPessoa, Integer idEndereco, Integer idFuncionario, String senha,
			String login, Double salario, String cargo, Integer idGerente, Integer idAgencia) {
		super(nome, genero, estadoCivil, cpf, telefone, email, dataNascimento, tipoPessoa, idEndereco, idFuncionario,
				senha, login, salario, cargo);
		this.idGerente = idGerente;
		this.idAgencia = idAgencia;
	}

	public Gerente() {
		
	}

	public Integer getIdGerente() {
		return idGerente;
	}

	public Integer getIdAgencia() {
		return idAgencia;
	}

	public void setIdAgencia(Integer idAgencia) {
		this.idAgencia = idAgencia;
	}
	
	
}
