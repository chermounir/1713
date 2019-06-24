package com.ipartek.formacion.modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.ipartek.formacion.Alumno;

public class DAOAlumnoSeriablizable implements IPersistible<Alumno>, ISingleton<DAOAlumnoSeriablizable> {

	private static final String FILE_NAME = "alumnos.dat";
	
	private static DAOAlumnoSeriablizable INSTANCE;
	
	private ArrayList<Alumno> lista;
	
	@Override
	public DAOAlumnoSeriablizable getSingleton() {
		// TODO Auto-generated method stub
		return null;
	}
/**
 * encargado de devolver solo 1 objeto, patron singleton
 * @return
 */
	public static DAOAlumnoSeriablizable getInstance(){
		
	 if (INSTANCE == null) {
		 INSTANCE = new DAOAlumnoSeriablizable();
		
	}
	 return INSTANCE;
	}
	
	/**
	 * privado para que nadie pueda crear objetos
	 */
	private DAOAlumnoSeriablizable() {
		super();
		desSeralizarLista();
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
		if ( pojo != null ) {
			resul = lista.add(pojo);
		}
		return resul;

	}

	@Override
	public boolean delete(int id) {

		Alumno a = getById(id);	
		
		return lista.remove(a);

	}

	@Override
	public boolean update(Alumno pojo) {
		boolean resul = false; 
		
		if ( pojo != null ) {
		
			for (Alumno a: lista) {
				
				if ( a.getId() == pojo.getId() ) {
					//modificar
					int pos = lista.indexOf(a);
					lista.set( pos , pojo);
					resul = true;
					break;
				}
			}
		}	
		
		
		return resul;}

	private void serializarLista() {
		
		try( ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME)) ){
			oos.writeObject(lista);
			oos.flush();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private void desSeralizarLista() {
		
		try( ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME)) ){	
			
			lista =  (ArrayList<Alumno>) ois.readObject();
			
		}catch (Exception e) {
			// e.printStackTrace();   EOF
		}
	}
	

}
