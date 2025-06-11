package sum_digito;

import java.util.Scanner;

public class sum_digito {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String num;
		int suma=0;
		
		System.out.println("ingrese un num:");
		num = scanner.next();
		
		for (char letra: num.toCharArray()) {
			suma+=Character.getNumericValue(letra);
		}
		
		System.out.println("la suma de los digistos es:"+suma);
		
		scanner.close();
	}

}
