package br.com.residencia;

import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException {
		
		//Como chamar o método leitor da classe LeituraEscrita
		LeituraEscrita.leitor("entrada.txt");
		
		//Como chamar o método escritor da classe LeituraEscrita
		LeituraEscrita.escritor("./");

	}

}
