package com.ipartek.formacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrdenadorMain {
	private static final int ORDENADORES = 3;

	private static ArrayList<Ordenador> listaOrdenadores = new ArrayList<Ordenador>();

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < ORDENADORES; i++) {

			System.out.println("introduce  la memoria RAM: ");
			int memoriaRam = Integer.parseInt(sc.nextLine());

			System.out.println("introduce  el Almacenamiento: ");
			int almacenamiento = Integer.parseInt(sc.nextLine());

			System.out.println("introduce  la Tarjeta Grafica: ");
			String tarjetaGrafica = sc.nextLine();

			System.out.println("introduce  el Sistema Operativo: ");
			String sistemaOperativo = sc.nextLine();

			System.out.println("introduce  el Procesador: ");
			String procesador = sc.nextLine();

			System.out.println("introduce  el Pantalla: ");
			int intpantalla = Integer.parseInt(sc.nextLine());

			System.out.println("introduce  la Bateria enter el 0 y 100: ");
			int bateria = Integer.parseInt(sc.nextLine());
			boolean bool = true;
			while (bool) {

				if (bateria < 0 || bateria > 100) {
					System.out.println("introduce  la Bateria enter el 0 y 100: ");
					bateria = Integer.parseInt(sc.nextLine());
					bool = true;
				}else {
					bool = false;
				}
			}

			if (bateria < 20) {
				throw new Exception("excepcion 20 %");

			}

			listaOrdenadores
					.add(new Ordenador(memoriaRam, almacenamiento, tarjetaGrafica, sistemaOperativo, procesador));
			listaOrdenadores.add(
					new OrdenadorPortatil(memoriaRam, almacenamiento, tarjetaGrafica, sistemaOperativo, procesador));

		}


		listarOrdenadores();
	}

	private static void listarOrdenadores() {
		System.out.printf("%3s %3s %3s %3s %3s %3s %3s \n", "memoriaRam", "almacenamiento", "tarjetaGrafica", "sistemaOperativo", "procesador", "pantalla", "bateria");

		
		for (Ordenador ordenador : listaOrdenadores) {
			if(ordenador instanceof OrdenadorPortatil) {
				System.out.printf("%3s %3s %3s %3s %3s %3s %3s \n", ordenador.getMemoriaRam(), ordenador.getAlmacenamiento(), ordenador.getTarjetaGrafica(), ordenador.getSistemaOperativo(), ordenador.getProcesador(), ((OrdenadorPortatil) ordenador).getPantalla(), ((OrdenadorPortatil) ordenador).getBateria());
			}else {
				System.out.printf("%3s %3s %3s %3s %3s %3s %3s \n", ordenador.getMemoriaRam(), ordenador.getAlmacenamiento(), ordenador.getTarjetaGrafica(), ordenador.getSistemaOperativo(), ordenador.getProcesador(), "-", "-");
			

		}
			
		}
		
	}

}
