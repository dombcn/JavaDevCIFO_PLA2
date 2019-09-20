// En los tres primeros ejercicios del PLA2 he puesto en el mismo fichero 
// la clase Empleado junto con una clase con main para probarla

class Empleado {
	String nombre;
	String dni;
	double sueldo;
	
	double sueldoNeto() {
		return sueldo*0.85;
	}
}

public class P02E01_Clases {

	public static void main(String[] args) {
		// Ejemplo uso clase Empleado
		Empleado emp1 = new Empleado();
		emp1.nombre = "Josep Costa";
		emp1.dni = "36136136P";
		emp1.sueldo = 1305.50;
		
		Empleado emp2 = new Empleado();
		emp2.nombre = "Manuel Fernández";
		emp2.dni = "38435435C";
		emp2.sueldo = 3105.00;
		
		System.out.println("EMPLEADOS\n");
		System.out.println("Nombre: "+emp1.nombre);
		System.out.println("DNI: "+emp1.dni);
		System.out.println("Sueldo: "+emp1.sueldo);
		System.out.println("Sueldo Neto: "+emp1.sueldoNeto());
		System.out.println("------------------------------\n");
		
		System.out.println("Nombre: "+emp2.nombre);
		System.out.println("DNI: "+emp2.dni);
		System.out.println("Sueldo: "+emp2.sueldo);
		System.out.println("Sueldo Neto: "+emp2.sueldoNeto());
		System.out.println("------------------------------\n");
	}

}
