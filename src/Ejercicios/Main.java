package Ejercicios;

/**
 * 
 * @author Alegarrup
 *
 *
 */
public class Main {
	

	public static void main(String[]args) {
		
		Persona personilla = new Persona("Ale", 19);
		System.out.println(BloqueA.mayor_o_menor(personilla));
		
		System.out.println("Numero Aleatorio");
		System.out.println(BloqueA.numeroAleatorio(10, 20));
	}
	
	
}
