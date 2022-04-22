package br.com.residencia.projetopoo.contas;

import java.util.Date;

import br.com.residencia.enums.TipoConta;

public class ContaCorrente extends Conta {

	private Integer idContaCorrente;
	private Double chequeEspecial;
	private Double taxa;

	
	
	public ContaCorrente(TipoConta tipo, Integer idConta, String senha, String numeroAgencia, String numeroConta,
			Double saldo, Date dataAbertura, Boolean status) {
		super(tipo, idConta, senha, numeroAgencia, numeroConta, saldo, dataAbertura, status);
	}

	public ContaCorrente() {

	}

	public Integer getIdContaCorrente() {
		return idContaCorrente;
	}

	public Double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(Double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

}
