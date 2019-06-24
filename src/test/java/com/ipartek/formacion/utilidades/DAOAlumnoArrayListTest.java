package com.ipartek.formacion.utilidades;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ipartek.formacion.Alumno;
import com.ipartek.formacion.modelo.DAOAlumnoSeriablizable;

public class DAOAlumnoArrayListTest {
	
	static DAOAlumnoSeriablizable dao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		dao = DAOAlumnoSeriablizable.getInstance();
	}

	@After
	public void tearDown() throws Exception {
		
		//TODO lunes
		//borrar objetos de la lista
		/*
		for (int i = 0; i < dao.getAll().size(); i++) {
			
			dao.delete( dao.getById(i).getId() );
		
		*/
		dao = null;
		System.out.println("");
	}

	@Test
	public void testGetInstance() {

		assertNotNull(dao);
		
	}

	@Test
	public void testGetAll() {
		
		assertEquals( 4, dao.getAll().size() );
		
		dao.insert( new Alumno(1,""));
		dao.insert( new Alumno(2,""));
		
		assertEquals( 6, dao.getAll().size() );
	}

	@Test
	public void testGetById() {
		
		Alumno alumno = new Alumno(1,"");
		dao.insert( alumno );		
		assertEquals( alumno , dao.getById(1) );
		
		assertNull( dao.getById(-1) );
		
	}

	@Test
	public void testInsert() {
		
		Alumno alumno = new Alumno(1,"");
		assertTrue( dao.insert( alumno ) );
		
		assertFalse( dao.insert( null ) ); 
		
	}

	@Test
	public void testDelete() {
		
		assertFalse( dao.delete(1) );
		
		Alumno alumno = new Alumno(1,"");
		dao.insert( alumno );		
		assertTrue( dao.delete(1) );
		
	}

	@Test
	public void testUpdate() {
		
		Alumno alumno = new Alumno(1,"Manolo");
		dao.insert( alumno );
		
		alumno.setNombre("Manola");
		assertTrue ( dao.update(alumno) );
		assertEquals( "Manola" , dao.getById(1).getNombre() );
		
		
		
		assertFalse ( dao.update(null) );
		assertFalse ("No se puede modificar si no existe", dao.update( new Alumno(-1,"") ) );
	}

}