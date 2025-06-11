package tabla_mult;


import java.util.Scanner;	
public class tabla_mult {


	public static void main(String[] args) {
		
		int num;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ingrese un numero del 1 al 10 del cual quiera conocer su tabla de multiplicar ");
		
		do {
			num = scanner.nextInt();
			
			if (num<0 || num>10) {
				System.out.println("el numero no esta dentro del rango permitido");
			}
		} while (num<0 || num>10);
		
		scanner.close();
		
		for (int i=1;i<=10;i++) {
			System.out.println(i+"*"+num+"="+i*num);
		}
		
	}

}
