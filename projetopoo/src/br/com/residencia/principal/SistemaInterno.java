package br.com.residencia.principal;

import java.io.IOException;



import br.com.residencia.io.LeituraEscrita;
import br.com.residencia.menu.MenuInicial;

//import br.com.residencia.menu.MenuInicial;

import br.com.residencia.io.LeituraEscrita;
import br.com.residencia.menu.MenuInicial;


public class SistemaInterno {

	public static void main(String[] args) throws IOException {
		

		MenuInicial mn = new MenuInicial();


		MenuInicial mn = new MenuInicial();

		LeituraEscrita.leitor("entrada.txt");
//		LeituraEscrita.escritor("./");

		mn.login();
		
				


//		MenuInicial mn = new MenuInicial();
//		mn.login();
//		mn.menu();



		LeituraEscrita.leitor("entrada.txt");
//		LeituraEscrita.escritor("./");

		mn.login();
		
				

	
	}
}
