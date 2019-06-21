package com.ipartek.formacion;
/*
 * excepcion personalizada para el pojoo de Perro
 * 
 */
public class PersonException extends Exception{
	private static final long serialVersionUID =1;
 public static final String ERROR_ARRAY = "se ha salido fuera del Array";
 public PersonException(String error) {
	 super();
 }
}
 