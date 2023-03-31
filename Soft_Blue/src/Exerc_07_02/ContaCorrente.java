package Exerc_07_02;

public class ContaCorrente extends ContaBancaria{

	@Override
	public double calcularSaldo() {
		
		return saldo - (saldo * 0.1 );
	}

}
