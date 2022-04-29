package br.com.residencia.pessoas;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import br.com.residencia.enums.TipoUsuario;

public class Cliente extends Pessoa {

	private Integer idCliente;
	private Integer idGerente;
	private Integer idConta;
	private String senhaCliente;

	public static Map<String, Cliente> mapaClientes = new HashMap<>();
	public static TreeMap<String, Cliente> OrdenaUsuarios = new TreeMap<>();
	
	public Cliente(TipoUsuario tipoUsuario, String nome, String genero, String estadoCivil, String cpf, String telefone,
			String email, LocalDate dataNascimento, Integer idEndereco, Integer idCliente, Integer idGerente,
			Integer idConta, String senhaCliente) {
		super(tipoUsuario, nome, genero, estadoCivil, cpf, telefone, email, dataNascimento, idEndereco);
		this.idCliente = idCliente;
		this.idGerente = idGerente;
		this.idConta = idConta;
		this.senhaCliente = senhaCliente;
	}

	public Cliente() {

	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public Integer getIdGerente() {
		return idGerente;
	}

	public void setIdGerente(Integer idGerente) {
		this.idGerente = idGerente;
	}

	public Integer getIdConta() {
		return idConta;
	}

	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}

	public String getSenhaCliente() {
		return senhaCliente;
	}

	public void setSenhaCliente(String senhaCliente) {
		this.senhaCliente = senhaCliente;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", idGerente=" + idGerente + ", idConta=" + idConta
				+ ", senhaCliente=" + senhaCliente + "]";
	}

	
}