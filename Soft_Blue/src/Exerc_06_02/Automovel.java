package Exerc_06_02;

public class Automovel extends Veiculo {

	@Override
	public void ligar() {
		super.ligar();
		System.out.println("Automovel ligado");		
	}

	@Override
	public void desligar() {
		super.desligar();
		System.out.println("Automovel Desligado");
	}
	
	

}
