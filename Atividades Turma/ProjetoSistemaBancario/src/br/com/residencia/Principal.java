package br.com.residencia;

import java.io.IOException;

import br.com.residencia.model.Conta;

public class Principal {

	public static void main(String[] args) throws IOException {
		
		//Como chamar o método leitor da classe LeituraEscrita
		LeituraEscrita.leitor("entrada.txt");
		
		//Como chamar o método escritor da classe LeituraEscrita
		LeituraEscrita.escritor("./");

		System.out.println("\nMetodo transferir, depositar e sacar\n");

			Conta minhaConta = new Conta(null, null, null);
			minhaConta.titular = "Juvenal";
			minhaConta.saldo = 1200;
			minhaConta.numero = 321;

			Conta suaConta = new Conta(null, null, null);
			suaConta.titular = "Coringa";
			suaConta.saldo = 30000;
			suaConta.numero = 666;
			minhaConta.transferir(suaConta, 1000);
			minhaConta.depositar(600);
			minhaConta.sacar(415);
			
			System.out.println(minhaConta.titular + " " + minhaConta.saldo);
			System.out.println(suaConta.titular + " " + suaConta.saldo);
		
			
		}


}
