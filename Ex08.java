package ex01Metodos;

import java.util.Scanner;

public class Ex08 {

	
	public static int calcularFatorial(int numeroFatoriado) {
		
		int contador = 1;
		int aux = numeroFatoriado;
		
		while(numeroFatoriado>contador) {
			
			aux*=contador;
			
			
			contador++;
		}
		
		return aux;
		
	}
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um número e descubra seu fatorial");
		System.out.println("----------------------------------------");
		
		System.out.print("Digite o número: ");
		int numero = leitor.nextInt();
		System.out.println("Resultado: " +calcularFatorial(numero));
		
		leitor.close();
	}

}
