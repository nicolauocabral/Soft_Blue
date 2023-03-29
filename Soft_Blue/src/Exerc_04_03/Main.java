package Exerc_04_03;

public class Main {
	public static void main(String[] args) {
		Triangulo t = new Triangulo ();
		t.b = 9;
		t.h = 5;
		System.out.println("Area do triangulo: " + t.calcularArea());
		
		Quadrado q = new Quadrado ();
		q.l = 5;
		double area = q.calcularArea() ;
		System.out.println("Area do quadrado: " + area);
		
		Circuferencia c = new Circuferencia();
		c.r = 5.3;
		area = c.calcularArea();
		System.out.println("Area do Circulo: " + area);
		
		Trapezio ta = new Trapezio();
		ta.b = 2;
		ta.bm = 8;
		ta.h = 6;		
		area = ta.calcularArea();		
		System.out.println("Area do Trapezio: " + area);
	}
	
	

}
