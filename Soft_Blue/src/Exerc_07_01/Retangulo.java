package Exerc_07_01;

public class Retangulo implements AreaCalculavel {
	
	double alt, base;
	
	public Retangulo(double alt, double base) {
		this.alt = alt;
		this.base = base;
	
	}

	@Override
	public double CalcularArea() {
		
		return base * alt;
	}
	
	

}
