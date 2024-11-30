package ex01Metodos;

import java.util.Scanner;

public class Ex10 {
	
	public static float calcularMedia(float nota01, float nota02, float nota03) {
		
		float media = (nota01+nota02+nota03)/3;
		
		return media;
	}

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite 3 notas e veja sua média");
		System.out.println("-------------------------------");
		
		System.out.print("Primeira nota: ");
		float nota01 = leitor.nextFloat();
		
		System.out.print("Segunda nota: ");
		float nota02 = leitor.nextFloat();

		System.out.print("Terceira nota: ");
		float nota03 = leitor.nextFloat();
		
		System.out.println("Sua média foi de "+calcularMedia(nota01,nota02,nota03)+" pontos!");
		
		leitor.close();
	}

}
