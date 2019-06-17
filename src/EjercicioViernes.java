import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class EjercicioViernes {
	public static void main(String[] args) throws Exception {

		System.out.println("--------- ");
		System.out.println("|\t|");
		System.out.println("|\to");
		System.out.println("|\t|");
		System.out.println("|\t|");
		System.out.println("|\t^");
		System.out.println("|");
		System.out.println("------------");

		char[] cadena = { '_', '_', '_', '_', '_', '_', '_' };
		char[] cadenaViernes = { 'v', 'i', 'e', 'r', 'n', 'e', 's' };
		boolean bool = true;
		while (bool) {
			Scanner sc = new Scanner(System.in);

			for (int i = 0; i < cadenaViernes.length; i++) {

				int vidas = 6 - i;

				System.out.println("dime una letra");

				char letraChar = sc.next().charAt(0);
				for (int j = 0; j < cadenaViernes.length; j++) {
					if (letraChar == cadenaViernes[j]) {
						cadena[j] = letraChar;
					}
				}

				System.out.println(Arrays.toString(cadena));
				if (Arrays.equals(cadena, cadenaViernes)) {
					bool = false;

					System.out.println("Bien Hecho");
					break;
				}
				System.out.println("vidas:" + vidas + "/" + cadenaViernes.length);

			}
			if (!Arrays.equals(cadena, cadenaViernes)) {
				System.out.println("*********Fallaste, vuelve a intertarlo otra vez*********");
			}
		}
		
		//cambio del lunes
	}
}
