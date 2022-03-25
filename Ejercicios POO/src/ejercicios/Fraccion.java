package ejercicios;

public class Fraccion {

	private int num;
	private int den;

	public Fraccion() {
		super();
	}

	public Fraccion(int num, int den) {
		super();
		this.num = num;
		this.den = den;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDen() {
		return den;
	}

	public void setDen(int den) {
		this.den = den;
	}

	

	// METODO SUMAR

	public Fraccion sumar(Fraccion f) {

		Fraccion aux = new Fraccion();

		aux.num = num * f.den + den + f.num;
		aux.den = den * f.den;
		
		aux.simplificar();
		return aux;

	}

	// METODO RESTAR

	public Fraccion restar(Fraccion f) {

		Fraccion aux = new Fraccion();

		aux.num = num * f.den - den * f.num;
		aux.den = den * f.den;
		aux.simplificar();
		
		return aux;

	}

	// METODO MULTIPLICAR

	public Fraccion multiplicar(Fraccion f) {

		Fraccion aux = new Fraccion();

		aux.num = num * f.num;
		aux.den = den * f.den;
		aux.simplificar();
		return aux;

	}

	// METODO DIVIDIR

	public Fraccion dividir(Fraccion f) {

		Fraccion aux = new Fraccion();

		aux.num = num * f.den;
		aux.den = den * f.num;
		aux.simplificar();
		return aux;

	}

	// METODO MCD

	private int mcd() {
		int u = Math.abs(num);
		int v = Math.abs(den);
		if (v == 0) {
			return u;
		}

		int r;
		while (v != 0) {
			r = u % v;
			u = v;
			v = r;
		}

		return u;

	}

	// METODO SIMPLIFICAR

	private void simplificar() {

		int numerito = mcd();
		this.num = num / numerito;
		this.den = den / numerito;

	}

	@Override
	public String toString() {
		return  num + "/" + den ;
	}
	
	

}
