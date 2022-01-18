import java.util.*;

import javax.swing.JOptionPane;

public class SistemaCatedras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Catedra> listCatedras = new ArrayList<Catedra>();
		List<Alumno> listAlumnos = new ArrayList<Alumno>();
		Random nroAleatorio = new Random();
		int dni;
		String apellido;
		String nombre;
		Alumno alumno;
		int cantCatedras = 0;

		// Genera los alumnos y los carga a la lista:
		for (int i = 0; i < 40; i++) {
			nombre = "nombre" + nroAleatorio.nextInt(10);
			apellido = "apellido" + nroAleatorio.nextInt(10);
			dni = (44000000) + nroAleatorio.nextInt(100);
			alumno = new Alumno(dni, nombre, apellido);
			listAlumnos.add(alumno);
		}

		// Muestra los alumnos:
		for (Alumno alu : listAlumnos) {
			System.out.println(alu.toString());
		}

		// Genera y carga las catedras:
		for (int i = 0; i < 4; i++) {

			switch (i) {
			case 0: {
				Catedra nuevaCatedra = new Catedra(cantCatedras + 1, "Programaci�n I");
				cantCatedras++;
				for (int j = 0; j < 10; j++) {
					ArrayList<Alumno> alumnosProgramacionI = new ArrayList<Alumno>();
					alumnosProgramacionI.add(listAlumnos.get(j));
					nuevaCatedra.setListAlumnosCatedra(alumnosProgramacionI);
				}
				listCatedras.add(nuevaCatedra);
				break;
			}
			case 1: {
				Catedra nuevaCatedra = new Catedra(cantCatedras + 1, "Laboratorio I");
				cantCatedras++;
				for (int j = 0; j < 10; j++) {
					ArrayList<Alumno> alumnosLabI = new ArrayList<Alumno>();
					alumnosLabI.add(listAlumnos.get(j + 10));
					nuevaCatedra.setListAlumnosCatedra(alumnosLabI);
				}
				listCatedras.add(nuevaCatedra);
				break;
			}
			case 2: {
				Catedra nuevaCatedra = new Catedra(cantCatedras + 1, "Contabilidad I");
				cantCatedras++;
				for (int j = 0; j < 10; j++) {
					ArrayList<Alumno> alumnosContI = new ArrayList<Alumno>();
					alumnosContI.add(listAlumnos.get(j + 20));
					nuevaCatedra.setListAlumnosCatedra(alumnosContI);
				}
				listCatedras.add(nuevaCatedra);
				break;
			}
			case 3: {
				Catedra nuevaCatedra = new Catedra(cantCatedras + 1, "Metodolog�a de la Investigaci�n");
				cantCatedras++;
				for (int j = 0; j < 10; j++) {
					ArrayList<Alumno> alumnosMetInv = new ArrayList<Alumno>();
					alumnosMetInv.add(listAlumnos.get(j + 30));
					nuevaCatedra.setListAlumnosCatedra(alumnosMetInv);
				}
				listCatedras.add(nuevaCatedra);
				break;
			}

			}
		}
		int opcion = 0;

		while (opcion != 4) {
			String seleccion = JOptionPane.showInputDialog(
					"Men�:\n1. Agregar c�tedra.\n2. Mostrar la lista de c�tedras.\n3. Ordenar y mostrar.\n4. Salir.");
			opcion = Integer.parseInt(seleccion);

			switch (opcion) {
			case 1: {
				String cat = JOptionPane.showInputDialog("Ingrese el nombre de la c�tedra a agregar: ");
				String aul = JOptionPane.showInputDialog("Ingrese el aula donde se dictar� la catedra: " + cat);
				int numAul = Integer.parseInt(aul);
				Catedra unaCatedra = new Catedra(numAul, cat);
				if (listCatedras.add(unaCatedra)) {
					System.out.println("La c�tedra: " + cat + " se agreg� correctamente al listado.");
				}
				break;
			}
			case 2: {
				System.out.println("Listado de c�tedras: ");
				for (Catedra muestraCat : listCatedras) {
					System.out.println(muestraCat.toString());
				}
				break;
			}
			case 3: {
				String sel = JOptionPane.showInputDialog(
						"Seleccione criterio de ordenamiento:\n1. Por nombre de c�tedra.\n2. Por n�mero de aula.");
				int op = Integer.parseInt(sel);
				if (op == 1) {
					Collections.sort(listCatedras);
					System.out.println("Criterio de orden: Nombre de c�tedra.");
					for (Catedra ordCat : listCatedras) {
						System.out.println(ordCat.toString());
					}
				} else if (op == 2) {
					Collections.sort(listCatedras, new AulaComparator());
					System.out.println("Criterio de orden: N�mero de aula.");
					for (Catedra ordAul : listCatedras) {
						System.out.println(ordAul.toString());
					}
					
				} else {
					System.out.println("Opci�n inv�lida.");
				}
			}
				break;
			}
		}
	}
}
