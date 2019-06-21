package com.ipartek.formacion;

import java.util.ArrayList;

public class Aula {

	public static void main(String[] args) {


		ArrayList<Person> alumnos = new ArrayList<Person>();


		alumnos.add(new Person("Mounir"));
		alumnos.add(new Person("Andonio"));
		alumnos.add(new Person("Asier"));
		alumnos.add(new Person("Jon C"));
		alumnos.add(new Person("Arkaitz"));
		alumnos.add(new Person("Aritz"));
		alumnos.add(new Person("Manuel"));
		alumnos.add(new Person("Eduardo"));
		alumnos.add(new Person("Eder I"));
		alumnos.add(new Person("Eder S"));
		alumnos.add(new Person("Gaizka"));
		alumnos.add(new Person("Borja"));
		alumnos.add(new Person("Veronica"));
		alumnos.add(new Person("Jon A"));
		alumnos.add(new Person("Jose Luis"));

		//listar los alumnos
		
		for (int i = 0; i < alumnos.size(); i++) {
			System.out.println(i + " " + alumnos.get(i).getNombre());
		} // end for

		int numero = (int) (Math.random() * alumnos.size());


		System.out.println("El voluntario es : " + alumnos.get(numero).getNombre());

	}

}
