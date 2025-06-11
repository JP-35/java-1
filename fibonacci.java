package fibonacci;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Introduce un num: ");
        
        int num = scanner.nextInt();

        int a = 0, b = 1;
        
        for (int i=0; i<=num;i++) {
            System.out.print(a);
            if (i<=num-1) {
                System.out.print(", ");
            }
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
        scanner.close();
    }

	}

