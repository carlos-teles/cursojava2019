package controller;

public class ChamadaMetodos {

	public static void primeiro() {
		System.out.println("Iniciando m�todo 1");
		segundo();
		System.out.println("Terminando m�todo 1");
	}

	public static void terceiro() {
		System.out.println("Iniciando m�todo 3");
		System.out.println("Terminando m�todo 3");
	}
	
	public static void segundo() {
		System.out.println("Iniciando m�todo 2");
		System.out.println("Terminando m�todo 2");
	}

	
	
	public static void main(String[] args) {
		System.out.println("Iniciando Programa");
		terceiro();
		primeiro();
		System.out.println("Continuando Programa");
		System.out.println("Terminando Programa");
	}


}
