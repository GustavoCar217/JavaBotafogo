package tutorial;

import java.util.Date;

public class Decisao {

	public static void main(String[] args) {
		int idade = 45;
		String nome = "pedro";
		
		String data = ("12/12/2024");
		
		Date x = new Date();
		
		//if (nome.equals("pedro")) metodo antigo (|| ou) (&& and/ e) ( != diferente no java)
		
		if(nome == "Pedro") {
			System.out.println("Usuário autenticado!");
		}
		
		
		
		if (idade < 25) {
			System.out.println("Você não pode entrar aqui...");
		}
		
		if (idade < 25) {
			System.out.println("Você não pode entrar aqui...");
		}else {
			System.out.println("Seja bem vindo!");
		}
		
		if (idade < 15) {
			System.out.println("Vai para casa!");
		}else if (idade < 25) {
			System.out.println("Você não pode entrar aqui!");
		}else {
			System.out.println("Seja bem vindo!");
		}
	}

}
