package br.com.residencia.contas;

import br.com.residencia.enums.TipoConta;

public class ContaPoupanca extends Conta {

	private Integer idContaPoupança;
	private Double rendimento;

	public ContaPoupanca(TipoConta tipo, Integer idConta, String senhaConta, String numeroAgencia, String numeroConta,
			Double saldo, String dataAbertura, Boolean status, Integer idContaPoupança, Double rendimento) {
		super(tipo, idConta, senhaConta, numeroAgencia, numeroConta, saldo, dataAbertura, status);
		this.idContaPoupança = idContaPoupança;
		this.rendimento = rendimento;
	}

	public ContaPoupanca() {

	}

	public Integer getIdContaPoupança() {
		return idContaPoupança;
	}

	public Double getRendimento() {
		return rendimento;
	}

	public void setRendimento(Double rendimento) {
		this.rendimento = rendimento;
	}

}
