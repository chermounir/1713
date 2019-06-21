package com.ipartek.estructuraSecuencial;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
		float velocidadKm;
		float velocidadM;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un velocidad en Km/h");
		velocidadKm=sc.nextFloat();
		velocidadM=velocidadKm * 1000/3600;
		System.out.println("La velocidad introducida en m/s es: "+velocidadM+ "m/s");
	}

}
