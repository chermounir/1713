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

	List<P> getAll();

	P getById(int id);

	boolean insert(P pojo);

	boolean delete(int id);

	boolean update(P pojo);

}
