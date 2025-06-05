package Primerproyecto;

public class probanding {

	public static void main(String[] args) {
		//Escribir por consola los números de del 1 al 100 de la siguiente forma
		//si el número es par, escribir par sino escribir el mismo número
		for (int i=1; i<=100;i+=1)	//bucle for para repetir la verificacion y la aparicion de los numeros en consola
		{
			int verificar=i%2;	//cuenta para verificar si el numero es par o impar
			if (verificar==0){	//si el resto del numero divido dos es 0 ocurre lo siguiente
			System.out.print(i+"par\n");	//se muestra en consola el num, que es par y se pone un enter
			}
			else {	//si el resto del num dividido dos no es cero ocurre lo siguiente
				System.out.print(i+"impar\n");	//se muestra en concsola el num, que es impar y se pone un enter
			}
		}
	}

}
