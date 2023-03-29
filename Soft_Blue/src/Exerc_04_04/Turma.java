package Exerc_04_04;

public class Turma {
	Aluno aluno1 = new Aluno();
	Aluno aluno2 = new Aluno();
	Aluno aluno3 = new Aluno();
	
	//double mediaA1 = aluno1.calcularMedia();
	//double mediaA2 = aluno2.calcularMedia();
	//double mediaA3 = aluno3.calcularMedia();
	
	double calcularMediaTurma() {
		//double mediaT = (mediaA1 + mediaA2 + mediaA3)/3;
		
		return (aluno1.calcularMedia() + aluno2.calcularMedia() + aluno3.calcularMedia())/3; 
	}
}
