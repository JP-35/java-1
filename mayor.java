package mayor;

import java.util.Scanner;
public class mayor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		
		
		System.out.println("ingrese el 1° num:");
		num1 = scanner.nextInt();
		
		System.out.println("ingrese el 2° num:");
		num2 = scanner.nextInt();
		
		System.out.println("ingrese el 3° num:");
		num3 = scanner.nextInt();
		
		scanner.close();
		
		if (num1>num2) {
			if (num1>num3) {
				System.out.println("el 1° num ingresado es el mayor ("+num1+")");
				}
		}
		if (num3>num1 && num3>num2){
			System.out.println("el 3° num ingresado es el mayor ("+num3+")");
		}
		if (num2>num3) {
			System.out.println("el 2° num ingresado es el mayor ("+num2+")");
		}
		
	}

}
