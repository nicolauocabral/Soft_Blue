package Exerc_04_02;

public class Main {

	public static void main(String[] args) {
		Fracao f1 = new Fracao();
		f1.definirValores(9, 3);
		System.out.println("Fracao 1: " + f1.obterFracao());
		
		Fracao f2 = new Fracao ();
		f2.definirValores(20,5);
		System.out.println("Fracao 2: " + f2.obterFracao());
		
		Fracao f3 = f1.multiplicar(f2);

		System.out.println(f3.calcularValor());
		System.out.println("Fracao 1 x Fracao 2 = " + f3.obterFracao());
	}

}
