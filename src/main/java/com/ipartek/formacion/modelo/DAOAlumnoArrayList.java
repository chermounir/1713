package com.ipartek.formacion.modelo;

import java.util.ArrayList;
import java.util.List;

import com.ipartek.formacion.Alumno;

public class DAOAlumnoArrayList implements IPersistible<Alumno> {

	private ArrayList<Alumno> lista;

	public DAOAlumnoArrayList() {
		super();
		lista = new ArrayList<Alumno>();
		lista.add(new Alumno(12, "Antton"));
		lista.add(new Alumno(45, "MAriJose"));
		lista.add(new Alumno(2, "Pepe"));
		lista.add(new Alumno(44, "Txeila"));
	}

	@Override
	public List<Alumno> getAll() {
		return lista;
	}

	@Override
	public Alumno getById(int id) {
		Alumno resul = null;
		for (Alumno a : lista) {

			if (a.getId() == id) {
				resul = a;
				break;
			}
		}
		return resul;
	}

	@Override
	public boolean insert(Alumno pojo) {
		boolean resul = false;

		if (lista.add(pojo)) {
			resul = true;
		}
		return resul;

	}

	@Override
	public boolean delete(int id) {

		boolean resul = false;

		for (Alumno a : lista) {

			if (a.getId() == id) {

				lista.remove(a);
				resul = true;

				break;
			}
		}
		return resul;

	}

	@Override
	public boolean update(Alumno pojo) {

		boolean resul = false;
		int cont = 0;

		for (Alumno a : lista) {

			if (a.getId() == pojo.getId()) {

				lista.remove(a);

				lista.add(cont, pojo);
				resul = true;

				break;
			}
			cont++;
		}
		return resul;

	}

}
