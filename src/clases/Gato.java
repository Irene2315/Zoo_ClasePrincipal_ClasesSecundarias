package clases;

public class Gato extends Animal {
	private int vidas;

public Gato(){
		
	}
	public Gato(int vidas) {
		super();
		this.vidas = vidas;
	}
	public int getVidas() {
		return vidas;
	}
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	public void maullar() {
		System.out.println("Estoy maullando");
		
	}
	public void morir() {
		System.out.println("Me muero");
	}
	

}
