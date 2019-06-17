package com.ipartek.examen;

import java.util.Scanner;

public class Ejercicio3 {
	static int[] datos = new int[10];
	static int multi7 = 0;
	static double total = 0;
	static float resto = 0;

	public static void main(String[] args) {

		for (int i = 0; i < datos.length; i++) {

			Scanner sc = new Scanner(System.in);

			System.out.println("Teclea un numero entero");

			datos[i] = sc.nextInt();

			resto = datos[i] % 7;

			if (resto == 0) {

				multi7++;

			}
			total = total + datos[i];

		}
		double round = Math.round((total / 7) * 100.0) / 100.0;

		System.out.println("hay " + multi7 + " multiplos de 7");

		System.out.println("la media aritmètica de los valores del array es :" + round);

	}

}
