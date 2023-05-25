package Ejercicios;

import java.util.Scanner;

public class BloqueA {

	/*
	 * 1.1 Método que devuelva un número aleatorio entre dos pasados por argumentos
	 * del método.
	 */
	public static int numeroAleatorio(int numeroIntroducido1, int numeroIntroducido2) {

		/* Creamos las variables */
		int numeroAleatorio;

		/* Hacemos el mathRandom para que de uno de esos dos valores */
		numeroAleatorio = (int) (Math.random() * (numeroIntroducido1 - numeroIntroducido2) + numeroIntroducido2);

		return numeroAleatorio;

	}

	/*
	 * 1.2 Diseñe un método que imprima los datos de una persona ingresados por
	 * teclado e indicar si es mayor o menor de edad. El método recibe una clase
	 * Persona que tiene nombre y edad; crea la clase necesaria. Es mayor de edad si
	 * tiene 18 o más.
	 */

	public static String mayor_o_menor(Persona unaPersona) {
		if (unaPersona.edad >= 18) {
			return "Es mayor de edad";
		} else {
			return "Es menor de edad";
		}
	}
}


/* Creando la clase Persona */
class Persona {
	/* Creando atributos de persona */
	String nombre;
	int edad;

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
