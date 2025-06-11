package contrasena;

import java.util.Scanner;
import java.util.Random;

public class contrasena {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Longitud de la contraseña: ");
        
        int longitud = scanner.nextInt();

        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        String numeros = "0123456789";
        
        String caracteres = minusculas + mayusculas + numeros;

        Random random = new Random();
        StringBuilder contrasena = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int idx = random.nextInt(caracteres.length());
            contrasena.append(caracteres.charAt(idx));
        }
        System.out.println("Contraseña generada: " + contrasena);
        scanner.close();
    }
}