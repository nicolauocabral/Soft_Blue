package Exerc_04_04;

public class Main {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		Turma turma = new Turma ();
		turma.aluno1 = a1;
		turma.aluno2 = a2;
		turma.aluno3 = a3;
		
		a1.prova1.notaParte1 = 4.0;
		a1.prova1.notaParte2 = 2.5;
		a1.prova2.notaParte1 = 1.0;
		a1.prova2.notaParte2 = 7.0;
		
		a2.prova1.notaParte1 = 6.5;
		a2.prova1.notaParte2 = 3.5;
		a2.prova2.notaParte1 = 0.0;
		a2.prova2.notaParte2 = 3.0;

		a3.prova1.notaParte1 = 5.0;
		a3.prova1.notaParte2 = 4.0;
		a3.prova2.notaParte1 = 6.0;
		a3.prova2.notaParte2 = 1.5;
		
		System.out.println("A media do aluno 1 foi: " + a1.calcularMedia());
		System.out.println("A media do aluno 2 foi: " + a2.calcularMedia());
		System.out.println("A media do aluno 3 foi: " + a3.calcularMedia());
		
		System.out.println("A media da turma foi: " + turma.calcularMediaTurma());

	}

}
