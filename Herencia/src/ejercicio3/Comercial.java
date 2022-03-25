package ejercicio3;

public class Comercial extends Empleado{

	private double Comision;

	public Comercial(double comision) {
		super();
		Comision = comision;
	}

	public double getComision() {
		return Comision;
	}

	public void setComision(double comision) {
		Comision = comision;
	}
	
	
	@Override
	public String toString() {
		return  super.toString() + "Puesto = Comercial \nComisión--> "+ Comision;
	}

	
	public double CalcularSalarioPlus() {
		
		if(Edad>30 && Comision>200) {
	Salario= getSalario()+Plus;
	
		}
		
		return Salario;
		
	}
	
	
}
