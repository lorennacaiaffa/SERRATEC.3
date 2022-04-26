package br.com.residencia.principal;

import java.io.IOException;
import br.com.residencia.menu.MenuInicial;
import br.com.residencia.agencias.Agencia;
import br.com.residencia.io.LeituraEscrita;
import br.com.residencia.pessoas.Funcionario;
import br.com.residencia.contas.ContaCorrente;
import br.com.residencia.contas.ContaPoupanca;
import br.com.residencia.enderecos.Endereco;
import br.com.residencia.pessoas.Cliente;
import br.com.residencia.pessoas.Diretor;
import br.com.residencia.pessoas.Gerente;
import br.com.residencia.pessoas.Presidente;

public class SistemaInterno {

	public static void main(String[] args) throws IOException {
		
		MenuInicial mn = new MenuInicial();
		mn.login();
		mn.menu();

//		Funcionario funcionario = new Gerente();
//		System.out.println(funcionario.getBonificacao());
//
//		Funcionario funcionario2 = new Funcionario();
//		System.out.println(funcionario2.getBonificacao());

		// Como chamar o método leitor da classe LeituraEscrita
//		LeituraEscrita.leitor("entrada.txt");

		// Como chamar o método escritor da classe LeituraEscrita
//		LeituraEscrita.escritor("./");

		
	Cliente c1 = new Cliente();
	c1.setCpf("150.793.057-70");
	c1.setSenhaCliente("123");
	
	Cliente c2 = new Cliente();
	Cliente c3 = new Cliente();
	Cliente c4 = new Cliente();
	Cliente c5 = new Cliente();
	Cliente c6 = new Cliente();
	Cliente c7 = new Cliente();

	Gerente g1 = new Gerente();
	Gerente g2 = new Gerente();
	Gerente g3 = new Gerente();
	Gerente g4 = new Gerente();

	Diretor d1 = new Diretor();
	Diretor d2 = new Diretor();

	Presidente p1 = new Presidente();

	ContaCorrente cc1 = new ContaCorrente();
	ContaCorrente cc2 = new ContaCorrente();
	ContaCorrente cc3 = new ContaCorrente();
	ContaCorrente cc4 = new ContaCorrente();
	ContaCorrente cc5 = new ContaCorrente();
	ContaCorrente cc6 = new ContaCorrente();

	ContaPoupanca cp1 = new ContaPoupanca();
	ContaPoupanca cp2 = new ContaPoupanca();
	ContaPoupanca cp3 = new ContaPoupanca();
	ContaPoupanca cp4 = new ContaPoupanca();
	ContaPoupanca cp5 = new ContaPoupanca();
	ContaPoupanca cp6 = new ContaPoupanca();

	Endereco end1 = new Endereco();
	Endereco end2 = new Endereco();
	Endereco end3 = new Endereco();
	Endereco end4 = new Endereco();
	Endereco end5 = new Endereco();
	Endereco end6 = new Endereco();
	Endereco end7 = new Endereco();
	Endereco end8 = new Endereco();
	Endereco end9 = new Endereco();
	Endereco end10 = new Endereco();
	Endereco end11 = new Endereco();
	Endereco end12 = new Endereco();
	Endereco end13 = new Endereco();
	Endereco end14 = new Endereco();
	Endereco end15 = new Endereco();
	Endereco end16 = new Endereco();
	Endereco end17 = new Endereco();

	Agencia a1 = new Agencia();
	Agencia a2 = new Agencia();
	Agencia a3 = new Agencia();
	Agencia a4 = new Agencia();
	}
}
