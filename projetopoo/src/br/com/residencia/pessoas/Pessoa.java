package br.com.residencia.pessoas;

import java.time.LocalDate;

import br.com.residencia.enums.TipoPessoa;

public class Pessoa {

	private String nome;
	private String genero;
	private String estadoCivil;
	private String cpf;
	private String telefone;
	private String email;
	private LocalDate dataNascimento;
	private TipoPessoa tipoPessoa;
	private Integer idEndereco;

	public Pessoa(String nome, String genero, String estadoCivil, String cpf, String telefone, String email,
			LocalDate dataNascimento, TipoPessoa tipoPessoa, Integer idEndereco) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.estadoCivil = estadoCivil;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.idEndereco = idEndereco;
	}

	public Pessoa () {
		
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

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}
	
	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public Integer getIdEndereco() {
		return idEndereco;
	}

	
}
