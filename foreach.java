package contrasena;

import java.util.Scanner;

public class foreach {

	public static void main(String[] args) {
		
		 int[] numeros = {3, 7, 2, 9, 1, 6, 4, 8, 5, 10};
		 
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Ingresa un número X: ");
	        
	        int x = scanner.nextInt();
	        int contador = 0;
	        for (int num : numeros) {
	            if (num > x) {
	                contador++;
	            }
	        }
	        
	        System.out.println("Elementos mayores que " + x + ": " + contador);
	        
	        scanner.close();
	    }
	}