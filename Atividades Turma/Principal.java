package br.com.residencia;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		Conta minhaConta = new Conta();
		minhaConta.titular = "Juvenal";
		minhaConta.saldo = 1200;
		minhaConta.numero = 321;

		Conta suaConta = new Conta();
		suaConta.titular = "Coringa";
		suaConta.saldo = 30000;
		suaConta.numero = 666;
		minhaConta.transfere(suaConta, 1200);

		System.out.println(minhaConta.titular + minhaConta.saldo);
		System.out.println(suaConta.titular + suaConta.saldo);

	}

}