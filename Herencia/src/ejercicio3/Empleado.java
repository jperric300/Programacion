package ejercicio3;

public abstract class Empleado {
protected String Nombre;
protected int Edad;
protected double Salario;
protected final int Plus=300;


public Empleado() {
	super();
}


public Empleado(String nombre, int edad, double salario) {
	super();
	Nombre = nombre;
	Edad = edad;
	Salario = salario;
}


public String getNombre() {
	return Nombre;
}


public void setNombre(String nombre) {
	Nombre = nombre;
}


public int getEdad() {
	return Edad;
}


public void setEdad(int edad) {
	Edad = edad;
}


public double getSalario() {
	return Salario;
}


public void setSalario(double salario) {
	Salario = salario;
}


public int getPlus() {
	return Plus;
}


@Override
public String toString() {
	return "Empleado--> " + Nombre + "\nEdad--> " + Edad + "\nSalario--> " + Salario + "Plus--> " + Plus;
}








}


