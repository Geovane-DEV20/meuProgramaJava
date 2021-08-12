package meuPrimeiroProgramaJava;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		// Saldação e pergunta o nome.
		System.out.println("Olá amigo!\nQual é o seu nome?"); 
		
		// Ler o nome.
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		//Saldação específica para o nome lido.
		System.out.printf("Olá %s!\n", nome);
		
		
		
		
		//Perguntar a Idade
		System.out.printf("%s, qual a sua idade?", nome);
		
		// Ler Idade.
		Integer idade = in.nextInt();
		
		//Ler idade para elogiar.
		System.out.printf("%d! Puxa! Como você é jovem!", idade);
		
		//NOTA: Implementar leitura da idade e exibi-la
		
	}
}
