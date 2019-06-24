package com.ipartek.formacion;

public class OrdenadorPortatil extends Ordenador{
	private int pantalla; 
	private int bateria;
	
	
	public OrdenadorPortatil() {
		super();
		this.pantalla=11; 
		this.bateria=5;
	}


	public OrdenadorPortatil(int memoriaRam, int almacenamiento, String tarjetaGrafica, String sistemaOperativo,
			String procesador) {
		super(memoriaRam, almacenamiento, tarjetaGrafica, sistemaOperativo, procesador);
		this.pantalla = pantalla;
		this.bateria = bateria;
	}


	public OrdenadorPortatil(int memoriaRam, int almacenamiento, String tarjetaGrafica, String sistemaOperativo,
			String procesador, int pantalla, int bateria) {
		super(memoriaRam, almacenamiento, tarjetaGrafica, sistemaOperativo, procesador);
		this.pantalla = pantalla;
		this.bateria = bateria;
	}


	public int getPantalla() {
		return pantalla;
	}


	public void setPantalla(int pantalla) {
		this.pantalla = pantalla;
	}


	public int getBateria() {
		return bateria;
	}


	public void setBateria(int bateria) {
		this.bateria = bateria;
	}


	@Override
	public String toString() {
		return "Portatil [pantalla=" + pantalla + ", bateria=" + bateria + "]";
	}



	
	
	
}
