package meuPrimeiroProgramaJava;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		// Saldação e pergunta o nome.
		System.out.println("Olá amigo!\nQual é o seu nome?"); 
		
		// Ler o nome.
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		//Saldação específica.
		System.out.printf("Olá %s!\n", nome);
	}
}
