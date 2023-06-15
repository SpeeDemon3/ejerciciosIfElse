package ejerciciosIfElse;
import java.util.Scanner;

/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio1 {

	/*
	 * EJERCICIO 1
	 * Devolver si un numero es par o impar
	 */
	
	public static void main(String[] args) {

		// Creo un objeto Scanner para poder guardar los valores que introduzca el usuario
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		
		int number = sc.nextInt();
		
		if (number % 2 == 0) {
			System.out.println("El número " + number + " es un número par.");
		} else {
			System.out.println("El número " + number + " es un número impar.");
		}
		
		sc.close();
	}

}
