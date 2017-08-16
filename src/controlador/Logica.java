package controlador;

import modelo.Alumno;
import util.DataBase;

public class Logica implements Operaciones {

	DataBase db = null;
	Alumno[] todos;
	Alumno encontrado = null;

	@Override
	public Alumno BuscarPor(String nombre) {
		// TODO Auto-generated method stub

		for (int i = 0; i < todos.length; i++) {

			if (nombre.equalsIgnoreCase(todos[i].getNombre())) {

				encontrado = todos[i];
			}
		}

		return encontrado;
	}

	@Override
	public Alumno BuscarPor(int matricula) {
		// TODO Auto-generated method stub

		for (int i = 0; i < todos.length; i++) {

			if (matricula == (todos[i].getMatricula())) {

				encontrado = todos[i];
			}
		}

		return encontrado;

	}

	public Logica() {

		db = new DataBase();

		todos = db.getAlumnos();

	}

}
