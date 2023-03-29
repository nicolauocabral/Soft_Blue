package Polimorfismo;

public class Main {
	
	public static void main(String[] args) {
		
		Cachorro c = new Cachorro();
		Gato g = new Gato();
		
		falar (c);
		falar(g);
		
	}
	
	private static void falar (Animal a) {
		a.falar();
	}
}
