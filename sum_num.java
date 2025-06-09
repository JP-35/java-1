package sum_num;

import java.util.Scanner;

public class sum_num {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num;
		int pares=0;
		int impares=0;
		
		System.out.println("ingrese un num");
		
		num = scanner.nextInt();
		
		for(int i=1;i<num;i++) {
			if(i%2==0) {
				pares+=i;
			}
			else {
				impares+=i;
			}
		}
		
		scanner.close();
		
		System.out.println("la suma de todos lo num impares previos al numero seleccionado es igual a:"+ impares+"\n");
		System.out.println("la suma de todos lo num pares previos al numero seleccionado es igual a:"+ pares+"\n");
	}

}
