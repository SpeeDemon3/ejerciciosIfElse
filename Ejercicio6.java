package ejerciciosIfElse;
import java.util.Scanner;

/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio6 {

	/*
	 * EJERCICIO 6
	 * Se va a subir el sueldo a los empleados de la siguiente manera: Los que cobren < 15000 se les aumenta el 15%
	 * Los que cobren >= 15000 aumento del 12%
	 * además:
	 * Si son mujeres tienen un 2% adicional
	 * Si tienen hijos tienen un 1% adicional por hijo
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// Pido y guardo la informacion en variables
		System.out.println("Indica tu salario");
		double salary = sc.nextDouble();
		
		System.out.println("Indica tu genero pulsando:\n"
				+ "[1] - Hombre\n"
				+ "[2] - Mujer");
		
		int gender = sc.nextInt();
		
		System.out.println("Indica cuantos hijos tienes:");
		int children = sc.nextInt();
		
		// Creo una variable donde guardare el salario total despues de las comprobaciones
		double totalSalary = salary;
		
		// Compruebo todas las condiciones que pide el problema modificando el salario total en caso de ser necesario
		if (children > 0) {
			totalSalary = (totalSalary + ((0.01 / 100) * totalSalary)) * children; 
		}
		
		if (gender == 2) {
			totalSalary = totalSalary + ((0.02 / 100) * totalSalary); 
		} 
		
		if (salary < 15000) {
			totalSalary = totalSalary + ((0.15 / 100) * totalSalary); 
		} else {
			totalSalary = totalSalary + ((0.12 / 100) * totalSalary); 

		}
		
		System.out.println("Tu salario total es de " + totalSalary + "€.");
		
	}

}
