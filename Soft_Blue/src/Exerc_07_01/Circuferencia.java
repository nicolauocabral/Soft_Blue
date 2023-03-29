package Exerc_07_01;

public class Circuferencia implements AreaCalculavel{
	
	private double raio;
	public Circuferencia (double raio) {
		this.raio = raio;
	}

	@Override
	public double CalcularArea() {
		
		return Math.PI * raio * raio;
	}
	

}
