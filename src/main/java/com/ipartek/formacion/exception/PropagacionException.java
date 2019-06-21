package com.ipartek.formacion.exception;

import com.ipartek.formacion.Perro;

public class PropagacionException {

	public static void main(String[] args) throws Exception {
		System.out.println("Comienza metodo Main");
		metodoA();
		System.out.println("Termina metodo Main");
 
		
 
	}

	private static void metodoB() {
		System.out.println("Comienza metodo B");
		System.out.println("Termina metodo B");
		
	}

	private static void metodoA() throws Exception {
		System.out.println("Comienza metodo A");
		Perro p =new Perro();
		p.setEdad(-1);
		//metodoB();
		System.out.println(p);
		System.out.println("Termina metodo A");
		
	}

 

}
