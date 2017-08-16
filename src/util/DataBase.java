package util;

import modelo.Alumno;
import modelo.Anio;
import modelo.Curso;

public class DataBase {

	private Alumno[] alumnos = new Alumno[5];
	
	private Curso ekis = null;
	
	private Anio este = null;
	
	public DataBase() {
		
		Curso ekis = new Curso();
		
		Anio este = new Anio();
		
		ekis.setNombre("Codo a Codo");
		
		este.setFecha("06-07-2017");
		
		Alumno Axell = new Alumno();
		Axell.setNombre("Axell");
		Axell.setMatricula(100110);
		Axell.setEdad(27);
		Axell.setAnio(este);
		Axell.setCurso(ekis);
		
		alumnos[0] = Axell;
				
		Alumno Joseph = new Alumno();
		Joseph.setNombre("Joseph");
		Joseph.setMatricula(200220);
		Joseph.setEdad(27);
		Joseph.setAnio(este);
		Joseph.setCurso(ekis);
		
		alumnos[1] = Joseph;
		
		Alumno Tatiana = new Alumno();
		Tatiana.setNombre("Tatiana");
		Tatiana.setMatricula(300330);
		Tatiana.setEdad(27);
		Tatiana.setAnio(este);
		Tatiana.setCurso(ekis);
		
		alumnos[2] = Tatiana;
		
		Alumno Agustin = new Alumno();
		Agustin.setNombre("Agustin");
		Agustin.setMatricula(400440);
		Agustin.setEdad(27);
		Agustin.setAnio(este);
		Agustin.setCurso(ekis);
		
		alumnos[3] = Agustin;
		
		Alumno Alexis = new Alumno();
		Alexis.setNombre("Alexis");
		Alexis.setMatricula(500550);
		Alexis.setEdad(27);
		Alexis.setAnio(este);
		Alexis.setCurso(ekis);
		
		alumnos[4] = Alexis;
		
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}
	
	
	
}
