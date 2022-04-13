package br.com.residencia;

public class Conta {
	int numero;
	String titular;
	double saldo;

	public boolean sacar(double valor) {
		if (this.saldo < valor) {
			return false;
		} else {
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;
			return true;
		}
	}

	boolean transfere(Conta suaConta, double valor) {
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
