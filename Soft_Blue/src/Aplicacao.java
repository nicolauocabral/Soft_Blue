
public class Aplicacao {

	public static void main(String[] args) {
		Matematica m = new Matematica();
		
		int soma1 = m.somar(25, 31);
		System.out.println(soma1);
		
		int soma = m.somar(10, 5, 35);
		System.out.println(soma);
		
		double soma2 = m.somar(10.5, 5.1);
		System.out.println(soma2);
		
	}

}
