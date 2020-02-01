package controller;
public class ExemploMetodoString {
	public static void main(String args[])
	{
		String url = "http://www.senai.rj.br/ctti/turma2010011";
		String email = "aluno@senai.br";
	
		String dominio;
		dominio = url.substring(7,22);
		System.out.println("Dominio: " + dominio );
		
		String complemento;
		complemento = url.substring(23);
		System.out.println("Complemento do Dominio: " + complemento );
		
		
		String nomeUsuario;
		nomeUsuario = email.substring(0, email.indexOf('@'));
		System.out.println("Usuario e-mail: " + nomeUsuario);
		
		String maiuscula, minuscula, palavra1, palavra2;
		palavra1 = "carro";
		palavra2 = "CASA";
		maiuscula = palavra1.toUpperCase(); 
		System.out.println("Palavra Maiúscula:"+maiuscula);
		
		minuscula = palavra2.toLowerCase(); 
		System.out.println("Palavra Minúscula:"+minuscula);		
		
		/*
		System.out.println("======================================");
		
		String pedacos_url[] = url.split("/");
		for( int i=0;i<pedacos_url.length;i++ )
		{
			System.out.println(pedacos_url[i]);
		}
		*/
		
	}
}
