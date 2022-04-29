package br.com.residencia.poo_project.contas;

import br.com.residencia.poo_project.pessoas.Cliente;

public class ContaPoupanca extends Cliente {

	Integer agencia;
	Integer conta;
	Double saldo;

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Integer getConta() {
		return conta;
	}

	public void setConta(Integer conta) {
		this.conta = conta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}
