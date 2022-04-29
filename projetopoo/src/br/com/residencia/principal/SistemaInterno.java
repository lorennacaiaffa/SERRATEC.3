package br.com.residencia.principal;

import java.io.IOException;
import java.util.InputMismatchException;

import br.com.residencia.contaException.ContaException;
import br.com.residencia.io.LeituraEscrita;

public class SistemaInterno {
public static void main(String[] args)
			throws IOException, InputMismatchException, NullPointerException, ContaException {

		LeituraEscrita.leitor("entrada.txt");
	
		Principal principal = new Principal();
		principal.menuInterativo();

	}
}
