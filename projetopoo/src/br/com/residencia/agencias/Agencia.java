package br.com.residencia.agencias;

import java.util.HashMap;
import java.util.Map;


public class Agencia {

	private Integer idAgencia;
	private Integer idDiretor;
	private Integer idEndereco;
	private String numeroAgencia;
	
	public static Map<String, Agencia> mapaAgencias = new HashMap<>();
	
	public Agencia(Integer idAgencia, Integer idDiretor, Integer idEndereco, String numeroAgencia) {
		super();
		this.idAgencia = idAgencia;
		this.idDiretor = idDiretor;
		this.idEndereco = idEndereco;
		this.numeroAgencia = numeroAgencia;
	}

	public Agencia() {
		
	}

	public Integer getIdAgencia() {
		return idAgencia;
	}

	public Integer getIdDiretor() {
		return idDiretor;
	}

	public void setIdDiretor(Integer idDiretor) {
		this.idDiretor = idDiretor;
	}

	public Integer getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Integer idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	@Override
	public String toString() {
		return "IdAgencia: " + idAgencia + "\nIdEndereco: " + idEndereco
				+ "\nnumeroAgencia: " + numeroAgencia;
	}
	
	
}
