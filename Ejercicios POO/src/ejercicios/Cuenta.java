package ejercicios;

public class Cuenta {

	// atributos

	private String nombre;
	private String numero_de_cuenta;
	private double tipo_de_interes;
	private double saldo;

	//constructor sin parametros
	public Cuenta() {
		
	}
	
	//constructor con parametos
	public Cuenta(String nombre, String numero_de_cuenta, double tipo_de_interes, double saldo) {

		this.nombre = nombre;
		this.numero_de_cuenta = numero_de_cuenta;
		this.tipo_de_interes = tipo_de_interes;
		this.saldo = saldo;
	}
	
	//Constructor copia
	public Cuenta(final Cuenta c) {
		this.nombre=c.nombre; 
		this.numero_de_cuenta = c.numero_de_cuenta;
		this.tipo_de_interes = c.tipo_de_interes;
		this.saldo=c.saldo;
	}

	public void mostrardatos() {

		System.out.println("tu nombre es " + nombre);
		System.out.println("tu numero de cuenta es " + numero_de_cuenta);
		System.out.println("tu tipo de interes es " + tipo_de_interes);
		System.out.println("tu saldo es " + saldo);

	}

	// gettes y setes

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getNumero_de_cuenta() {
		return numero_de_cuenta;
	}


	public void setNumero_de_cuenta(String numero_de_cuenta) {
		this.numero_de_cuenta = numero_de_cuenta;
	}


	public double getTipo_de_interes() {
		return tipo_de_interes;
	}


	public void setTipo_de_interes(double tipo_de_interes) {
		this.tipo_de_interes = tipo_de_interes;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	//metodo ingreso 
	
	public boolean ingreso(double ingreso) {
		if(ingreso>0) {
			saldo=saldo+ingreso;
			return true;
		}else {
			return false;
		}
	}
	
	
	//metodo reintegro

	public boolean reintegro(double reintegro) {
	if (saldo>reintegro && reintegro>=0) {
		
		saldo=saldo-reintegro;
		return true;
		
	}else {
		return false;
	}
	}

	// metodo transferencia
	
	
	
	
}
