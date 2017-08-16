import controlador.Logica;
import modelo.Alumno;
import vista.Pantalla;

public class Application {

	public static void main(String[] args) {
		
		Logica controlador = new Logica();
		
		Pantalla vista = new Pantalla();
		
		String valor = vista.ingresarValor("Buscar Alumno");
		
		Alumno obj = controlador.BuscarPor(valor);
		
		vista.mostrarMensaje(obj.getNombre());
		
		
	}
	
}
