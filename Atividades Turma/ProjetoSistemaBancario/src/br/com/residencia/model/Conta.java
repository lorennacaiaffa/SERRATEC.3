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
	public double saldo;
	public int numero;
	public String titular;
		
	
	public boolean sacar(double valor) {
		if (this.saldo < valor) {
			return false;
		} else {
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;
			return true;
		}
	}

	public boolean depositar(double valor) {
		if (0 > valor) {
			return false;
		} else {
			double novoSaldo = this.saldo + valor;
			this.saldo = novoSaldo;
			return true;
		}
	}
	
	public boolean transferir(Conta suaConta, double valor) {
		if (this.saldo < valor) {
			System.out.println("Saldo insuficiente");
			return false;
		} else {
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;
			suaConta.saldo = suaConta.saldo + valor;
			return true;
		}
		
	}
	
}
	

