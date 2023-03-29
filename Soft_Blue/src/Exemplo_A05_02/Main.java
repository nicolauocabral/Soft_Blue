package Exemplo_A05_02;

public class Main {

	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria();
		
		c1.setNumConta(3898);
		c1.setAtiva(true);
		
		c1.deposito(50000);
		c1.sacar(25);
		
		double saldo = c1.getSaldo();
		
		System.out.println("Seu saldo: " + saldo);
	}

}
