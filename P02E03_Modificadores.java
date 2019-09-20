//En los tres primeros ejercicios del PLA2 he puesto en el mismo fichero 
//la clase Empleado junto con una clase con main para probarla

class Empleado {
	private String nombre;
	private String dni;
	private double sueldo;
	
	Empleado(String n, String d) {
		nombre = n;
		dni = d;
		// check DNI (sólo comprueba la longitud, pero se 
		// podria comprobar tambien el formato de DNI o NIF)
		// si incorrecto el DNI queda vacío
		if(d.length()!=9) dni = "";
		else dni = d;
		sueldo = 0.0;
	}
	
	void setNombre(String n) {
		nombre = n;
	}
	
	boolean setDNI(String d) {
		// check DNI
		if(d.length()!=9) return false; // no modifica el DNI
		else {
			// aquí se podria comprobar que sea un DNI o NIF correcto
			dni = d;
			return true;
		}
	}
	
	boolean setSueldo(double s) {
		if(s < 0) return false;
		else {
			sueldo = s;
			return true;
		}
	}
	
	String getNombre() {
		return nombre;
	}
	
	String getDNI() {
		return dni;
	}
	
	double getSueldo() {
		return sueldo;
	}
	
	private double getIRPF() {
		if(sueldo < 3000) return 0.85;
		else return 0.75;
	}
	
	double sueldoNeto() {
		return sueldo*getIRPF();
	}
}

public class P02E03_Modificadores {

	public static void main(String[] args) {
		// Ejemplo uso clase Empleado
		boolean ok; // para verificar datos correctos
		
		Empleado emp1 = new Empleado("Josep Costa", "36136136P");
		emp1.setNombre(emp1.getNombre().concat(" Planella"));
		ok = emp1.setSueldo(-1305.50); // da error porque el sueldo no puede ser negativo
		if(!ok) {
			ok = emp1.setSueldo(1305.50); // este sí es correcto
		}
		
		Empleado emp2 = new Empleado("Manuel Fernández", "xxxx"); // DNI incorrecto
		if(emp2.getDNI().length() == 0) {
			ok = emp2.setDNI("3843543C"); // DNI incorrecto
			if(!ok) {
				ok = emp2.setDNI("38435435C"); // correcto
			}
		}
		ok = emp2.setSueldo(3105.00); // correcto
		
		System.out.println("EMPLEADOS\n");
		System.out.println("Nombre: "+emp1.getNombre());
		System.out.println("DNI: "+emp1.getDNI());
		System.out.println("Sueldo: "+emp1.getSueldo());
		System.out.println("Sueldo Neto: "+emp1.sueldoNeto());
		System.out.println("------------------------------\n");
		
		System.out.println("Nombre: "+emp2.getNombre());
		System.out.println("DNI: "+emp2.getDNI());
		System.out.println("Sueldo: "+emp2.getSueldo());
		System.out.println("Sueldo Neto: "+emp2.sueldoNeto());
		System.out.println("------------------------------\n");
	}

}

