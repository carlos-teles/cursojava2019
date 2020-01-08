package controller;

import java.util.Calendar;

import util.Teclado;

public class ExemploEntrada {
	public static void main(String[] args) {
		int ano_nasc;
		int ano_atual;
		ano_atual = Calendar.getInstance().get(Calendar.YEAR);
		// Leitura de texto
		String nome;
		nome = Teclado.lerTexto("Digite seu nome: ");
		// Leitura de inteiro
		int idade;
		idade = Teclado.lerInt("Digite sua idade: ");
		ano_nasc =  ano_atual - idade;
		//Leitura de Ponto Flutuante
		double salario;
		salario = Teclado.lerDouble("Digite seu salário: ");
		System.out.println("Nome informado : " + nome);
		System.out.println("Idade informada : " + idade);
		System.out.println("Salário informado : " + salario);
		System.out.println("Ano Nascimento : " + ano_nasc);
		System.out.println("Fim");
	}
}