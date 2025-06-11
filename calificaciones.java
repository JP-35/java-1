package calificaciones;

import java.util.Scanner;

public class calificaciones {

	public static void main(String[] args) {
		
		double[] calificaciones = new double[5];
        Scanner scanner = new Scanner(System.in);
        double suma=0;
        
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Introduce la calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextDouble();
        }
        for (double cal : calificaciones) {
            suma += cal;
        }
        double promedio = suma / calificaciones.length;
        System.out.printf("El promedio es: %.2f\n", promedio);
        scanner.close();
    }
}
