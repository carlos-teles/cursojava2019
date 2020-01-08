package controller;

public class SobrecargaMetodo {
	int idade;
	String nome;
	double cpf;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SobrecargaMetodo scm = new SobrecargaMetodo();
		//scm.cadastrarPessoa(28);
		//scm.cadastrarPessoa("Michael Ferreira");
		scm.cadastrarPessoa(35, "Fabrício Gomes");
	}

	public void cadastrarPessoa(double valor) {
		cpf = valor;
		System.out.println("CPF: " + cpf);
	}
	
	
	public void cadastrarPessoa(int valor) {
		idade = valor;
		System.out.println("Idade: " + idade);
	}

	public void cadastrarPessoa(String valor) {
		nome = valor;
		System.out.println("Nome: " + nome);
	}

	public void cadastrarPessoa(int valor1, String valor2) {
		idade = valor1;
		nome = valor2;
		System.out.println("Idade: " + idade + " – Nome: " + nome);
	}

}
