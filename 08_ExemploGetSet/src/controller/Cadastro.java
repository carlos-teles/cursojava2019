package controller;
import model.Pessoa;
public class Cadastro {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa people_00 = new Pessoa();
		people_00.setNome("Carlos Teles");
		people_00.setIdade(39);
		people_00.setSexo("Masculino");

		Pessoa people_01 = new Pessoa();
		people_01.setNome("Maria Antonia");
		people_01.setIdade(5);
		people_01.setSexo("Feminino");		
		
		System.out.println("Nome: "+ people_00.getNome());
		System.out.println("Idade: "+ people_00.getIdade());
		System.out.println("Sexo: "+ people_00.getSexo());
		
		System.out.println("=============================");
				
		System.out.println("Nome: "+ people_01.getNome());
		System.out.println("Idade: "+ people_01.getIdade());
		System.out.println("Sexo: "+ people_01.getSexo());		
	}
}
