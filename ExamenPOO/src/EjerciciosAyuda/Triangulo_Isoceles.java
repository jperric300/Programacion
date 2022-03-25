package EjerciciosAyuda;

//Ejercicio 5: Dise�ar un programa para trabajar con tri�ngulos
//is�sceles. Para ello defina los atributos necesarios que se
//requieren, proporcione m�todos de consulta, un m�todo constructor
//e implemente m�todos para calcular el per�metro y el �rea de un
//tri�ngulo, adem�s implementar un m�todo que a partir de un arrive
//de tri�ngulos devuelva el �rea del tri�ngulo de mayor superficie.

public class Triangulo_Isoceles {
	//Atributos necesarios
	private double base;
	private double lado;
	
	//Metodo constructor
	public Triangulo_Isoceles(double base, double lado) {
		super();
		this.base = base;
		this.lado = lado;
	}
	
	//Metodo perimetro
	public double obtenerPerimetro() {
		double perimetro= lado*2+base;
		return perimetro;
	}
	
	//Metodo area
	public double obtenerArea() {
		//Math.sqrt es igual a raiz cuadrada
	double area= (base*Math.sqrt((lado*lado)-((base*base)/4)))/2;
	return area;
	}
	
	
	//Metodo mostrar datos
	public String MostrarDatos() {
		
		return "Base: "+base +"\nLado: "+lado +"\nPerimetro: "+obtenerPerimetro()
				+"\nArea: "+obtenerArea()+"\n";
	}
	
	
	
}


