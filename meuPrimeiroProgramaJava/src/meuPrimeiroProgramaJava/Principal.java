package meuPrimeiroProgramaJava;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Ol� amigo!\nQual � o seu nome?"); 
		
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		System.out.printf("Ol� %s!\n", nome);
	}
}
