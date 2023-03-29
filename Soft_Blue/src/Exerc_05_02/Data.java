package Exerc_05_02;

public class Data {
	public static final int FORMATO_12H = 1;
	public static final int FORMATO_24H = 2;

	private int dia, mes, ano;
	private int hora = -1;
	private int min = -1;
	private int seg = -1;

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public Data(int dia, int mes, int ano, int hora, int min, int seg) {
		this(dia, mes, ano);

		this.hora = hora;
		this.min = min;
		this.seg = seg;

	}

	public void imprimir(int formato) {

		String data = dia + "/" + mes + "/" + ano;

		if (hora == -1) {
			System.out.println(data);
		} else {
			String horario = ":" + min + ":" + seg;
			if (formato == FORMATO_24H) {
				horario = hora + horario;

			} else {
				if (hora == 0) {
					horario = 12 + horario;
					horario += "AM";
				}

				else if (hora >= 12) {
					horario = (hora - 12) + horario;
					horario += " AM";
				}

				else {
					horario = hora + horario;
					horario += " AM";
				}
			}
			System.out.println(data + " " + horario);
		}

	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	public int getHora() {
		return hora;
	}

	public int getMin() {
		return min;
	}

	public int getSeg() {
		return seg;
	}

}
