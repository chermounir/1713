package com.ipartek.estructuraSecuencial;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Programa que lee por teclado el valor del radio de una circunferencia y calcula 
		//y muestra por pantalla la longitud y el �rea de la circunferencia. 
		//Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2  

		
		float radio;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el valor del radio de una circunferencia:");
		radio=sc.nextFloat();
		double longitud = 2*Math.PI*radio;
		System.out.println("Longitud de la circunferencia es: "+ longitud);
		double area = Math.PI * Math.pow(radio, 2);

		System.out.println("El Area de la circunferencia es: "+ area);
		
		
	}

}
