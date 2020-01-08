package controller;
import util.Teclado;
public class Operadores {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Leitura de texto
		String nome;
		nome = Teclado.lerTexto("Digite o nome do aluno: ");

		// Leitura de inteiro
		double nota1, nota2, nota3, nota4, media, media_total;
		double media_para_passar = 7.5;
		//double media_resto;

		nota1 = Teclado.lerDouble("Digite a nota 01: ");
		nota2 = Teclado.lerDouble("Digite a nota 02: ");
		nota3 = Teclado.lerDouble("Digite a nota 03: ");
		nota4 = Teclado.lerDouble("Digite a nota 04: ");

		media_total = nota1 + nota2 + nota3 + nota4;
		media = media_total / 4;

		//media_resto = media_total % 4;
		System.out.println("Nome:" + nome);
		System.out.println("Média:" + media);
		if(media >= media_para_passar)
		{
			System.out.println("PASSOU:" );
			System.out.println(media + " maior que "+media_para_passar );
		}
		else
		{
			System.out.println("Não PASSOU:" );
			System.out.println(media + " menor que "+media_para_passar );
		}
		//System.out.println("Média Resto:" + media_resto);
		System.out.println();
	}
}
