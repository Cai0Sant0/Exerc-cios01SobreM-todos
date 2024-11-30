package ex01Metodos;

import java.util.Scanner;

public class Ex05 {
	
	public static String maiorNumero(int numero01, int numero02) {
		
		return (numero01 > numero02)? "O maior número é: "+numero01 : "O maior número é: "+numero02 ;
	}

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite dois números e descubra o maior");
		System.out.println("------------------------------------------");
		
		System.out.print("Primeiro número: ");
		int num01 = leitor.nextInt();
		
		System.out.print("Segundo número: ");
		int num02 = leitor.nextInt();
		
		System.out.println(maiorNumero(num01,num02));
		
		leitor.close();
		
	}

}
