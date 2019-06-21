package com.ipartek.formacion;


import java.util.List;
import java.util.Scanner;

import com.ipartek.formacion.Alumno;
import com.ipartek.formacion.modelo.DAOAlumnoArrayList;

public class Voluntarios {
	static boolean bool = true;

	static final int OPCION_SALIR = 0;
	static final int OPCION_LISTAR = 1;
	static final int OPCION_CREAR = 2;
	static final int OPCION_ELIMINAR = 3;
	static final int OPCION_BUSCAR = 4;
	static final int OPCION_CAMBIAR = 5;

	static DAOAlumnoArrayList dao = new DAOAlumnoArrayList();

	static Scanner sc = new Scanner(System.in);
	static int numero;

	static void pintarMenu() {
		System.out.println("	----------------------------------");
		System.out.println("	0) Salir");
		System.out.println("	1) Listar Alumnos");
		System.out.println("	2) Crear Alumno");
		System.out.println("	3) Eliminar Alumno");
		System.out.println("	4) Buscar voluntario");
		System.out.println("	5) Cambiar datos de un Alumno");
		System.out.println("	----------------------------------");
	}

	static void listarAlumnos() {

		List<Alumno> alumnos = dao.getAll();
		for (Alumno alumno : alumnos) {
			System.out.println("id: " + alumno.getId() + " ,nombre: " + alumno.getNombre());

		}
		System.out.println("");
	}

	static void crearAlumno() {
		try {

			// pedir datos por consola
			System.out.println("introduce nombre");
			String nombre = sc.nextLine();

			System.out.println("introduce id");
			int id = Integer.parseInt(sc.nextLine());

			// persistir a traves del dao
			if (dao.insert(new Alumno(id, nombre))) {
				System.out.println("alumno insertado");
			} else {
				System.out.println("***error al insertar***");
			}
		} catch (Exception e) {
			System.out.println("datos incorrectos");
		}
	}

	static void eliminarAlumno() {
		try {

			System.out.println("introduce el id del alumno ");
			int id = Integer.parseInt(sc.nextLine());

			if (dao.delete(id)) {
				System.out.println("alumno borrado");
			} else {
				System.out.println("no se ha podid borrar el alumno");
			}
		} catch (Exception e) {
			System.out.println("***error al borrar***" + e.getMessage());
		}

	}

	static void buscarVoluntario() {
		List<Alumno> alumnos = dao.getAll();
		for (Alumno alumno : alumnos) {
			System.out.println("id: " + alumno.getId() + " ,nombre: " + alumno.getNombre());

		}

		int numero = (int) (Math.random() * alumnos.size());

		System.out.println("El voluntario es : " + alumnos.get(numero).getNombre());

		int num = alumnos.get(numero).getNumVecesLeer();
		alumnos.get(numero).setNumVecesLeer(num);

	}

	static void cambiarDatosAlumno() {
		try {

			// pedir datos por consola
			System.out.println("introduce nombre");
			String nombre = sc.nextLine();

			System.out.println("introduce id");
			int id = Integer.parseInt(sc.nextLine());

			// persistir a traves del dao
			if (dao.update(new Alumno(id, nombre))) {
				System.out.println("alumno cambiado");
			} else {
				System.out.println("***error al cambiar***");
			}
		} catch (Exception e) {
			System.out.println("datos incorrectos");
		}

	}

	public static void main(String[] args) {

		while (bool) {
			pintarMenu();
			try {
				numero = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("*** opcion no posible***");
			}

			switch (numero) {
			case OPCION_SALIR:
				bool = false;
				break;
			// listar alumnos
			case OPCION_LISTAR:
				listarAlumnos();
				break;
			case OPCION_CREAR:
				crearAlumno();
				break;
			case OPCION_ELIMINAR:
				eliminarAlumno();
				break;
			case OPCION_BUSCAR:
				buscarVoluntario();
				break;
			case OPCION_CAMBIAR:
				cambiarDatosAlumno();
				break;
			}

		}

	}

}
