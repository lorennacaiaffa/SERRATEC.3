package br.com.residencia.pessoas;


import br.com.residencia.enums.TipoUsuario;

public class Gerente extends Funcionario {

	private Integer idGerente;
	private Integer idAgencia;

	public Gerente(TipoUsuario tipoUsuario, String nome, String genero, String estadoCivil, String cpf, String telefone,
			String email, String dataNascimento, Integer idEndereco, Integer idFuncionario, String senha,
			Double salario, Integer idGerente, Integer idAgencia) {
		super(tipoUsuario, nome, genero, estadoCivil, cpf, telefone, email, dataNascimento, idEndereco, idFuncionario,
				senha, salario);
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
