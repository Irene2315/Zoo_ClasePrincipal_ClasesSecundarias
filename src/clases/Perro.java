package clases;

public class Perro extends Animal {
private String raza;

 public Perro(){
	
}

public Perro(String raza) {
	super();
	this.raza = raza;
}

public String getRaza() {
	return raza;
}

public void setRaza(String raza) {
	this.raza = raza;
}

public void ladrar() {
	System.out.println("Estoy ladrando");
}

}
