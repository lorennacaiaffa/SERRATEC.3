package br.com.residencia.projetopoo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LeituraEscrita {
	final static String PATH_BASICO = "./temp/";
	final static String EXTENSAO = ".txt";

	public static void escritor(String path) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva o nome do arquivo: ");
		String nome = sc.nextLine();
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nome));
		System.out.println("Escreva algo: ");
		while (true) {
			String linha = sc.nextLine();// pula a linha
			if (linha.equals("/fim"))
				break;
			buffWrite.append(linha);
			buffWrite.newLine();
		}

		buffWrite.close();
		sc.close();

	}

	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path));
		String linha = "";
		try {
			while (true) {
				linha = buffRead.readLine();
				if (linha != null) {
					System.out.println(linha);
				} else {
					break;
				}
			}
			buffRead.close();
		} catch (Exception e) {
			System.out.println("Arquivo não encontrado no caminho " + PATH_BASICO + EXTENSAO);
		}
	}

//		public void pegarDados(String linha) {
//			String[] lines = linha.split(";");
	//
//		}

}
