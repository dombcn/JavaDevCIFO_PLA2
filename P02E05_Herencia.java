import clases.cifo.com.*;

public class P02E05_Herencia {

	public static void main(String[] args) {
		// Prueba Package: clases.cifo.com Classes: Administracion, Gerente, Direccion
		boolean ok; // para verificar datos correctos
		
		// Ejemplo Administracion
		Administracion adm = new Administracion("Josep Costa", "36136136P");
		adm.setSeccion("RRHH");
		adm.setSueldo(1650.00);
		System.out.println("ADMINISTRACION");
		adm.muestra();
		System.out.println("------------------------------\n");
		
		// Ejemplo Gerente
		Gerente ger = new Gerente("Manuel Fernández", "38435435C");
		ger.setDepartamento("Marketing");
		ok = ger.setSueldo(3033.50); // con ok se podria comprobar que es correcto
		ok = ger.setDietas(500);
		System.out.println("GERENTE");
		ger.muestra();
		System.out.println("------------------------------\n");
		
		// Ejemplo Direccion
		Direccion dir = new Direccion("Enrique Blanco", "36754891V");
		ok = dir.setSueldo(3305.00); // con ok se podria comprobar que es correcto
		ok = dir.setStockOptions(10000);
		System.out.println("DIRECCION");
		dir.muestra();
		System.out.println("------------------------------\n");
		
		// Ejemplo otro Empleado
		Empleado emp = new Empleado("Jordi Jou", "38720492S");
		ok = emp.setSueldo(1405.00); // con ok se podria comprobar que es correcto
		emp.muestra();
		System.out.println("------------------------------\n");
	}

}

