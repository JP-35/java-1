package palabras;

import java.util.Scanner;

public class palabras {

public static void main(String[] args) {
	
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Introduce una frase:");
	        
	        String frase = scanner.nextLine();
	        
	        String[] palabras = frase.split("\\s+");
	        
	        System.out.println("Cantidad de palabras: " + palabras.length);
	        
	        scanner.close();
	    }
}
