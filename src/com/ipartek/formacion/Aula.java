package com.ipartek.formacion;

public class Aula {

	public static void main(String[] args) {

		// declarar array con nombre alumnos
		String[] alumnos = { 
				"Ander", 
				"Mounir", 
				"Andonio", 
				"Asier", 
				"Jon C", 
				"Arkaitz", 
				"Aritz", 
				"Manuel", 
				"Eduardo", 
				"Eder I", 
				"Eder S", 
				"Gaizka", 
				"Borja", 
				"Veronica", 
				"Jon A", 
				"Jose Luis"
				};
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println(i + " " + alumnos[i]);
		} // end for
			// generar numero aleatorio
		int numero = (int) (Math.random() * alumnos.length);

		for (int i = 0; i < alumnos.length; i++) {
			if (numero != i) {
				System.out.println(i + " " + alumnos[i]);

			} else {
				System.out.println("***" + alumnos[i]);
			}

		} // end for
			// mostrar voluntario para leer
		System.out.println(alumnos[numero]);

	}

}
