package com.ipartek.formacion;

public class CapturarTiposExcepciones {

	public static void main(String[] args) {
		try {
			// Perro p= null;
			Perro p = new Perro();
			p.setEdad(-3);
			p.toString();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("se has salido fuera del Array");
		} catch (PerroException e) {
			System.out.println("PerroExcepcion Null");
		} catch (NullPointerException e) {
			System.out.println("Excepcion Null");
		} catch (Exception e) {
			System.out.println("Excepcion Generica, siempre la ultima");
			e.printStackTrace();
		}

	}

}
