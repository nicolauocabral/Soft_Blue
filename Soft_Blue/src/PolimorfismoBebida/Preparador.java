package PolimorfismoBebida;

public class Preparador {
	
	public void prepararBebibda(Bebida bebida) {
		System.out.println("Preparando bebida " + bebida.getNome());
		
		bebida.preparar();
		
		if (bebida.isAquecer()) {
			System.out.println("Aquecendo a bebida " + bebida.getNome());
		}
		
		System.out.println("Bebida preparada com sucesso! ");
		
		
		
	}

}
