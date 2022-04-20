package br.com.residencia.projetopoo.pessoas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.residencia.agencias.Agencia;

public class Diretor extends Funcionario {

	 private Integer idDiretor;
	private Integer qtdAgencias;
	//count diretor bateu, soma mais um for 1=0 até comprimento da lista e vai incremetar
	List<Agencia> agencias = new ArrayList<>();//tentar varrer a lista com lenght
	
	public Diretor(String nome, String genero, String estadoCivil, String cpf, String telefone, String endereco,
			String email, Date dataNascimento, String tipoPessoa, Integer idFuncionario, String senha, String login,
			Double salario, String cargo, Integer idDiretor, Integer qtdAgencias, List<Agencia> agencias) {
		super(nome, genero, estadoCivil, cpf, telefone, endereco, email, dataNascimento, tipoPessoa, idFuncionario,
				senha, login, salario, cargo);
		this.idDiretor = idDiretor;
		this.qtdAgencias = qtdAgencias;
		this.agencias = agencias;
	}

	public Integer getIdDiretor() {
		return idDiretor;
	}

	public void setIdDiretor(Integer idDiretor) {
		this.idDiretor = idDiretor;
	}

	public Integer getQtdAgencias() {
		return qtdAgencias;
	}

	public void setQtdAgencias(Integer qtdAgencias) {
		this.qtdAgencias = qtdAgencias;
	}

	public List<Agencia> getAgencias() {
		return agencias;
	}

	public void setAgencias(List<Agencia> agencias) {
		this.agencias = agencias;
	}
	
	
	
}
