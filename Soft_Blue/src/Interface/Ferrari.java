package Interface;

public class Ferrari implements Carro, ItemCaro{

	@Override
	public void virarEsquerda() {
		System.out.println("Ferrari virou a esquerda");
		
	}

	@Override
	public void virarDireita() {
		System.out.println("Ferrari virou a direita");
	}

	@Override
	public void acelerar() {
		System.out.println("Ferrari Acelerou");
		
	}

	@Override
	public void abrirPorta() {
		System.out.println("Ferrari acelerou");
				
	}

	@Override
	public double getPreco() {
		
		return 10000;
	}

}
