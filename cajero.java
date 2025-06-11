package cajero;

import java.util.Scanner;

public class cajero {

	public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);
	        double saldo = 1000.0; 
	        int opcion;
	        
	        do{
	            System.out.println("1. Consultar saldo");
	            System.out.println("2. Depositar dinero");
	            System.out.println("3. Retirar dinero");
	            System.out.println("4. Salir");
	            System.out.print("Elige una opción: ");
	            opcion = scanner.nextInt();

	            switch (opcion) {
	                case 1:
	                	
	                    System.out.printf("Tu saldo actual es: $%.2f\n", saldo);
	                    break;
	                    
	                case 2:
	                	
	                    System.out.print("Cuanto dinero deseas depositar?");
	                    
	                    double deposito = scanner.nextDouble();
	                    
	                    if (deposito > 0) {
	                        saldo += deposito;
	                        System.out.printf("Deposito exitoso. Saldo actual: $%.2f\n", saldo);
	                    } 
	                    else{
	                        System.out.println("Cantidad no valida.");
	                    }
	                    break;
	                case 3:
	                    System.out.print("Cuanto dinero deseas retirar?");
	                    double retiro = scanner.nextDouble();
	                    if (retiro > 0 && retiro <= saldo) {
	                        saldo -= retiro;
	                        System.out.printf("Retiro exitoso. Saldo actual: $%.2f\n", saldo);
	                    } else if (retiro > saldo) {
	                        System.out.println("No tienes suficiente saldo para este retiro.");
	                    } else {
	                        System.out.println("Cantidad no valida.");
	                    }
	                    break;
	                case 4:
	                    System.out.println("Cerrando...");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Opcion no valida, intenta de nuevo.");
	                    
	                    scanner.close();
	            }
	        } while (opcion != 4);
	}
}