package com.ipartek.formacion.utilidades;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrdenarTest {

	@Test
	public void testBubbleShort() throws Exception {
		int [] aDesordenados= {3,2,1};
		int [] aResultado= {1,2,3}; 
		
		int[] aOrdenados= Ordenar.bubbleShort(aDesordenados);
		assertArrayEquals("Todos eguales",aResultado, aDesordenados);
		
		aDesordenados= new int[] {3,3,3};
		aResultado= new int [] {3,3,3}; 
		
		aOrdenados= Ordenar.bubbleShort(aDesordenados);
		assertArrayEquals("Todos eguales",aResultado, aDesordenados);
		
		aDesordenados= new int[] {3,0,-3};
		aResultado= new int [] {-3,0,3}; 
		
		aOrdenados= Ordenar.bubbleShort(aDesordenados);
		assertArrayEquals("Todos eguales",aResultado, aDesordenados);
		
		
	}
	
	@Test(expected = Exception.class)
	public void testBubbleShortNull() {
	}
	/*@Test
	public void arrayOrdenado() {
		int [] orden = Ordenar.ordenar();
		assertEquals("1",1, orden[0]);
		assertEquals("2",2, orden[1]);
		assertEquals("3",3, orden[2]);
		assertEquals("4",4, orden[3]);
		assertEquals("5",5, orden[4]);
		assertEquals("6",6, orden[5]);
		assertEquals("7",7, orden[6]);
		assertEquals("8",8, orden[7]);
		assertEquals("9",9, orden[8]);
		assertEquals("10",10, orden[9]);
	}*/

}
