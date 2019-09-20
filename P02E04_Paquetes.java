import clases.cifo.com.*;

public class P02E04_Paquetes {

	public static void main(String[] args) {
		// Prueba Package: clases.cifo.com Class: Empleado
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
		
		// muestra los datos de un empleado usando los métodos get
		System.out.println("EMPLEADOS\n");
		System.out.println("Nombre: "+emp1.getNombre());
		System.out.println("DNI: "+emp1.getDNI());
		System.out.println("Sueldo: "+emp1.getSueldo());
		System.out.println("Sueldo Neto: "+emp1.sueldoNeto());
		System.out.println("------------------------------\n");
		
		// muestra los datos de un empleado usando el método muestraEmpleado
		emp2.muestra();
		System.out.println("------------------------------\n");
	}

}
