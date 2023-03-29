package Heranca;

public class main {

	public static void main(String[] args) {
		
		System.out.println("Carro");
		Carro c = new Carro ();
		c.Marca = "Fiat";
		c.Modelo = "Modelo";
		c.Ano = 2022;
		c.imprimirDados();
		c.buzinar();
		
		System.out.println("Motocicleta");
		Motocicleta m = new Motocicleta();
		m.Marca ="Honda";
		m.Modelo = "ybr";
		m.Ano = 2023;		
		m.imprimirDados();
		m.buzinar();

	}

}
