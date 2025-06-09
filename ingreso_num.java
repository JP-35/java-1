package ingreso_num;


import java.util.Scanner;
public class ingreso_num {
	
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	int num;
	int cantdiv;
	
	do{
	    
	    cantdiv=0;
	    
	    System.out.println("ingrese un num mayor a 100 y que sea primo:");
	    
	    num = scanner.nextInt();
	    
	    for(int i=1;i<=num;i++) {
	    	if(num%i==0) {
	    	cantdiv++;
	    	}
	    }
	    
	    if(num<=100 || cantdiv!=2){
	        System.out.println("el ingreso del num es incorrecto, siga intentando");
	    }
	} while (num<=100 || cantdiv!=2);
	    
	    scanner.close();
	    
	    System.out.println("el ingreso es correcto");
	    
	}
}

