package controller;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ExemploFormatacaoNumero {

	public static void main(String[] args) {
		NumberFormat f = NumberFormat.getCurrencyInstance();
		double valor = 55008.537;
		System.out.println("Sem formatacao: " + valor);
		System.out.println("Com formatacao: " + f.format(valor));
		
		System.out.println("=====================================");
		double porcento = 0.05;
		System.out.println("Sem formatacao: " + porcento);
		System.out.println("Com formatacao: " + NumberFormat.getPercentInstance().format(porcento));		

		System.out.println("=====================================");
		NumberFormat n = NumberFormat.getNumberInstance();
		double numero = 1494.05;
		System.out.println("Sem formatacao: " + numero);
		System.out.println("Com formatacao: " + n.format(numero));
		
		System.out.println("=====================================");
		double valor2 = 55155812017.66;
		DecimalFormat df = new DecimalFormat("R$ ###,###,###.00");
		System.out.println("Sem formatacao: " + valor2);
		System.out.println("Com formatacao: " + df.format(valor2));
		
		
	}

}
