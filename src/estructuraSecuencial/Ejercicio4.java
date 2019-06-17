package estructuraSecuencial;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Programa que lea una cantidad de grados centígrados y la pase a grados
		// Fahrenheit. La fórmula correspondiente es: F = 32 + ( 9 * C / 5)
		float gradosCentigrados;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una cantidad de grados centígrados");
		gradosCentigrados = sc.nextFloat();
		float gradosFahrenheit = 32 + (9 * gradosCentigrados / 5);
		System.out.println("la cantidad en grados Fahrenheit es:" + gradosFahrenheit);

	}

}
