package br.com.residencia.pessoas;



import java.time.LocalDate;

import br.com.residencia.enums.TipoUsuario;

public class Funcionario extends Pessoa {

	private Integer idFuncionario;
	private String senha;
	private Double salario;

	public Funcionario(TipoUsuario tipoUsuario, String nome, String genero, String estadoCivil, String cpf,
			String telefone, String email, LocalDate dataNascimento, Integer idEndereco, Integer idFuncionario,
			String senha, Double salario) {
		super(tipoUsuario, nome, genero, estadoCivil, cpf, telefone, email, dataNascimento, idEndereco);
		this.idFuncionario = idFuncionario;
		this.senha = senha;
		this.salario = salario;
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

	@Override
	public String toString() {
		return "Funcionario [idFuncionario=" + idFuncionario + ", senha=" + senha + ", salario=" + salario + "]";
	}

}