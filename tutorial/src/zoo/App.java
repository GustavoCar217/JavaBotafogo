package zoo;

public class App {

	public static void main(String[] args) {
		Gato gato = new Gato();
		Jacare jaca = new Jacare();
		Cachorro cao = new Cachorro();
		
		jaca.setNome("Jacaré");
		jaca.setRaca("albino");
		jaca.setPeso(50);
		System.out.println(jaca.getNome());
		jaca.brincar();
		System.out.println(jaca.getPeso() + "\n");
		
		gato.setNome("Gato");
		gato.setCor("preto");
		System.out.println(gato.getNome());
		gato.brincar();
		
		cao.setNome("Cachorro");
		System.out.println(cao.getNome());
		cao.brincar();
	}

}
