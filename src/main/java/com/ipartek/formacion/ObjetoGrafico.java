package com.ipartek.formacion;

public abstract class ObjetoGrafico {

	public void mover(int x, int y) {
		System.out.println("movemos el objeto a su nueva posicion");
	}
	
	public abstract void dibujar(String color);
}
