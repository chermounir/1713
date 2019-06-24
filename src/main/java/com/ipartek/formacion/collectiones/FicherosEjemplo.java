package com.ipartek.formacion.collectiones;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.ipartek.formacion.Person;

public class FicherosEjemplo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		String ficheroNombrePersonas = "C:\\1713\\eclipse-workspace\\1713\\personas.txt";
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ficheroNombrePersonas));
		oos.writeObject(new Person("MAnolito"));
		oos.flush();

		// leer objeto del fichero
		// @see http://www.chuidiang.org/java/ficheros/ObjetosFichero.php

		try
        {
            // Se crea un ObjectInputStream
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(ficheroNombrePersonas));
            // Se lee el primer objeto
            Object aux = ois.readObject();
      
            // Mientras haya objetos
            while (aux!=null)
            {
                if (aux instanceof Person)
                    System.out.println(aux);
                aux = ois.readObject();
            }
            ois.close();
        }
        catch (EOFException e1)
        {
            System.out.println ("Fin de fichero");
        }
        catch (Exception e2)
        {
            e2.printStackTrace();
        }

		/////
		//String lineaSimulada = "1;Manolo;12;verdes;mucho";

		//String[] campos = lineaSimulada.split(";");

		//System.out.println("Fichero guardado");

		System.out.println("Ejercicio Ficheros");
		String ficheroNombre = "C:\\1713\\eclipse-workspace\\1713\\ejemplo.txt";

		try (Scanner sc = new Scanner(System.in);
				FileWriter fw = new FileWriter(ficheroNombre);
				BufferedWriter bf = new BufferedWriter(fw);
				) {

			System.out.println("Escribe algo");
			String linea1 = sc.nextLine();
			System.out.println("Escribe algo mas por favor");
			String linea2 = sc.nextLine();

			bf.write(linea1);
			bf.newLine();
			bf.write(linea2);
			// TODO mirar para no resetear
		
 
	         
		}
		
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(ficheroNombre))){
			
			
			
			String linea;   
	           while ((linea = br.readLine()) != null) {   
	               System.out.println(linea);  
	           } 


			System.out.println("Terminamos de leer");
			
		}
		
		   
		
		

	}

}