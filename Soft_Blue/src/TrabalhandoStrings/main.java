package TrabalhandoStrings;

public class main {

	public static void main(String[] args) {
		String s1 = new String ("abc");
		String s2 = "abc";
		String s3 = "abc";
		
		//maneira correta de comparar
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s1));
		
		//deixar a string maiucula
		s2 = s2.toUpperCase();
		System.out.println(s2);
		
		//formas de concatenat string
		s2 = s2.concat(s3);
		System.out.println(s2);
		s3 = s1+s3;
		System.out.println(s3);
				
		

	}

}
