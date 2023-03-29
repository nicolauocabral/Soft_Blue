package Exerc_04_01;

public class Relogio {
	Ponteiro ponteiroHora = new Ponteiro();
	Ponteiro ponteiroMinuto = new Ponteiro();
	Ponteiro ponteiroSegundo = new Ponteiro();
	
	void acertarRelogio (int hora, int minutos, int segundos) {
		 hora = hora % 12;
		 
		 ponteiroHora.Posicao = hora;
		 ponteiroMinuto.Posicao = minutos/5;
		 ponteiroSegundo.Posicao = segundos/5;
		 
	}
	
	int lerHora () {
		return ponteiroHora.Posicao + 12;
	}
	int lerMinuto () {
		return ponteiroMinuto.Posicao * 5;
	}
	int lerSegundos () {
		return ponteiroSegundo.Posicao * 5;
	}
	

}
