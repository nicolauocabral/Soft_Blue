package Exerc_07_01;

public class Quadrado implements AreaCalculavel {
	 
	private double lado;
	
	public Quadrado (double lado) {
		this.lado = lado;
	}
	
	@Override
	public double CalcularArea() {
		
		return lado * lado; 
	}
	

}
