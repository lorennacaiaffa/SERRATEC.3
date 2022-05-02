package br.com.residencia.menu;

import java.util.InputMismatchException;

import br.com.residencia.contaException.ContaException;
import br.com.residencia.io.LeituraEscrita;
import br.com.residencia.pessoas.Presidente;
import br.com.residencia.principal.Principal;

public class MenuPresidente {
static Integer inputOpcao;

	static LeituraEscrita leituraEscrita = new LeituraEscrita();
	static Principal principal = new Principal();

	public static void menuPresidente(Presidente presidente) throws InputMismatchException, NullPointerException, ContaException {

		try {
			
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			menuPresidente(presidente);
		}
	}
}
	

