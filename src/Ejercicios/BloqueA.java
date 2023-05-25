package Ejercicios;

import java.util.Scanner;

public class BloqueA {


	/*
	 * 1.1 Método que devuelva un número aleatorio entre dos pasados por argumentos
	 * del método.
	 */
	public int numeroAleatorio(int numeroIntroducido1,int numeroIntroducido2) {

		/* Creamos las variables */
		int numeroAleatorio;

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
			return numeroAleatorio;

		}
	}

	/*
	 * 1.2 Diseñe un método que imprima los datos de una persona ingresados por
	 * teclado e indicar si es mayor o menor de edad. El método recibe una clase
	 * Persona que tiene nombre y edad; crea la clase necesaria. Es mayor de edad si
	 * tiene 18 o más.
	 */

	/* Creando la clase Persona */
	class Persona {
		/* Creando atributos de persona */
		private String nombre;
		private int edad;

		/* Creando constructor de persona */
		public Persona(String nombre, int edad) {

			this.nombre = nombre;
			this.edad = edad;
		}

		/* getters and setters */

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		/* ToString */
		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
		}

	}
	
	public static void
}
