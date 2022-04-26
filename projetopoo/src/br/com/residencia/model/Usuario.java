package br.com.residencia.model;

import br.com.residencia.enums.TipoUsuario;

public class Usuario {
	private TipoUsuario tipo;
	private String nome;
	private String cpf;

	public Usuario(TipoUsuario tipo, String nome, String cpf) {
		this.tipo = tipo;
		this.nome = nome;
		this.cpf = cpf;
	}

	public Usuario() {

	}

	public TipoUsuario getTipo() {
		return tipo;
	}

	public void setTipo(TipoUsuario tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
