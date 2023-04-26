package GerandoNumRandomicos;

import java.util.Random;

public class main {

	public static void main(String[] args) {
		Random r = new Random();
		

		// aqui so vai gerar os mesmo numeros pois foi plantado a semente
		// Random r = new Random(123456);

		for (int i = 0; i < 10; i++)

		{
			//double d = Math.random();
			//int d = r.nextInt(50);
			int d = gerarInt(50,70);

			System.out.println((i + 1) + " => " + d);
		}

	}
	
	static int gerarInt (int inicio, int fim) {
		int intervalo = fim - inicio;
		int n = (int) (Math.random() * intervalo) + inicio;
		return n;
	}

}
