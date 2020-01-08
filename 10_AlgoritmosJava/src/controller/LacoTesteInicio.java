package controller;

import util.Teclado;

public class LacoTesteInicio {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r, x, i;
		i = 1;
		boolean aw;
		aw = false;
		// while (i < 5) {
		while (aw == true) {
			x = Teclado.lerInt("Digite um número (" + i + "): ");
			r = x * 3;
			System.out.println(r);
			// i = i + 1;
			i++;
		}
	}
}
