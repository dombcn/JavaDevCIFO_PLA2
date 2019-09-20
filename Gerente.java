package clases.cifo.com;

public class Gerente  extends Empleado {
	
	private String departamento;
	private int dietas;

	public Gerente(String n, String d) {
		super(n, d);
		departamento = "";
		dietas = 0;
	}
	
	public void setDepartamento(String d) {
		departamento = d;
	}
	
	public boolean setDietas(int d) {
		if(d < 0) return false;
		else {
			dietas = d;
			return true;
		}
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public int getDietas() {
		return dietas;
	}
	
	public double sueldoNeto() {
		return super.sueldoNeto() + dietas;
	}
	
	public void muestra() {
		System.out.println("Nombre: "+getNombre());
		System.out.println("DNI: "+getDNI());
		System.out.println("Sueldo: "+getSueldo());
		System.out.println("Sueldo Neto: "+sueldoNeto());
		System.out.println("Departamento: "+departamento);
	}
}
