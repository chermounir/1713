package com.ipartek.estructuraSecuencial;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Escribe un programa Java que lee un n�mero entero por teclado y obtiene y
		// muestra por pantalla el doble y el triple de ese n�mero.
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce  un n�mero: ");
		numero = sc.nextInt();
		System.out.println("n�mero tecleado: " + numero);
		System.out.println("El doble de" + numero + " es: " + (numero * 2));
		System.out.println("El triple de" + numero + " es: " + (numero * 3));

	}

}
