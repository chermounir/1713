package com.ipartek.estructuraSecuencial;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Programa Java que lea un nombre y muestre por pantalla: �Buenos dias
		// nombre_introducido�

		String nombre;
		Scanner sc = new Scanner(System.in);
		System.out.println("Teclea un nombre:");
		nombre = sc.nextLine();
		System.out.println("�Buenos dias " + nombre + "�");
	}

}
