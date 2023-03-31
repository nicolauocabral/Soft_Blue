package Exerc_07_02;

public class ContaInvestimento extends ContaBancaria {

	@Override
	public double calcularSaldo() {

		return saldo + (saldo * 0.05);
	}

}
