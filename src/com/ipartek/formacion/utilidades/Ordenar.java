package com.ipartek.formacion.utilidades;

public class Ordenar {

	/**
	 * Ordenar de menor a mayor el array
	 * 
	 * @param aDesordenados int[] con numeros ordenados
	 * @return int[] ordenado de meno a mayor
	 * @throws Exception si aDesordenados==null
	 */
	public static int[] bubbleShort(int[] aDesordenados) throws Exception {
		if (aDesordenados == null) {
			throw new Exception("No puede ser null");
		}

		int[] resul = new int[aDesordenados.length];
		int aux = 0;
		for (int i = 0; i < resul.length; i++) {
			for (int j = 0; j < resul.length; j++) {
				if (aDesordenados[j - 1] > aDesordenados[j]) {
					aux = aDesordenados[j - 1];
					aDesordenados[j - 1] = aDesordenados[j];
					aDesordenados[j] = aux;

				}

			}

		}
		return aDesordenados;

	}
}
