package com.ipartek.examen;

import java.util.Scanner;

public class Ejercicio1 {

	final static int PESO_MOSCA = 52;
	final static int PESO_PLUMA = 57;
	final static int PESO_LIGERO = 65;
	final static int PESO_MEDINAO = 90;
	final static int MAX_BOXEADORES = 30;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			for (int i = 0; i < MAX_BOXEADORES; i++) {
				System.out.println("Introduce el peso del boxeador en kilgramos: ");

				int peso = Integer.parseInt(sc.nextLine());

				if (peso <= 0) {
					throw new Exception("Peso incorrecto, debe ser >0");

				}
				if (peso > PESO_MEDINAO) {
					System.out.println("Pesado");
				} else if (peso >= PESO_LIGERO && peso <= PESO_MEDINAO) {
					System.out.println("Mediano");
				} else if (peso > PESO_PLUMA && peso < PESO_LIGERO) {
					System.out.println("Lìgero");
				} else if (peso >= PESO_MOSCA && peso <= PESO_PLUMA) {
					System.out.println("Pluma");
				} else {
					System.out.println("Mosca");
				}
			}
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Ha introducido datos sin el formato indicado o fuera del rango");
		}
		sc.close();

	}

}
