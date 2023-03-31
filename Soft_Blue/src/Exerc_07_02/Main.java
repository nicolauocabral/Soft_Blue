package Exerc_07_02;

public class Main {

	public static void main(String[] args) {
		
		
		ContaBancaria cc = new ContaCorrente();
		
		cc.depositar(10000);
		cc.sacar(100);		
		//cc.calcularSaldo();
		double saldo = cc.calcularSaldo();		
		System.out.println("Saldo final da conta corrente: " + saldo );
		
		ContaBancaria ci = new ContaInvestimento();
		
		ci.depositar(1000);
		ci.sacar(100);
		saldo = ci.calcularSaldo();
		System.out.println("Saldo final da conta investimento: "+ saldo);
		
		cc.transferir(10, ci);
		saldo = cc.calcularSaldo();
		System.out.println("Saldo da CC: " + saldo);
		saldo = ci.calcularSaldo();
		System.out.println("Saldo da CI: " + saldo );
				

	}

}
