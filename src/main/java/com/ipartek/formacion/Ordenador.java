package com.ipartek.formacion;

public class Ordenador {

	private int memoriaRam;
	private int almacenamiento;
	private String tarjetaGrafica;
	private String sistemaOperativo;
	private String procesador;
	
	
	public Ordenador() {
		
		this.memoriaRam=524;
		this.almacenamiento=50;
		this.tarjetaGrafica="GDDR5";
		this.sistemaOperativo="Windows";
		this.procesador="Intel Core i3 2,2GHz";
	}
	public Ordenador(int memoriaRam, int almacenamiento, String tarjetaGrafica, String sistemaOperativo,
			String procesador) {
		super();
		this.memoriaRam = memoriaRam;
		this.almacenamiento = almacenamiento;
		this.tarjetaGrafica = tarjetaGrafica;
		this.sistemaOperativo = sistemaOperativo;
		this.procesador = procesador;
	}


	public int getMemoriaRam() {
		return memoriaRam;
	}


	public void setMemoriaRam(int memoriaRam) {
		this.memoriaRam = memoriaRam;
	}


	public int getAlmacenamiento() {
		return almacenamiento;
	}


	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}


	public String getTarjetaGrafica() {
		return tarjetaGrafica;
	}


	public void setTarjetaGrafica(String tarjetaGrafica) {
		this.tarjetaGrafica = tarjetaGrafica;
	}


	public String getSistemaOperativo() {
		return sistemaOperativo;
	}


	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}


	public String getProcesador() {
		return procesador;
	}


	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}


	@Override
	public String toString() {
		return "Ordenador [memoriaRam=" + memoriaRam + ", almacenamiento=" + almacenamiento + ", tarjetaGrafica="
				+ tarjetaGrafica + ", sistemaOperativo=" + sistemaOperativo + ", procesador=" + procesador + "]";
	}
	
	
	
	
	
	
}
