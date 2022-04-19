package br.com.residencia.poo_project.contas;

import java.util.Date;

import br.com.residencia.poo_project.pessoas.Cliente;

public class ContaPoupanca extends Cliente {

	Integer agencia;
	Integer conta;
	Double saldo;
	public ContaPoupanca(Integer idEndereco, String cep, String rua, String complemento, Integer numero, String bairro,
			String cidade, String estado, String nome, String cpf, String telefone, String email, Date dataNascimento,
			Integer idCliente, Integer idGerente, Integer agencia, Integer conta, Double saldo) {
		super(idEndereco, cep, rua, complemento, numero, bairro, cidade, estado, nome, cpf, telefone, email,
				dataNascimento, idCliente, idGerente);
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
	}

//	public boolean sacar(double valor) {
//		if (this.saldo < valor) {
//			return false;
//		} else {
//			double novoSaldo = this.saldo - valor;
//			this.saldo = novoSaldo;
//			return true;
//		}
//	}

//	public boolean depositar(double valor) {
//		if (0 > valor) {
//			return false;
//		} else {
//			double novoSaldo = this.saldo + valor;
//			this.saldo = novoSaldo;
//			return true;
//		}
//	}

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
//}
}
