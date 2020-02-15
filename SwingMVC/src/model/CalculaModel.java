package model;

public class CalculaModel {
	private int valorCalculo;
	
	public int getValorCalculo(){
		return valorCalculo;
	}
	
	public void somaDoisNumeros(int primeiroNumero,int segundoNumero){
		valorCalculo = primeiroNumero + segundoNumero;
	}
}
