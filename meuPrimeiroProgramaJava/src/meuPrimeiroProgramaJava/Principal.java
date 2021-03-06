/**
 * Meu primeiro programa Java
 * 
 * Este programa mostra ao aluno:
 * 1) Que um programa Java é construído dentro de um projeto Java.
 * 2) Todo programa Java deve ter uma classe com um método main.
 * 3) Como exibir informações no terminal (console) do Java.
 * 4) Como ler uma string do terminal (console) do Java.
 */
package meuPrimeiroProgramaJava;

import java.util.Scanner;

/**
 * @author Akira Data: 03/02/2021
 */
public class Principal { // Classe que contém o método principal.
	public static void main(String[] args) {
		
		// Saldação e pergunta o nome.
		System.out.println("Olá amigo!\nQual é o seu nome?");

		// Ler uma string do console usando a biblioteca Scanner.
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();

		// Exibir um string usando printf.
		System.out.printf("Olá %s!", nome);
		in.close();
		
		// Nota: implementar leitura da idade e exibi-la
	}

}
