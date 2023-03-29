package Exemplo_A05_03;

public class Main {

	public static void main(String[] args) {
		
		Retangulo r1 = new Retangulo();
		
		double area1 = r1.calcularArea();
		System.out.println("Area = " + area1);
		
		Retangulo r2 = new Retangulo(2, 6);
		double area2 = r2.calcularArea();
		System.out.println("Area 2 = " + area2);
		
		Quadrado q = new Quadrado(6);
		double area3 = q.calcularArea();
		System.out.println("Area 3 = " + area3);

	}

}
