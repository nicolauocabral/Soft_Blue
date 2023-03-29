package Exerc_05_01;

public class Main {

	public static void main(String[] args) {
		Lampada l = new Lampada(true);
		l.imprimir();
		
		l.desligar();
		l.imprimir();
		
		l.ligar();
		l.imprimir();

	}

}
