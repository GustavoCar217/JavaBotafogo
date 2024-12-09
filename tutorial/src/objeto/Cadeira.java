package objeto;

public class Cadeira {
	private String cor;
	private String material;
	private int numPes;
	private String base;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getNumPes() {
		return numPes;
	}
	public void setNumPes(int numPes) {
		this.numPes = numPes;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	
	public void sentar() {
		System.out.println("Fulano sentou-se...");
	}
	public void mover() {
		System.out.println("Fulano moveu a cadeira de lugar");
	}
	public void levantar () {
		System.out.println("Fulano se levantou");
	}
	public void empillhar() {
		System.out.println("Fulano empilhou a cadeira");
	}
}
