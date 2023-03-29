package Exemplo_A05_03;

public class Retangulo {
	
	private double base;
	private double altura;
	
	public Retangulo () {
		//pode ser assim
		this(8,3);
		
		// ou pode ser assim
		//base = 3;
		//altura = 7;	
	}
	
	public Retangulo (double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double calcularArea() {
		return base * altura;
	}

}
