package br.com.residencia.pessoas;

import br.com.residencia.enums.TipoUsuario;

public abstract class Pessoa {

	private TipoUsuario tipoUsuario;
	private String nome;
	private String genero;
	private String estadoCivil;
	private String cpf;
	private String telefone;
	private String email;
	private String dataNascimento;
	private Integer idEndereco;

	

	public Pessoa(TipoUsuario tipoUsuario, String nome, String genero, String estadoCivil, String cpf, String telefone,
			String email, String dataNascimento, Integer idEndereco) {
		super();
		this.tipoUsuario = tipoUsuario;
		this.nome = nome;
		this.genero = genero;
		this.estadoCivil = estadoCivil;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.idEndereco = idEndereco;
	}

	public Pessoa() {

	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Integer getIdEndereco() {
		return idEndereco;
	}

}
