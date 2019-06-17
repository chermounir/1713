package com.ipartek.examen;

import java.util.Scanner;

public class Ejercicio4 extends Tren {

	public Ejercicio4(String tipo, String referencia, int asientosOcupados, int aniosActivo) {
		super(tipo, referencia, asientosOcupados, aniosActivo);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el Tipo: ");
		String tipo = sc.nextLine();
		System.out.println("Introduce la Referencia: ");
		String referencia = sc.nextLine();
		System.out.println("Introduce los AsientosOcupados: ");
		int asientosOcupados = sc.nextInt();
		System.out.println("Introduce los AñosActivo: ");
		int aniosActivo = sc.nextInt();

		Tren tren = new Tren(tipo, referencia, asientosOcupados, aniosActivo);

		System.out.println("Los datos indentificativos:" + tren.toString());

		tren.trenLleno(tren.getAsientosOcupados());

		tren.demasiadoViejo(tren.getAniosActivo());
	}

}
