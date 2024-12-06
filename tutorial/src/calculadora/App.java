package calculadora;

public class App {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		

		// int m = calculadora.multiplicar(7, 9); usar a variavel para uso multiplo como nao foi necessario usar mais de uma vez n há necessecidade
		System.out.println("A multiplicação é: " + calculadora.multiplicar(7, 9));
		// int s = calculadora.somar(6, 4);
		System.out.println("A soma é: " + calculadora.somar(6, 4));
	}

}
