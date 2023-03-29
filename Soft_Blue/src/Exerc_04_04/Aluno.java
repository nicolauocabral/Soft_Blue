package Exerc_04_04;

public class Aluno {
	Prova prova1 = new Prova();
	Prova prova2 = new Prova();
	
	//double nota1 = prova1.notaParte1 + prova1.notaParte2;
	//double nota2 = prova2.notaParte1 + prova2.notaParte2;
	
	double calcularMedia() {
		double media = (prova1.calculaNotaTotal() + prova2.calculaNotaTotal())/2;
		return media;
	}

}
