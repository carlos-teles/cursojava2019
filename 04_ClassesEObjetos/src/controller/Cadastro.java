package controller;
import model.Carro;
public class Cadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro carro01 = new Carro();
		carro01.modelo = "Uno";
		carro01.fabricante = "FIAT";
		carro01.cor = "Branco";
		carro01.ano = 1997;

		Carro carro02 = new Carro();
		carro02.modelo = "Gol";
		carro02.fabricante = "Volkswagen";
		carro02.cor = "Vermelho";
		carro02.ano = 2001;

		Carro carro03 = new Carro();
		carro03.modelo = "Logan";
		carro03.fabricante = "Renault";
		carro03.cor = "Azul";
		carro03.ano = 2015;

		System.out.println("Modelo: "+carro01.modelo);
		System.out.println("Modelo: "+carro02.modelo);
		System.out.println("Modelo: "+carro03.modelo);
	}

}
