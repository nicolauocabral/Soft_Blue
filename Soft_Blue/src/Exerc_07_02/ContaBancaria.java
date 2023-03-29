package Exerc_07_02;

public abstract class ContaBancaria {
	private double saldo;
	
	public double deposito(double valor) {
		this.saldo = saldo - valor;
		return saldo;
	}
	
	public double sacar (double valor) {
		return saldo - valor;
	}
	
	
	

}
