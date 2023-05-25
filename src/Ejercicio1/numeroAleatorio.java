package Ejercicio1;

import java.util.Scanner;

/*1.1 Método que devuelva un número aleatorio entre dos pasados por
argumentos del método.*/
public class numeroAleatorio {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		/*Creamos las variables*/
		int numeroIntroducido1,numeroIntroducido2;
		int numeroAleatorio;
		
		/*Pedimos los números por teclado*/
		System.out.println("Introduceme un número: ");
		numeroIntroducido1 = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Introduceme otro número: ");
		numeroIntroducido2 = Integer.parseInt(teclado.nextLine());
		
	}
}
