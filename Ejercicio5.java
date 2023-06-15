package ejerciciosIfElse;
import java.util.Scanner;

/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio5 {

	/*	 
	 * EJERCICIO 5
	 * Ver si un número es par y múltiplo de 3 y que saque mensajes del tipo: Es par y múltiplo de 3
	 * Es impar y múltiplo de 3
	 * No es múltiplo de 3 pero es par 
	 * No es ni par ni múltiplo de 3
	 */
	public static void main(String[] args) {

		// Creo un objeto Scanner para poder guardar los valores que introduzca el usuario
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Introduce un número");
				
		int number = sc.nextInt();

		if (number % 2 == 0 && number % 3 == 0) {
			System.out.println("Es par y múltiplo de 3.");
		} else if (number % 2 != 0 && number % 3 == 0) {
			System.out.println("Es impar y múltiplo de 3");
		} else if (number % 3 != 0 && number % 2 == 0) {
			System.out.println("Es par y no es múltiplo de 3");
		} else if (number % 2 != 0 && number % 3 != 0) {
			System.out.println("No es par ni multiplo de 3");
		}
		
	}

}
