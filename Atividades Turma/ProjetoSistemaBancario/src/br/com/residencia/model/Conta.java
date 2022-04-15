package br.com.residencia.model;

import br.com.residencia.enums.TipoConta;

public class Conta {
	private TipoConta tipo;
	private Integer agencia;
	private Integer numeroConta;
	
	public Conta(TipoConta tipo, Integer agencia, Integer numeroConta) {
		this.tipo = tipo;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
	}

	public TipoConta getTipo() {
		return tipo;
	}

	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}
	
}
