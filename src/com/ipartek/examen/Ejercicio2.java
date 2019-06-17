package com.ipartek.examen;

import java.util.Scanner;

public class Ejercicio2 {

	static boolean bool;
	static int num;

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

		num = sc.nextInt();

		if (ganar(num)) {
			System.out.println("Puedes ganar el Campeonato");

		} else {
			System.out.println("Ponte las pilas si quieres ganar");
		}

	}

}
