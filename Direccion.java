package clases.cifo.com;

public class Direccion  extends Empleado {
	
	private int stockOptions;

	public Direccion(String n, String d) {
		super(n, d);
		stockOptions = 0;
	}
	
	public boolean setStockOptions(int so) {
		if(so < 0) return false;
		else {
			stockOptions = so;
			return true;
		}
	}
	
	public int getStockOptions() {
		return stockOptions;
	}
	
	public double sueldoNeto() {
		return super.sueldoNeto() + stockOptions*0.1;
	}
	
	public void muestra() {
		System.out.println("Nombre: "+getNombre());
		System.out.println("DNI: "+getDNI());
		System.out.println("Sueldo: "+getSueldo());
		System.out.println("Stock Options: "+stockOptions);
		System.out.println("Sueldo Neto: "+sueldoNeto());
	}
}