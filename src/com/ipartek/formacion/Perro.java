package com.ipartek.formacion;

public class Perro {
//atributos
	
	private String nombre;
	private String raza;
	private int edad;
	private boolean vacunado;
	
	//constructores

	public Perro() {
		super();
		nombre="sin nombre";
		raza="Cruce";
		edad=0;
		vacunado=false;
	}
	public Perro(String nombre) {
		
		nombre="sin nombre";
		//raza="Cruce";
		//edad=0;
		//vacunado=false;
	}
   // getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}
/**
 * setteamos la edad del perro, en caso de ser <0 ponemos un 0 
 * @param edad
 * @throws Exception 
 */
	public void setEdad(int edad) throws Exception {
		if (edad < 0) {
			//this.edad = 0;
          throw new PerroException(PerroException.ERROR_EDAD);
		} else {
			this.edad = edad;
		}

	}

	public boolean isVacunado() {
		return vacunado;
	}

	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", vacunado=" + vacunado + "]";
	}

}
