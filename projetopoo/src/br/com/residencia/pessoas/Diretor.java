package br.com.residencia.pessoas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import br.com.residencia.agencias.Agencia;
import br.com.residencia.enums.TipoUsuario;

public class Diretor extends Funcionario {

	private Integer idDiretor;
	private Integer qtdAgencia;
	List<Agencia> agencia = new ArrayList<>();// tentar varrer a lista com lenght
	
	public static Map<String, Diretor> mapaDiretor = new HashMap<>();
	public static TreeMap<String, Diretor> OrdenaUsuarios = new TreeMap<>();

	public Diretor(TipoUsuario tipoUsuario, String nome, String genero, String estadoCivil, String cpf, String telefone,
			String email, LocalDate dataNascimento, Integer idEndereco, Integer idFuncionario, String senha,
			Double salario, Integer idDiretor, Integer qtdAgencia) {
		super(tipoUsuario, nome, genero, estadoCivil, cpf, telefone, email, dataNascimento, idEndereco, idFuncionario,
				senha, salario);
		this.idDiretor = idDiretor;
		this.qtdAgencia = qtdAgencia;
		this.agencia = new ArrayList<Agencia>();
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

	public void addToAgencia(Agencia agencia) {
		this.agencia.add (agencia);
	}

	@Override
	public String toString() {
		return "Diretor [idDiretor=" + idDiretor + ", qtdAgencia=" + qtdAgencia + ", agencia=" + agencia + "]";
	}

}
