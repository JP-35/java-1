package adivina;

import java.util.Random;
import java.util.Scanner;

public class adivina {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int num = random.nextInt(101);
		int intento;
		
		System.out.println("intente adivinar el num");
		do {
			
			intento = scanner.nextInt();
			
			if (intento>num) {
				System.out.println("el num secreto es menor");
			}
			
			if (intento<num) {
				System.out.println("el num secreto es mayor");
			}
		}while(intento!=num);
		
		scanner.close();
		
		System.out.println("adivinaste el num");
	}

}
