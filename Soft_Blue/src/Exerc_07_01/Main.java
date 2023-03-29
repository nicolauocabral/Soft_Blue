package Exerc_07_01;

public class Main {

	public static void main(String[] args) {
		
		double area;
		Quadrado q = new Quadrado (5);		
		area = q.CalcularArea();
		System.out.println("Area do quadrado = " + area);
		
		AreaCalculavel ret = new Retangulo(10,3);
		area = ret.CalcularArea();
		System.out.println("Area do Retangulo = " + area);
		
		AreaCalculavel circ = new Circuferencia(3.6);
		area =circ.CalcularArea();
		System.out.println("Area da circuferencia = " + area);

	}

}
