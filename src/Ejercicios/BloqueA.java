package Ejercicios;

import java.util.Scanner;

public class BloqueA {

	/*
	 * 1.1 Método que devuelva un número aleatorio entre dos pasados por argumentos
	 * del método.
	 */
	public static void numeroAleatorio() {
		Scanner teclado = new Scanner(System.in);

		/* Creamos las variables */
		int numeroIntroducido1, numeroIntroducido2;
		int numeroAleatorio;

		/* Pedimos los números por teclado */
		System.out.println("Introduceme un número: ");
		numeroIntroducido1 = Integer.parseInt(teclado.nextLine());

		System.out.println("Introduceme otro número: ");
		numeroIntroducido2 = Integer.parseInt(teclado.nextLine());

		/* Creamos un bucle para facilitar el método */
		for (int i = 0; i < 1; i++) {
			/*
			 * Colocamos un random en numeroAleatorio que elija dos números y posteriormente
			 * creamos un switch.
			 */
			numeroAleatorio = (int) (Math.random() * (3 - 1) + 1);
			switch (numeroAleatorio) {
			case 1:
				numeroAleatorio = numeroIntroducido1;
				break;
			case 2:
				numeroAleatorio = numeroIntroducido2;
				break;
			}
			System.out.println("El número elegido es: " + numeroAleatorio);

		}
	}
}
