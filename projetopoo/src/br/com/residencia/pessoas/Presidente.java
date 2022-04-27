package br.com.residencia.pessoas;

import java.util.ArrayList;
import java.util.List;
import br.com.residencia.agencias.Agencia;
import br.com.residencia.enums.TipoUsuario;

public class Presidente extends Funcionario {

	private Integer idPresidente;
	List<Agencia> agencia = new ArrayList<>();

	public Presidente(TipoUsuario tipoUsuario, String nome, String genero, String estadoCivil, String cpf,
			String telefone, String email, String dataNascimento, Integer idEndereco, Integer idFuncionario,
			String senha, Double salario, Integer idPresidente) {
		super(tipoUsuario, nome, genero, estadoCivil, cpf, telefone, email, dataNascimento, idEndereco, idFuncionario,
				senha, salario);
		this.idPresidente = idPresidente;
		this.agencia = new ArrayList<Agencia>();
	}

	public Presidente() {

	}

	public Integer getIdPresidente() {
		return idPresidente;
	}

	public List<Agencia> getAgencia() {
		return agencia;
	}

	public void addToAgencia(Agencia agencia) {
		this.agencia.add (agencia);
	}

}
