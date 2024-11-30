package ex01Metodos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex07 {
	
	public static void obterDataAtual() {
		Date dataAtual = new Date();
		
		String dataFormatada = new SimpleDateFormat("dd/MM/yyyy").format(dataAtual);
		
		System.out.println("Data atual: "+dataFormatada);
	}

	public static void main(String[] args) {
		obterDataAtual();	
	}

}
