package controller;

import util.Teclado;

public class DesvioCondicionalEncadeado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sal, salNovo;
		sal = Teclado.lerDouble("Digite o Salário: ");
		// Teste se ganha abaixo de 500
		if (sal < 500) {
			salNovo = sal * 1.15;
			// Teste se ganha acima de 500
		} else {
			// Teste se ganha acima de 500 e abaixo de 1000
			if (sal <= 1000) {
				salNovo = sal * 1.10;
				// Teste se ganha acima de 1000
			} else {
				salNovo = sal * 1.05;
			}
		}
		System.out.println("O Salário com reajuste é: " + salNovo);
	}
}
