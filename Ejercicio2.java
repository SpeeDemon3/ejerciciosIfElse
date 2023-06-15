package ejerciciosIfElse;
import java.util.Scanner;

/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio2 {

	/*
	 * EJERCICIO 2
	 * Comparar dos números y decir cuál es el mayor
	 */
	
	public static void main(String[] args) {
		
		// Creo un objeto Scanner para poder guardar los valores que introduzca el usuario
		Scanner sc = new Scanner(System.in);
		// Pido el primer valor
		System.out.println("Introduce el primer número.");
		// Guardo el valor
		int number1 = sc.nextInt();
		
		// Pido el segundo valor
		System.out.println("Introduce el segundo número.");
		// Guardo el valor
		int number2 = sc.nextInt();
		
		if (number1 > number2) {
			System.out.println(number1 + " es mayor a " + number2);
		} else {
			System.out.println(number2 + " es mayor a " + number1);
		}
		
		sc.close();
	}
	
}
