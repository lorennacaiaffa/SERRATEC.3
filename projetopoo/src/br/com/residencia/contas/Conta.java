package br.com.residencia.contas;

import br.com.residencia.enums.TipoConta;
//import br.com.residencia.principal.ContaCorrente;
//import br.com.residencia.principal.ContaPoupanca;

public abstract class Conta {

	private TipoConta tipo;
	private Integer idConta;
	private String senhaConta;
	private String numeroAgencia;
	private String numeroConta;
	private Double saldo;
	private String dataAbertura;
	private Boolean status;

	public Conta(TipoConta tipo, Integer idConta, String senhaConta, String numeroAgencia, String numeroConta,
			Double saldo, String dataAbertura, Boolean status) {
		super();
		this.tipo = tipo;
		this.idConta = idConta;
		this.senhaConta = senhaConta;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.dataAbertura = dataAbertura;
		this.status = status;
	}

	public Conta() {

	}

	public TipoConta getTipo() {
		return tipo;
	}

	public Integer getIdConta() {
		return idConta;
	}

	public String getSenha() {
		return senhaConta;
	}

	public void setSenha(String senhaConta) {
		this.senhaConta = senhaConta;
	}

	public String getNumeroAgencia() {
		return numeroAgencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setSatatus(Boolean status) {
		this.status = status;
	}


//	public void saldo() {
//		if (idCliente < 7) {
//		ContaCorrente cntc = new ContaCorrente();
//		cntc.saldo();
//	}
//
//		else {
//	ContaPoupanca cntp = new ContaPoupanca();cntp.saldo();
//	}}
//
//	public boolean sacar(double valor) {
//		if (this.saldo < valor) {
//			return false;
//		} else {
//			double novoSaldo = this.saldo - valor;
//			this.saldo = novoSaldo;
//			return true;
//		}
//	}
//
//	public boolean depositar(double valor) {
//		if (0 > valor) {
//			return false;
//		} else {
//			double novoSaldo = this.saldo + valor;
//			this.saldo = novoSaldo;
//			return true;
//		}
//	}
//
//	public boolean transferir(ContaCorrente suaConta, double valor) {
//		if (this.saldo < valor) {
//			System.out.println("Saldo insuficiente");
//			return false;
//		} else {
//			double novoSaldo = this.saldo - valor;
//			this.saldo = novoSaldo;
//			suaConta.saldo = suaConta.saldo + valor;
//			return true;
//		}
//	}

	@Override
	public String toString() {
		return "Conta [tipo=" + tipo + ", idConta=" + idConta + ", senhaConta=" + senhaConta + ", numeroAgencia="
				+ numeroAgencia + ", numeroConta=" + numeroConta + ", saldo=" + saldo + ", dataAbertura=" + dataAbertura
				+ ", status=" + status + "]";
	}
}