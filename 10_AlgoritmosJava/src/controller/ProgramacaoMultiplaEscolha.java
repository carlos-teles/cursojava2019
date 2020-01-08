package controller;

import util.Teclado;

public class ProgramacaoMultiplaEscolha {
	public static void main(String[] args) {
		int matr, numFinal;
		matr = Teclado.lerInt("Informe matrícula");
		numFinal = matr % 10;

		System.out.println("Matricula:" + matr);
		System.out.println("Final da Matricula:" + numFinal);

		switch (numFinal) {
		case 0:
			System.out.println("Pagamento em Janeiro");
			break;
		case 1:
			System.out.println("Pagamento em Fevereiro");
			break;
		case 2:
			System.out.println("Pagamento em Março");
			break;
		case 3:
			System.out.println("Pagamento em Abril");
			break;
		default:
			System.out.println("Pagamento em Maio");
		}

	}

}
