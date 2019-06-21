package com.ipartek.estructuraSecuencial;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Programa que lea una cantidad de grados cent�grados y la pase a grados
		// Fahrenheit. La f�rmula correspondiente es: F = 32 + ( 9 * C / 5)
		float gradosCentigrados;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una cantidad de grados cent�grados");
		gradosCentigrados = sc.nextFloat();
		float gradosFahrenheit = 32 + (9 * gradosCentigrados / 5);
		System.out.println("la cantidad en grados Fahrenheit es:" + gradosFahrenheit);

	}

}
