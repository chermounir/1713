package com.ipartek.formacion;

public class Youtube {

	public static final int LONGITUD_CODIGO = 11;
	public static final int LONGITUD_MIN_TITULO = 3;
	public static final int LONGITUD_MAX_TITULO = 150;
	public static final String URL = "https://www.youtube.com/watch?v=";

	// propridades
	private String titulo;// minimo 2 letras, maximo 1150
	private String codigo;// exactamente 11
	private int reproducciones;

	// constructores
	public Youtube(String titulo, String codigo) throws Exception {
		super();/*
				 * this.titulo = titulo; this.codigo = codigo;
				 */
		this.setCodigo(codigo);
		this.setTitulo(titulo);
		this.reproducciones = 0;
	}

	// getters y setters
	public String getTitulo() {
		return titulo;
	}

	/**
	 * titulo
	 * 
	 * @param titulo Strin nuevo titulo
	 * @throws Exception si titulo null || >= LONGITUD_MIN_TITULO || <=
	 *                   LONGITUD_MAX_TITULO
	 */
	public void setTitulo(String titulo) throws Exception {

		if (titulo != null && titulo.length() >= LONGITUD_MIN_TITULO && titulo.length() <= LONGITUD_MAX_TITULO) {
			this.titulo = titulo;
		} else {
			String msg = String.format("Titulo debe ser entre %i y %i ", LONGITUD_MIN_TITULO, LONGITUD_MAX_TITULO);
			throw new Exception(msg);
		}

	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) throws Exception {

		if (codigo != null && codigo.length() == LONGITUD_CODIGO) {
			this.codigo = codigo;
		} else {
			throw new Exception("Longitud codigo debe ser " + LONGITUD_CODIGO);
		}

	}

	public int getReproducciones() {
		return reproducciones;
	}

	public void setReproducciones(int reproducciones) {
		this.reproducciones = reproducciones;
	}

	// fuciones

	@Override
	public String toString() {
		return "Youtube [titulo=" + titulo + ", codigo=" + codigo + ", reproducciones=" + reproducciones + "]";
	}

	public String getUrl() {

		return URL + codigo;

	}
}
