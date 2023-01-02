package clases;

public class Ornitorrinco extends Animal {
	private boolean enReserva;

public Ornitorrinco(){
		
	}

	public Ornitorrinco(boolean enReserva) {
		
		this.enReserva = enReserva;
	}

	public boolean isEnReserva() {
		return enReserva;
	}

	public void setEnReserva(boolean enReserva) {
		this.enReserva = enReserva;
	}
	
public void comer() {
	System.out.println("Estoy comiendo");
	
}
}
