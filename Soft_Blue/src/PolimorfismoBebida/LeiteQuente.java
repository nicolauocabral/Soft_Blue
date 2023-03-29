package PolimorfismoBebida;

public class LeiteQuente extends Bebida {

	public LeiteQuente() {

		super("Leite quente", true);

	}

	@Override
	public void preparar() {

		super.preparar();
		System.out.println("Pegando um copo");
		System.out.println("Coloca no copo");

	}

}
