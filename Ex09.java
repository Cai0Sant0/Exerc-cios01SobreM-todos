package ex01Metodos;

import java.util.Scanner;

public class Ex09 {

	public static String concatenarStrings(String msg01, String msg02) {	
		return "Mensagem concatenada: "+msg01+" "+msg02;
	}
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite duas mensagens para concatenalas");
		System.out.println("---------------------------------------");
		
		
		System.out.print("Primeira Mensagem: ");
		String msg01 = leitor.nextLine();
		
		System.out.print("Segunda Mensagem: ");
		String msg02 = leitor.nextLine();
		
		System.out.println(concatenarStrings(msg01,msg02));
		
		leitor.close();
		
		
	}

}
