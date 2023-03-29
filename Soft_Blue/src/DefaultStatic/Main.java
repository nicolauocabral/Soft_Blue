package DefaultStatic;

public class Main {

	public static void main(String[] args) {
		Automovel f = new Ferrari();
		f.acelerar();
		f.frear();
		f.derrapar();
		
		Automovel p = new Porshe();
		p.acelerar();
		p.frear();
		p.derrapar();
		
		int vm = Automovel.getVelocidadeMaxima();
		System.out.println(vm);

	}

}
