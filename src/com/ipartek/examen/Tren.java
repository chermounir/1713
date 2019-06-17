package com.ipartek.examen;

public class Tren {
//atributos
	private String tipo;
	private String referencia;
	private int asientosOcupados;
	private int aniosActivo;

//Constructor

	public Tren(String tipo, String referencia, int asientosOcupados, int aniosActivo) {
		super();
		this.tipo = tipo;
		this.referencia = referencia;
		this.asientosOcupados = asientosOcupados;
		this.aniosActivo = aniosActivo;
	}

// metodos

	public void trenLleno(int asientosOcupados) {
		if (asientosOcupados > 400) {
			System.out.println("Se han vendido màs billetes que plazas hay");
		}

	}

	public void demasiadoViejo(int aniosActivo) {

		if (aniosActivo >= 40) {
			System.out.println("FUERA DE CICULACION");
		} else {
			System.out.println("EN CICULACION");
		}
	}

//los getters y setters

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

	public int getAniosActivo() {
		return aniosActivo;
	}

	public void setAniosActivo(int aniosActivo) {
		this.aniosActivo = aniosActivo;
	}

	@Override
	public String toString() {
		return "Tren [tipo=" + tipo + ", referencia=" + referencia + ", asientosOcupados=" + asientosOcupados
				+ ", aniosActivo=" + aniosActivo + "]";
	}

}
