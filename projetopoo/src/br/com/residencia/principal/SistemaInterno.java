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
//		mn.login();
//		mn.menu();



		LeituraEscrita.leitor("entrada.txt");

//		LeituraEscrita.escritor("./");

		
//	Cliente c1 = new Cliente();
//	c1.setCpf("150.793.057-70");
//	c1.setSenhaCliente("123");
	
	
	}
}
