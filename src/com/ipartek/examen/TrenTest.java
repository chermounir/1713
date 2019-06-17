package com.ipartek.examen;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrenTest {

	@Test
	public void testTrenLleno() {
		Tren tren = new Tren(null, null, 390, 0);
		tren.trenLleno(tren.getAsientosOcupados());
		
		Tren tren1 = new Tren(null, null, 400, 0);
		tren1.trenLleno(tren1.getAsientosOcupados());
		
		Tren tren2 = new Tren(null, null, 401, 0);
		tren2.trenLleno(tren2.getAsientosOcupados());
		

	}
	
	@Test
	public void testDemasiadoViejo() {
		Tren tren3 = new Tren(null, null, 0, 39);
		tren3.trenLleno(tren3.getAsientosOcupados());
		
		Tren tren4 = new Tren(null, null, 0, 40);
		tren4.trenLleno(tren4.getAsientosOcupados());
		
		Tren tren5 = new Tren(null, null, 0, 41);
		tren5.trenLleno(tren5.getAsientosOcupados());
	}

}
