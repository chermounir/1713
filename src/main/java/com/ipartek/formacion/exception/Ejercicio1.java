package com.ipartek.formacion.exception;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		System.out.println("Comienza programa");
		System.out.println("Por favor introduce el primer numero del 0 al 9");
		boolean bool1 = true;
		boolean bool2 = true;
		int numero = 0;
		int numero2 = 0;
		while (bool1) {

			Scanner sc = new Scanner(System.in);

			try {
				numero = Integer.parseInt(sc.nextLine());// usar siempre nextLine() y no nexChar o nextInt
				bool1 = false;
			} catch (Exception e) {
				System.out.println("***Por favor introduce el primer numero del 0 al 9**");
			}

		}
		System.out.println("Por favor introduce el segundo numero del 0 al 9");
		Scanner sc2 = new Scanner(System.in);
		while (bool2) {

			try {
				numero2 = Integer.parseInt(sc2.nextLine());// usar siempre nextLine() y no nexChar o nextInt
				bool2 = false;
			} catch (Exception e) {
				System.out.println("***Por favor introduce el segundo numero del 0 al 9**");
			}

		}

		System.out.println("la suma del numero 1 y 2 es:" + (numero + numero2));
	}
}
