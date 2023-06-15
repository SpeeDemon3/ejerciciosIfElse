package ejerciciosIfElse;
import java.util.Scanner;

/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio4 {

	/*
	 * EJERCICIO 4
	 * Hallar una renta de C x r x t / 1200
	 * Si el tiempo es <=24 meses –> 5% Si el tiempo es <=60 meses –> 8% Si el tiempo es >60 meses –> 10%
	 */
	public static void main(String[] args) {

		// Creo un objeto Scanner para poder guardar los valores que introduzca el usuario
		Scanner sc = new Scanner(System.in);
		// Pido el primer valor
		System.out.println("Introduce el valor de c.");
		// Guardo el valor
		int c = sc.nextInt();
						
		// Pido el segundo valor
		System.out.println("Introduce el valor de r.");
		// Guardo el valor
		int r = sc.nextInt();
				
		// Pido el tercer valor
		System.out.println("Introduce el valor de t.");
		// Guardo el valor
		int t = sc.nextInt();
		
		
		// Guardo el valor total de la renta mediante la formula
		double rentValue = c * r * t / 1200;
		
		// Si t es menor o igual a 24
		if (t <= 24) {
			// Aplico la formula y guarlo el valor en la variable 
			rentValue = rentValue + ((0.05/100) * rentValue);
			System.out.println("El valor de ranta transcurridos " + t + " meses es:" + rentValue);
		} else if (t <= 60) {
			rentValue = rentValue + ((0.08 / 100) * rentValue);
			System.out.println("El valor de ranta transcurridos " + t + " meses es:" + rentValue);
		} else {
			rentValue = rentValue + ((0.10 / 100) * rentValue);
			System.out.println("El valor de ranta transcurridos " + t + " meses es:" + rentValue);

		}
		

		
		sc.close();
	}

}
