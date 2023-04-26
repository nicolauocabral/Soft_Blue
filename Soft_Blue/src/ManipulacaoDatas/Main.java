package ManipulacaoDatas;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.lang.model.element.NestingKind;

import java.util.Date;
import java.io.ObjectInputStream.GetField;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

//import java.sql.Date;


public class Main {

	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		Date data = new Date();
		System.out.println(data);
		
		DateFormat dfs = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("\n" + dfs.format(data));
		
		DateFormat dfm = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(dfm.format(data));
		
		DateFormat dfl = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(dfl.format(data));
		
		DateFormat dff = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(dff.format(data));
		
		String sd1 = "01/07/2030 10:03:06";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(sdf.format(data));
		
		System.out.println("\nAno: " + gc.get(Calendar.YEAR));
		System.out.println("Mes: " + gc.get(Calendar.MONTH));
		System.out.println("Dia do mes: " + gc.get(Calendar.DAY_OF_MONTH));
		System.out.println("Dia da semana: " + gc.get(Calendar.DAY_OF_WEEK));
		System.out.println("Dia do ano : " + gc.get(Calendar.DAY_OF_YEAR));
		System.out.println(("Semana do mes: " + gc.get(Calendar.WEEK_OF_MONTH)));
		System.out.println("Semana do ano: " + gc.get(Calendar.WEEK_OF_YEAR));
		System.out.println("Dia da semana do mes: " + gc.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("Hora: " + gc.get(Calendar.HOUR));
		System.out.println("AM/PM: " +gc.get(Calendar.AM_PM));
		System.out.println("Hora do dia: " + gc.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minuto: " + gc.get(Calendar.MINUTE));
		System.out.println("Segundos: " + gc.get(Calendar.SECOND));
		
		try {
			Date d1 = sdf.parse(sd1);
			System.out.println("\n" + d1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		String sd2 = "20240609";
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");
		try {
			Date d2 =sdf1.parse(sd2);
			System.out.println("\n" + d2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		//mudando a data que esta trabalhando
		gc.set(Calendar.YEAR, 2029);
		gc.set(Calendar.MONTH, Calendar.SEPTEMBER);
		
		System.out.println("\nNovo ano: " + gc.get(Calendar.YEAR));
		System.out.println("Novo mes: " + gc.get(Calendar.MONTH));
		
		//operacao com data
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		Calendar gg = Calendar.getInstance();
		System.out.println("\nData de hoje: " + df.format(gg.getTime()));
		
		//Adicionar 10 dias
		gg.add((GregorianCalendar.DAY_OF_MONTH), 10);
		System.out.println(("Data acrecentada 10 dias: " + df.format(gg.getTime())));
		
	}

}
