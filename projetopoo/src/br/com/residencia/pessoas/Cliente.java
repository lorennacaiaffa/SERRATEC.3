package br.com.residencia.pessoas;

import java.util.Date;

public class Cliente extends Pessoa {

	private Integer idCliente;
	private Integer idGerente;
	
	public Cliente(String nome, String genero, String estadoCivil, String cpf, String telefone, String email,
			Date dataNascimento, String tipoPessoa, Integer idEndereco, Integer idCliente, Integer idGerente) {
		super(nome, genero, estadoCivil, cpf, telefone, email, dataNascimento, tipoPessoa, idEndereco);
		this.idCliente = idCliente;
		this.idGerente = idGerente;
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

	
}
