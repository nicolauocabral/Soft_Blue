package Heranca;

public class Veiculo {
	protected String Marca;
	protected String Modelo;
	protected int Ano;
	
	public void buzinar () {
		System.out.println("Fom-Fom");
	}
	
	public void imprimirDados() {
		System.out.println("Marca: " + Marca);
		System.out.println("Modelo: " + Modelo);
		System.out.println("Ano: " + Ano);
			
	}


}
