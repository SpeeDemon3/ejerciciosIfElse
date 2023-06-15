package ejerciciosIfElse;
import java.util.Scanner;

/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio3 {

	/*EJERCICIO 3
	 * Comparar tres números y decir cuál es el mayor
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
		
		// Pido el tercer valor
		System.out.println("Introduce el tercer número.");
		// Guardo el valor
		int number3 = sc.nextInt();
		
		// Invoco al metodo
		getTheHighest(number1, number2, number3);
				
		
	}
	
	/**
	 * Metodo para averiguar cual de los 3 valores pasados por parametro es mayor
	 * @param num1 -> valor de tipo int
	 * @param num2 -> valor de tipo int
	 * @param num3 -> valor de tipo int
	 * @return -> el valor de tipo int de mayor valor
	 */
	public static int getTheHighest(int num1, int num2, int num3) {
		// Si num1 es mayor a num2 Y num1 es mayor num3
		if (num1 > num2 && num1 > num3) { 
			System.out.println("El número mayor es: " + num1);
			return num1;
		// Si num2 es mayor a num1 Y num2 es mayor num3
		} else if (num2 > num1 && num2 > num3){
			System.out.println("El número mayor es: " + num2);
			return num2;
		// Si num3 es mayor a num2 Y num1 es mayor num3
		} else {
			System.out.println("El número mayor es: " + num3);
			return num3;
		}
		
	}
	

}
