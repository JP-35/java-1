package primosdiv;

public class primosdiv {

	public static void main(String[] args) {
		//Escribir por consola los números del 50 al 100 de la siguiente manera si
		//es un numero primo escribir primo, sino escribir sus divisores

		for (int i=50; i<=100; i++) {
			
			int cuentadiv=0; 
			
			for (int j=1; j<=i; j++) {
				
				if(i % j == 0) { //contador de divisores
					cuentadiv++;
				}
			}
				
				if(cuentadiv==2) {
					System.out.println("\n"+i+"primo"+"\n");
				}
				
				for (int j=1; j<=i; j++) {
				if(2<cuentadiv) {
				if(i%j == 0) {
					System.out.println("\n"+j+"es divisor de"+i+"\n");
				}
				}
				}

		}
	}
}
