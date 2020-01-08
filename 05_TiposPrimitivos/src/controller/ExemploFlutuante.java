package controller;

public class ExemploFlutuante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salario, aumento, novoSalario;
		salario = 2000.10;
		aumento = 0.15;
		novoSalario = salario + ( salario * aumento );
		System.out.println("Novo Salario R$:"+novoSalario);

	}

}
