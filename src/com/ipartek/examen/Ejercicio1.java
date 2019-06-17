package com.ipartek.examen;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			for (int i = 0; i < 30; i++) {
				System.out.println("Introduce un peso: ");

				int peso = sc.nextInt();
				if (peso > 90) {

					System.out.println("Pesado");

				} else if (peso >= 65 && peso <= 90) {

					System.out.println("Mediano");

				} else if (peso >= 58 && peso <= 64) {

					System.out.println("Lìgero");

				} else if (peso >= 52 && peso <= 57) {

					System.out.println("Pluma");

				} else {

					System.out.println("Mosca");
				}
			}
		} catch (Exception e) {
			System.out.println("Ha introducido datos sin el formato indicado o fuera del rango");
		}

	}

}
