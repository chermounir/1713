package com.ipartek.formacion.utilidades;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void sumar() {
		//fail("Not yet implemented");
		//assertTrue(2==2);
		int resultado = Calculadora.sumar(2, 3);
		//assertEquals(5, resultado);
		assertEquals("no suma bien", 6, resultado);
	}
	
	@Test
	public void restar() {
		//fail("Not yet implemented");
		assertEquals(0, Calculadora.restar(2, 2));
		assertEquals(-1, Calculadora.restar(2, 3));
		assertEquals(1, Calculadora.restar(3, 2));
	}
	@Test
	public void multiplicar() {

		assertEquals(4, Calculadora.multiplicar(2, 2));
		assertEquals(0, Calculadora.multiplicar(0, 2));
		assertEquals(0, Calculadora.multiplicar(2, 0));
		assertEquals(-4, Calculadora.multiplicar(2, -2));
	}

	@Test(expected = ArithmeticException.class)
	public void dividir() {

		assertEquals(0, Calculadora.multiplicar(0, 2));

		assertEquals(5, Calculadora.multiplicar(10, 2));

		assertEquals(-5, Calculadora.multiplicar(10, -2));
 
		Calculadora.dividir(2, 0);
	}
	
	
	
}
