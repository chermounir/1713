import java.text.DecimalFormat;

import com.ipartek.formacion.Employee;
import com.ipartek.formacion.Perro;
import com.ipartek.formacion.PerroException;
import com.ipartek.formacion.PerroPresa;
import com.ipartek.formacion.Person;
import com.ipartek.formacion.PersonException;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String nombre ="Ander";
		 * 
		 * System.out.println("Hello " + nombre);
		 * 
		 * Person p1= new Person(); //p1.nombre="Annder"; p1.setNombre(nombre);
		 * //System.out.println(p1.saludar());
		 * 
		 * System.out.println(p1.toString());
		 */
		/*
		 * Perro perro1 = new Perro();
		 * 
		 * perro1.setNombre("Daimon"); perro1.setRaza("Bulldog"); perro1.setEdad(-1);
		 * perro1.setVacunado(true);
		 * 
		 * System.out.println(perro1.toString());
		 * 
		 * PerroPresa buba = new PerroPresa();
		 * 
		 * buba.setNombre("Buba"); buba.atacar();
		 */
		// Person person1= new Person("David", 30, 1.70f, 70.5f, "Marrones", 'i');
		Person person1 = new Person("rosa", 18, 'i');

		// System.out.println(person1.toString());

		Employee e1 = new Employee();
		// System.out.println(e1.toString());

		Employee e2 = new Employee("manolo", 33, 'H', 1800.0f);
		// System.out.println(e2.toString());

		// Crear 3 personas famosas de youtube
		Employee y0 = new Employee("Logan Paul", 33, 'H', 14500000f);
		Employee y1 = new Employee("pewDiePie", 33, 'H', 15500000f);
		Employee y2 = new Employee("Jacksepticeye", 33, 'H', 16000000f);
//inicializara arary con 3 posiciones
		Employee[] youtubers = new Employee[3];
		// relleno el array
		youtubers[0] = y0;
		youtubers[1] = y1;
		youtubers[2] = y2;

		DecimalFormat dc = new DecimalFormat("##,###,### $");
		try {
			for (int i = 0; i < 5; i++) {
				// System.out.println(youtubers[i]);
				// numero nombre salario

				System.out.println((i + 1) + " " + youtubers[i].getNombre() + " " + youtubers[i].getSalario());
			}
		} catch (Exception e) {
			System.out.println(PersonException.ERROR_ARRAY);
			// e.printStackTrace();
		}

		// foreach
		/*
		 * for(Employee empleado :youtubers) { System.out.println(empleado); }
		 */

	}
}
