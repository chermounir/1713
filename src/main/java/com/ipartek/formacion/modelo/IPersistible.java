package com.ipartek.formacion.modelo;

import java.util.List;

/**
 * Operaciones basica de CRUD para Pojos
 * 
 * @author Curso
 * @param <P>
 *
 */
public interface IPersistible<P> {

	/**
	 * listado de P
	 * @return lista de P , si no hay datos lista inicializada
	 */
	
	List<P> getAll();
/**
 * recuera P por su identificador
 * @param id int identificador
 * @return P , si no existe null
 */
	P getById(int id);
/**
 * crear un nuevo registro
 * @param pojo
 * @return true si inserta , false en caso contrario
 */
	boolean insert(P pojo);
	/**
	 * elimina un  registro
	 * @param pojo
	 * @return true si elimina , false en caso contrario
	 */
	boolean delete(int id);
	/**
	 * modifica un  registro
	 * @param pojo
	 * @return true si modifica , false en caso contrario
	 */
	boolean update(P pojo);

}
