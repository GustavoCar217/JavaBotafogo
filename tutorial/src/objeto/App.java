package objeto;

public class App {

	public static void main(String[] args) {
		Cadeira cade = new Cadeira();
		
		cade.setCor("Preta");
		cade.setMaterial("Madeira");
		cade.setBase("acolchoada");
		cade.setNumPes(4);
		
		cade.sentar();
		cade.levantar();
		cade.mover();
		cade.empillhar();
	}

}
