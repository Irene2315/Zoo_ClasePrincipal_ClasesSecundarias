package clases;

public class GestorHerenciaAnimales {
		public void run() {
			System.out.println("--------Ballena--------");
			
			Ballena bal1= new Ballena ();
			bal1.nadar();
			System.out.println();
			
			System.out.println("------Ornitorrinco---------");
			Ornitorrinco orni1= new Ornitorrinco();
			orni1.comer();
			System.out.println();
			
			System.out.println("-----------Loro------------");
			Loro lor1=new Loro();
			lor1.hablar("Hola soy un loro y me gusta hablar");
			System.out.println();
			
			System.out.println("------------Gato-------------");
			Gato ga1= new Gato();
			ga1.maullar();
			ga1.morir();
			System.out.println();
			
			System.out.println("-------------Perro-------------");
			Perro per1= new Perro();
			per1.ladrar();
			System.out.println();
			
			
			
			
		}
	

}
