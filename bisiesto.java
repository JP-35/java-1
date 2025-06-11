package bisiesto;

import java.util.Scanner;

public class bisiesto {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int año;
			
		System.out.println("ingrese un año:");
		año = scanner.nextInt();
		
		scanner.close();
		
		if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
			System.out.println("el año es bisiesto");
		}
		else {
			System.out.println("el año no es bisiesto");
		}
	}

}
