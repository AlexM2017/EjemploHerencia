package controlador;

import modelo.Alumno;

public interface Operaciones {
	
	public Alumno BuscarPor (String nombre);
	
	public Alumno BuscarPor (int matricula);

}
