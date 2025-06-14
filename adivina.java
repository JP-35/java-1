package adivina;

import java.util.Random; //se importa la galeria random
import java.util.Scanner; //se importa la galeria scanner

public class adivina {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int num = random.nextInt(101); // se genera un numero aleatorio entre 0 y 100
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
