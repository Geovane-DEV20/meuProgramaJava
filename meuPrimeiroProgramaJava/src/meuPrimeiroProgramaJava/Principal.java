package meuPrimeiroProgramaJava;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Olá amigo!\nQual é o seu nome?"); 
		
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		System.out.printf("Olá %s!\n", nome);
	}
}
