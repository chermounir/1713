package com.ipartek.examen;

import java.util.Scanner;

public class Ejercicio2 {

	static boolean bool;
	static int num;

/**
 * funcion que calcula si el jugador tiene posibilidades de ganar
 * @param puntos int puntos de la clasificacion
 * @return true si puntos >= else false
 */
	private static boolean ganar(int num) {
		if (num >= 70) {
			bool = true;
		} else {
			bool = false;
		}

		return bool;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("teclea los puntos obtenidos:");

		num = Integer.parseInt(sc.nextLine());

		if (ganar(num)) {
			System.out.println("Puedes ganar el Campeonato");

		} else {
			System.out.println("Ponte las pilas si quieres ganar");
		}
		sc.close();

	}

}
