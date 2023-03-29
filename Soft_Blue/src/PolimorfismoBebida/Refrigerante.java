package PolimorfismoBebida;

public class Refrigerante extends Bebida {
	
	public Refrigerante () {
		super ("Refrigerante", false);
	}

	@Override
	public void preparar() {		
		super.preparar();
		
		System.out.println("Pegar o Refri");
		System.out.println("Colocar no copo");
		System.out.println("Beber");
	}
	
	

}
