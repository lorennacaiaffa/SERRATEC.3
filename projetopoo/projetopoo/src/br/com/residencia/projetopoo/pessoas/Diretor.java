package br.com.residencia.projetopoo.pessoas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.residencia.agencias.Agencia;

public class Diretor extends Funcionario {

	private Integer idDiretor;
	private Integer qtdAgencia; 
	// count diretor bateu, soma mais um for 1=0 até comprimento da lista e vai
	// incremetar
	List<Agencia> agencia = new ArrayList<>();// tentar varrer a lista com lenght

	public Diretor(String nome, String genero, String estadoCivil, String cpf, String telefone, String email,
			Date dataNascimento, String tipoPessoa, Integer idEndereco, Integer idFuncionario, String senha,
			String login, Double salario, String cargo, Integer idDiretor, Integer qtdAgencias,
			List<Agencia> agencias) {
		super(nome, genero, estadoCivil, cpf, telefone, email, dataNascimento, tipoPessoa, idEndereco, idFuncionario,
				senha, login, salario, cargo);
		this.idDiretor = idDiretor;
		this.qtdAgencia = qtdAgencia;
		this.agencia = agencia;
	}

	public Diretor() {

	}

	public Integer getIdDiretor() {
		return idDiretor;
	}

	public Integer getQtdAgencias() {
		return qtdAgencia;
	}

	public void setQtdAgencia(Integer qtdAgencia) {
		this.qtdAgencia = qtdAgencia;
	}

	public List<Agencia> getAgencia() {
		return agencia;
	}

	public void setAgencias(List<Agencia> agencia) {
		this.agencia = agencia;
	}

}
