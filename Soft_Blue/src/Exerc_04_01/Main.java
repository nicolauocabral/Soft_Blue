package Exerc_04_01;

public class Main {

	public static void main(String[] args) {
		Relogio r1 = new Relogio();
		
		r1.acertarRelogio(24, 14, 58);
		System.out.println("Horas "+ r1.ponteiroHora.Posicao);
		System.out.println("Minutos " + r1.ponteiroMinuto.Posicao);
		System.out.println("Segundos " + r1.ponteiroSegundo.Posicao);
		
		//r1.lerHora();
		System.out.println("Hora certa: " + r1.lerHora());
		System.out.println("Minutos: " + r1.lerMinuto());
		System.out.println("Segundos: " + r1.lerSegundos());
		

	}

}
