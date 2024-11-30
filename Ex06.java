package ex01Metodos;

public class Ex06 {
	
	public static boolean ehPar(int numero) {
		return numero%2 == 0;
	}

	public static void main(String[] args) {
		System.out.println(ehPar(2));
		System.out.println(ehPar(1));
		System.out.println(ehPar(0));
		System.out.println(ehPar(9));
	}

}
