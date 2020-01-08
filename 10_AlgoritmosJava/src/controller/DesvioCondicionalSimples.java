package controller;
import util.Teclado;
public class DesvioCondicionalSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,x;
		//Comentatop
		a = Teclado.lerInt("Informe o primeiro numero");//Comentario
		//Comentario
		b = Teclado.lerInt("Informe o segundo numero");
		x = a + b;
		
		if(x > 10)
		{
			System.out.println("O valor da soma é:" +x);
		}
	}

}
