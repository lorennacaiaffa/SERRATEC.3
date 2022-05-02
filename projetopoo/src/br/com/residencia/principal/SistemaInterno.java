package br.com.residencia.principal;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;

import br.com.residencia.contaException.ContaException;
import br.com.residencia.io.LeituraEscrita;
import br.com.residencia.menu.MenuGerente;
import br.com.residencia.pessoas.Cliente;

public class SistemaInterno {
public static void main(String[] args)
			throws IOException, InputMismatchException, NullPointerException, ContaException {

		
			Principal principal = new Principal();
			Principal.inciarLeituraCliente();
			principal.menuInterativo();
			
	}

}
