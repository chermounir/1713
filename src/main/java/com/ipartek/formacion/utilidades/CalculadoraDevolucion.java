package com.ipartek.formacion.utilidades;

import com.ipartek.formacion.Employee;

public class CalculadoraDevolucion {

	public static final float[] BILLETES_MONEDAS = {
			// billets
			500, 200, 100, 50, 20, 10, 5,
			// monedas
			2, 1, 0.50f, 0.20f, 0.10f, 0.05f, 0.02f, 0.01f };

	/**
	 * calcula las vueltas optimas para retornar el menor numero de billetes y
	 * monedas
	 * 
	 * @param importe   float costo del articulo a comprar
	 * @param entegrado float dinero entrega para comprar
	 * @return int[] cantidad de billetes y monedas retorndas
	 * @throws Exception 
	 * @see public static final float[] BILLETES_MONEDAS
	 * @throws eXCEPCTION importe > entregado o si importe <0 o entregado <0
	 */

	public static int[] vueltas(float importe, float entegrado) throws Exception {
		int[] monedasRetorndas = new int[15];
		float resto = entegrado - importe;

		if (importe < 0) {
			throw new Exception("importe negativo");
		} else if (entegrado < 0) {
			throw new Exception("entregado negativo");
		} else if (entegrado < importe) {
			throw new Exception("entrgado es menor que el importe");
		} else {
			for (int i = 0; i < BILLETES_MONEDAS.length; i++) {
				// if (resto > 0) {
				int num = (int) (resto / BILLETES_MONEDAS[i]);
				monedasRetorndas[i] = num;
				resto = resto - num * BILLETES_MONEDAS[i];
				//redondear a 2 deximales, porque los float pierden
				//resto = Math.round(resto*100.0f)/100.0f;
				// }

			}
		}
		return monedasRetorndas;

	}
}
