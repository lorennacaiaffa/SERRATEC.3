package br.com.residencia.pessoas;

import java.time.LocalDate;

import br.com.residencia.enums.TipoPessoa;

public abstract class Funcionario extends Pessoa {

	private Integer idFuncionario;
	private String senha;
	private Double salario;
	private String cargo;
	
	public Funcionario(String nome, String genero, String estadoCivil, String cpf, String telefone, String email,
			LocalDate dataNascimento, TipoPessoa tipoPessoa, Integer idEndereco, Integer idFuncionario, String senha,
			Double salario, String cargo) {
		super(nome, genero, estadoCivil, cpf, telefone, email, dataNascimento, tipoPessoa, idEndereco);
		this.idFuncionario = idFuncionario;
		this.senha = senha;
		this.salario = salario;
		this.cargo = cargo;
	}

	public Funcionario() {

	}

	public Integer getIdFuncionario() {
		return idFuncionario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
