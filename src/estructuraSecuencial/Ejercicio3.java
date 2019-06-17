package estructuraSecuencial;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Escribe un programa Java que lee un número entero por teclado y obtiene y
		// muestra por pantalla el doble y el triple de ese número.
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce  un nùmero: ");
		numero = sc.nextInt();
		System.out.println("nùmero tecleado: " + numero);
		System.out.println("El doble de" + numero + " es: " + (numero * 2));
		System.out.println("El triple de" + numero + " es: " + (numero * 3));

	}

}
