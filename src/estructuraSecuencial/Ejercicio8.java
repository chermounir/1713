package estructuraSecuencial;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Programa que calcula el volumen de una esfera.
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el valor del radio la esfera: ");
		String sRadio = sc.nextLine();
		int radio = Integer.parseInt(sRadio);
		double volumen = (4 / 3) * Math.PI * Math.pow(radio, 3);
		System.out.println("El volumen de una esfera es: " + volumen);

	}

}
