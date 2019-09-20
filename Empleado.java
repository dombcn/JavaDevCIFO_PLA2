package clases.cifo.com;

public class Empleado {
	private String nombre;
	private String dni;
	private double sueldo;
	
	public Empleado(String n, String d) {
		nombre = n;
		dni = d;
		// check DNI (sólo comprueba la longitud, pero se 
		// podria comprobar tambien el formato de DNI o NIF)
		// si incorrecto el DNI queda vacío
		if(d.length()!=9) dni = "";
		else dni = d;
		sueldo = 0.0;
	}
	
	public void setNombre(String n) {
		nombre = n;
	}
	
	public boolean setDNI(String d) {
		// check DNI
		if(d.length()!=9) return false; // no modifica el DNI
		else {
			// aquí se podria comprobar que sea un DNI o NIF correcto
			dni = d;
			return true;
		}
	}
	
	public boolean setSueldo(double s) {
		if(s < 0) return false;
		else {
			sueldo = s;
			return true;
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDNI() {
		return dni;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	
	private double getIRPF() {
		if(sueldo < 3000) return 0.85;
		else return 0.75;
	}
	
	public double sueldoNeto() {
		return sueldo*getIRPF();
	}
	
	public void muestra() {
		System.out.println("Nombre: "+nombre);
		System.out.println("DNI: "+dni);
		System.out.println("Sueldo: "+sueldo);
		System.out.println("Sueldo Neto: "+sueldoNeto());
	}
}
