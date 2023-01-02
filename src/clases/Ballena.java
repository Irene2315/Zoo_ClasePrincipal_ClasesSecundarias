package clases;

public class Ballena extends Animal {
private String oceano;

public Ballena(){
	
}

public Ballena(String oceano) {
	super();
	this.oceano = oceano;
}

public String getOceano() {
	return oceano;
}

public void setOceano(String oceano) {
	this.oceano = oceano;
}


public void nadar() {
	System.out.println("Estoy nadando");
}

}
