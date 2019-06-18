package com.ipartek.formacion.colecciones;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.junit.Test;

public class ArrayListTest {
	@Test
	public void test() {

// String[] paises =new String[3];

		ArrayList<String> paises = new ArrayList<String>();

		paises.add("Barakaldo");
		paises.add("EEUU");
		paises.add("Korea la buena");

		assertFalse(paises.isEmpty());
		// lengh and size
		assertEquals(3, paises.size());

		// insertar kaula lumpur entre barakaldo y eeuu
		paises.add(1, "Kaula lumpur");

		assertEquals("Barakaldo", paises.get(0));
		assertEquals("Kaula lumpur", paises.get(1));
		assertEquals("EEUU", paises.get(2));
		// insertar "barakaldo de nuevo para comprobar que se puede repitir

		paises.add("Barakaldo");

		assertEquals(5, paises.size());

		int cont = 0;
		Iterator<String> it = paises.iterator();

		while (it.hasNext()) {
			String pais = it.next();
			if ("Barakaldo".equals(pais)) {
				cont++;
			}
		}

		assertEquals(2, cont);

		// probar a elemenar korea la bena
		assertTrue(paises.remove("Korea la buena"));
		assertFalse(paises.remove("Korea la buena"));

		// probar a eleminar todo

		paises.clear();

		assertTrue(paises.isEmpty());

		// usar contains para saber si existe barakaldo y korea la buena

		assertFalse(paises.contains("Barakaldo"));
		assertFalse(paises.contains("Korea la buena"));

		// todo mirar como ordenar alfabeticamente

		Collections.sort(paises);

		assertEquals("Barakaldo", paises.get(0));
		assertEquals("EEUU", paises.get(1));
		assertEquals("Korea la buena", paises.get(2));

		Collections.reverse(paises);

		assertEquals("Barakaldo", paises.get(0));
		assertEquals("EEUU", paises.get(1));
		assertEquals("Korea la buena", paises.get(2));

	}

}
