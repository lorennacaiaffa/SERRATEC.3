package br.com.residencia.pessoas;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import br.com.residencia.enums.TipoUsuario;

public class Gerente extends Funcionario {

	private Integer idGerente;
	private Integer idAgencia;
	
	List<Cliente> clientes = new ArrayList<Cliente>();
	
	public static Map<String, Gerente> mapaGerentes = new HashMap<>();
	public static TreeMap<String, Gerente> OrdenaGerentes = new TreeMap<>();
	
	public Gerente(TipoUsuario tipoUsuario, String nome, String genero, String estadoCivil, String cpf, String telefone,
			String email, LocalDate dataNascimento, Integer idEndereco, Integer idFuncionario, String senha,
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

	
	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public String toString() {
		return "Id Gerente: " + idGerente + "\tNome: " + getNome();
	}

}