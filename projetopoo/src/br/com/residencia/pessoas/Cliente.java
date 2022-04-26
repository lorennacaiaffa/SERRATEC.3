package br.com.residencia.pessoas;

import java.util.Date;

public class Cliente extends Pessoa {

	private Integer idCliente;
	private Integer idGerente;
	private Integer idConta;

	public Cliente(String nome, String genero, String estadoCivil, String cpf, String telefone, String email,
			Date dataNascimento, String tipoPessoa, Integer idEndereco) {
		super(nome, genero, estadoCivil, cpf, telefone, email, dataNascimento, tipoPessoa, idEndereco);
	}

	public Cliente() {
		
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public Integer getIdGerente() {
		return idGerente;
	}

	public void setIdGerente(Integer idGerente) {
		this.idGerente = idGerente;
	}

	public Integer getIdConta() {
		return idConta;
	}

	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}

	

	
}
