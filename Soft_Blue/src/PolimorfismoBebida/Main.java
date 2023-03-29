package PolimorfismoBebida;

public class Main {

	public static void main(String[] args) {
		Refrigerante refri = new Refrigerante();
		LeiteQuente leite = new LeiteQuente();
		Preparador prepa = new Preparador();
		
		
		prepa.prepararBebibda(refri);
	}

}
