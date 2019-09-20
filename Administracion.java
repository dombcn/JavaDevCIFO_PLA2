package clases.cifo.com;

public class Administracion extends Empleado {
	
	private String Seccion; 

	public Administracion(String n, String d) {
		super(n, d);
		Seccion = "";
	}
	
	public void setSeccion(String s) {
		Seccion = s;
	}
	
	public String getSeccion() {
		return Seccion;
	}
	
	public void muestra() {
		super.muestra();
		System.out.println("Seccion: "+Seccion);
	}
}
