package com.ipartek.formacion.colecciones;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.formacion.Person;

public class Aula2 {

	static ArrayList<Person> alumnos = new ArrayList<Person>();
	static Scanner sc = new Scanner(System.in);

	static void listarAlumnos() {
		for (int i = 0; i < alumnos.size(); i++) {
			System.out.println(i + " " + alumnos.get(i).getNombre());
		} // end for
	}

	static void crearAlumnos() {//"Mounir", 23, 175.0f, 50.5f, "Marrones", 'H')
		System.out.println("introduce nombre");
		String nombre = sc.nextLine();
		System.out.println("introduce nombre");
	}

	public static void main(String[] args) {

		System.out.println("1) Listar Alumnos");
		System.out.println("2) Crear Alumno");
		System.out.println("3) Eliminar Alumno");
		System.out.println("4) Buscar voluntario");

		int numero = Integer.parseInt(sc.nextLine());
		switch (numero) {
		// listar alumnos
		case 1:
			listarAlumnos();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		}

		// alumnos.add(new Person("Mounir", 23, 175.0f, 50.5f, "Marrones", 'H'));

	}
}
