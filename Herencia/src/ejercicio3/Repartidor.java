package ejercicio3;

public class Repartidor extends Empleado {

	
	private String Zona;

	
	public Repartidor(String zona) {
		super();
		Zona = zona;
	}


	public String getZona() {
		return Zona;
	}


	public void setZona(String zona) {
		Zona = zona;
	}


	@Override
	public String toString() {
		return  super.toString() + "Puesto = Repartidor \nZona--> "+ Zona ;
	}
	
	
	public double CalcularSalarioPlus() {
		
		if(Edad<25 && Zona.equals("Zona 3")) {
	Salario= getSalario()+Plus;
	
		}
		
		return Salario;
		
	}
	
	
	
	
}
