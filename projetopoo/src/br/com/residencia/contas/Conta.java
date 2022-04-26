package br.com.residencia.contas;

import java.util.Date;

import br.com.residencia.enums.TipoConta;

public abstract class Conta {
	
	private TipoConta tipo;
	private Integer idConta;
	private String senhaConta;
	private String numeroAgencia;
	private String numeroConta;
	private Double saldo;
	private Date dataAbertura;
	private Boolean status;
	
	public Conta(TipoConta tipo, Integer idConta, String senhaConta, String numeroAgencia, String numeroConta, Double saldo,
			Date dataAbertura, Boolean status) {
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

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setSatatus(Boolean status) {
		this.status = status;
	}
	
	






//	public boolean saldo(double valor) {
//	if (this.saldo < sacar) {
//		return false;
//	} else {
//		double novoSaldo = this.saldo - valor;
//		this.saldo = novoSaldo;
//		return true;
//	}
//}


	
//	public boolean sacar(double valor) {
//	if (this.saldo < valor) {
//		return false;
//	} else {
//		double novoSaldo = this.saldo - valor;
//		this.saldo = novoSaldo;
//		return true;
//	}
//}

//public boolean depositar(double valor) {
//	if (0 > valor) {
//		return false;
//	} else {
//		double novoSaldo = this.saldo + valor;
//		this.saldo = novoSaldo;
//		return true;
//	}
//}

//public boolean transferir(ContaCorrente suaConta, double valor) {
//	if (this.saldo < valor) {
//		System.out.println("Saldo insuficiente");
//		return false;
//	} else {
//		double novoSaldo = this.saldo - valor;
//		this.saldo = novoSaldo;
//		suaConta.saldo = suaConta.saldo + valor;
//		return true;
//	}
//}
}

