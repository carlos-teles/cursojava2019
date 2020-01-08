package controller;
import util.Teclado;
public class LacoTesteFim {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		int r, x, i;
		i = 1;
		
		do {
			x = Teclado.lerInt("Digite um número: ");
			r = x * 3;
			System.out.println(r);
			i = i + 1;			
		} while (i <= 1);

		
	}
}
