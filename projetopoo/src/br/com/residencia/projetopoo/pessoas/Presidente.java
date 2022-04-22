package br.com.residencia.projetopoo.pessoas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import br.com.residencia.agencias.Agencia;

public class Presidente extends Funcionario {

	private Integer idPresidente;
	List<Agencia> agencias = new ArrayList<>();

	public Presidente(String nome, String genero, String estadoCivil, String cpf, String telefone, String endereco,
			String email, Date dataNascimento, String tipoPessoa, Integer idFuncionario, String senha, String login,
			Double salario, String cargo, Integer idPresidente, List<Agencia> agencias) {
		super(nome, genero, estadoCivil, cpf, telefone, endereco, email, dataNascimento, tipoPessoa, idFuncionario,
				senha, login, salario, cargo);
		this.idPresidente = idPresidente;
		this.agencias = agencias;
	}

	public Integer getIdPresidente() {
		return idPresidente;
	}

	public List<Agencia> getAgencias() {
		return agencias;
	}

	public void setAgencias(List<Agencia> agencias) {
		this.agencias = agencias;
	}

}
