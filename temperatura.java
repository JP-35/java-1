package temperatura;

import java.util.Scanner;

public class temperatura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String grado;
        int temperatura;
        int ntemperatura;

        do {
            System.out.println("Ingrese desde que temperatura quiere realizar el cambio (F o C):");
            
            grado = scanner.next().toUpperCase();
            
        } while (!grado.equals("F") && !grado.equals("C"));

        System.out.println("Ahora ingrese el valor de la temperatura:");
        
        temperatura = scanner.nextInt();

        switch (grado) {
            case "F":
            	
                ntemperatura = (temperatura-32) * 5/9;
                
                System.out.println("La temperatura ingresada (" + temperatura + "°F) en °C es: " + ntemperatura + "°C");
                
                break;

            case "C":
                ntemperatura = (temperatura * 9/5)+32;
                
                System.out.println("La temperatura ingresada (" + temperatura + "°C) en °F es: " + ntemperatura + "°F");
                
                break;
        }

        scanner.close();
    }
}

