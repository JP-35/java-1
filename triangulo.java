package triangulo;

import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {

	    int lado1;
	    int lado2;
	    int lado3;
		
		Scanner scanner = new Scanner(System.in);

	        System.out.print("Introduce la longitud del primer lado: ");
	         lado1 = scanner.nextInt();
	        
	        System.out.print("Introduce la longitud del segundo lado: ");
	        lado2 = scanner.nextInt();
	        
	        System.out.print("Introduce la longitud del tercer lado: ");
	        lado3 = scanner.nextInt();
	        

	        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
	        		System.out.println("Las longitudes deben ser mayores que cero.");    
	        	} else if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
	        	if (lado1 == lado2 && lado2 == lado3) {
	        		System.out.println("El triangulo es equilatero.");
	            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
	                System.out.println("El triangulo es isosceles.");
	            } else {
	                System.out.println("El triangulo es escaleno.");
	            }
	        } else {
	            System.out.println("Los lados no forman un triangulo");
	        }

	        scanner.close();
	    }

	}
