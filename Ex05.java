package ex01Metodos;

import java.util.Scanner;

public class Ex05 {
	
	public static String maiorNumero(int numero01, int numero02) {
		
		return (numero01 > numero02)? "O maior n�mero �: "+numero01 : "O maior n�mero �: "+numero02 ;
	}

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite dois n�meros e descubra o maior");
		System.out.println("------------------------------------------");
		
		System.out.print("Primeiro n�mero: ");
		int num01 = leitor.nextInt();
		
		System.out.print("Segundo n�mero: ");
		int num02 = leitor.nextInt();
		
		System.out.println(maiorNumero(num01,num02));
		
		leitor.close();
		
	}

}
