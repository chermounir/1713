package com.ipartek.formacion;

import java.util.ArrayList;

public class Aula {

	public static void main(String[] args) {


		ArrayList<Person> alumnos = new ArrayList<Person>();


		alumnos.add(new Person("Mounir", 23, 175.0f, 50.5f, "Marrones", 'H'));
		alumnos.add(new Person("Andonio", 24, 174.0f, 51.0f, "Verdes", 'H'));
		alumnos.add(new Person("Asier", 25, 173.0f, 52.5f, "Marrones", 'H'));
		alumnos.add(new Person("Jon C", 26, 172.0f, 53.0f, "negros", 'H'));
		alumnos.add(new Person("Arkaitz", 27, 172.0f, 54.5f, "Marrones", 'H'));
		alumnos.add(new Person("Aritz", 28, 171.0f, 55.0f, "Verdes", 'H'));
		alumnos.add(new Person("Manuel", 29, 175.0f, 56.5f, "Marrones", 'H'));
		alumnos.add(new Person("Eduardo", 23, 174.0f, 57.0f, "negros", 'H'));
		alumnos.add(new Person("Eder I", 24, 173.0f, 58.5f, "Verdes", 'H'));
		alumnos.add(new Person("Eder S", 25, 172.0f, 59.0f, "Marrones", 'H'));
		alumnos.add(new Person("Gaizka", 26, 171.0f, 51.5f, "negros", 'H'));
		alumnos.add(new Person("Borja", 27, 176.0f, 52.0f, "Marrones", 'H'));
		alumnos.add(new Person("Veronica", 23, 175.0f, 53.5f, "negros", 'M'));
		alumnos.add(new Person("Jon A", 28, 173.0f, 54.0f, "Verdes", 'H'));
		alumnos.add(new Person("Jose Luis", 23, 171.0f, 50.5f, "Marrones", 'H'));

		//listar los alumnos
		
		for (int i = 0; i < alumnos.size(); i++) {
			System.out.println(i + " " + alumnos.get(i).getNombre());
		} // end for

		int numero = (int) (Math.random() * alumnos.size());


		System.out.println("El voluntario es : " + alumnos.get(numero).getNombre());

	}

}
