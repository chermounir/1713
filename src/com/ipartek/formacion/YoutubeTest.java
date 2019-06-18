package com.ipartek.formacion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class YoutubeTest {

	Youtube youtube;
	static final String TITULO = "creando el mejor equipo";
	static final String CODIGO = "VAx4oo3i87c";
	static final String URL = "https://www.youtube.com/watch?v=";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		youtube = new Youtube(TITULO, CODIGO);
	}

	@After
	public void tearDown() throws Exception {
		youtube = null;
	}

	@Test
	public void testYoutube() {
		assertEquals(TITULO, youtube.getTitulo());
		assertEquals(CODIGO, youtube.getCodigo());
		assertEquals(0, youtube.getReproducciones());
		try {
			youtube = new Youtube(null, null);
			fail("Constructo con nulls");
		} catch (Exception e) {
			assertTrue(true);
		}

		try {
			youtube = new Youtube(TITULO, "aa");
			fail("codigo <> 11");
		} catch (Exception e) {
			assertTrue(true);
		}

		try {
			youtube = new Youtube(" ", CODIGO);
			fail("titulo incorrecto");
		} catch (Exception e) {
			assertTrue(true);
		}

	}

	@Test
	public void testGetTitulo() {
		assertEquals(TITULO, youtube.getTitulo());
	}

	@Test
	public void testSetTitulo() throws Exception {
		youtube.setTitulo("algo");
		assertEquals("algo", youtube.getTitulo());

		youtube.setTitulo(null);
		assertEquals(null, youtube.getTitulo());
	}

	@Test
	public void testGetCodigo() {
		assertEquals(CODIGO, youtube.getCodigo());
	}

	@Test
	public void testSetCodigo() throws Exception {
		youtube.setCodigo("VAx4oo3i87c");
		assertEquals("VAx4oo3i87c", youtube.getCodigo());

		youtube.setCodigo(null);
		assertNotEquals(null, youtube.getCodigo());

		youtube.setCodigo("VAx4oo3i8");
		assertNotEquals("VAx4oo3i8", youtube.getCodigo());
	}

	@Test
	public void testGetReproducciones() {
		assertEquals(0, youtube.getReproducciones());
	}

	@Test
	public void testSetReproducciones() {
		youtube.setReproducciones(15);
		assertEquals(15, youtube.getReproducciones());
	}

	@Ignore
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetUrl() {
		assertEquals(URL + CODIGO, youtube.getUrl());
	}

}
