package com.ipartek.examen;

public class Tren {
	
	static final int CAPACIDAD_MAXIMA = 400;
	static final int EDAD_MAXIMA = 40;
	
	private String tipo;
	private String referencia;
	private int asientosOcupados;
	private int anyosActivo;
	
	
	public Tren(String tipo, String referencia, int asientosOcupados, int anyosActivo) {
		super();
		this.tipo = tipo;
		this.referencia = referencia;
		this.asientosOcupados = asientosOcupados;
		this.anyosActivo = anyosActivo;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getReferencia() {
		return referencia;
	}


	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}


	public int getAsientosOcupados() {
		return asientosOcupados;
	}


	public void setAsientosOcupados(int asientosOcupados) {
		this.asientosOcupados = asientosOcupados;
	}


	public int getAnyosActivo() {
		return anyosActivo;
	}


	public void setAnyosActivo(int anyosActivo) {
		this.anyosActivo = anyosActivo;
	}


	
	public String mostrarDatos() {
		return "Tren [tipo=" + tipo + ", referencia=" + referencia + ", asientosOcupados=" + asientosOcupados
				+ ", anyosActivo=" + anyosActivo + "]";
	}
	
	/**
	 * Lorem Ipsum
	 * 
	 * @see CAPACIDAD_MAXIMA
	 * @return
	 */
	public boolean estaLleno() {
		
		boolean resul = false;
		
		if ( this.asientosOcupados >= CAPACIDAD_MAXIMA ) {
			resul = true;
		}
		return resul;
	}
	
	
	
	public boolean esViejo() {
		
		boolean resul = false;
		
		if ( this.anyosActivo >= EDAD_MAXIMA ) {
			resul = true;
		}
		return resul;
	}
	
	
}
