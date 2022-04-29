package br.com.residencia.contas;


import java.util.HashMap;
import java.util.Map;
import br.com.residencia.enums.TipoConta;
import br.com.residencia.operacoes.Operacoes;

import java.util.Scanner;

import br.com.residencia.enums.TipoConta;
import br.com.residencia.io.LeituraEscrita;
import br.com.residencia.menu.MenuInicial;


public abstract class Conta implements Operacoes {

	private TipoConta tipo;
	private Integer idConta;
	private String senhaConta;
	private String numeroAgencia;
	private String numeroConta;
	private Double saldo;
	private String dataAbertura;
	private Boolean status;
	
	public static Map<String, Conta> mapaContas = new HashMap<>();
//	Set<Integer> agencias = new HashSet<>();

	public Conta(TipoConta tipo, Integer idConta, String senhaConta, String numeroAgencia, String numeroConta,
			Double saldo, String dataAbertura, Boolean status) {
		super();
		this.tipo = tipo;
		this.idConta = idConta;
		this.senhaConta = senhaConta;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.setSaldo(saldo);
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

	public Double saldo(double saldo) {
		return this.getSaldo();
	}


	public Double saldo(double saldo) {
		return this.saldo;
	}

	public boolean sacar(double valor) {
		if (this.saldo < valor) {
			System.out.println("Saldo insuficiente.");
			return false;
		} else {
			double novoSaldo = this.saldo - valor - 0.10;
			this.saldo = novoSaldo;
			return true;
		}
	}

	public boolean depositar(double valor) {
		if (0 > valor) {
			return false;
		} else {
			double novoSaldo = this.saldo + valor - 0.10;
			this.saldo = novoSaldo;
			return true;
		}
	}

//	public boolean transferir(Conta numeroAgencia,Conta numeroConta, double valor) {
//		String resp1, resp2, resp3;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		for (Conta conta: LeituraEscrita.contaCorrentes)
//		for( Conta conta1: LeituraEscrita.contaPoupancas)
//			
//			
//			System.out.println("Digite a agencia Destinat�ria: ");
//			resp1 = sc.next();
//			System.out.println("Digite a agencia Destinat�ria: ");
//			resp2 = sc.next();			
//			System.out.println("Digite a agencia Destinat�ria: ");
//			resp3 = sc.next();			
//		

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
//			
//			double novoSaldo = this.saldo - valor - 0.20;
//			this.saldo = novoSaldo;
//			contaCorrente = suaConta.saldo + valor;
//			return true;
//		}
//	}


	@Override
	public String toString() {
		return "Conta [tipo=" + tipo + ", idConta=" + idConta + ", senhaConta=" + senhaConta + ", numeroAgencia="
				+ numeroAgencia + ", numeroConta=" + numeroConta + ", saldo=" + getSaldo() + ", dataAbertura=" + dataAbertura
				+ ", status=" + status + "]";
	}

}