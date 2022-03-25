package EjerciciosAyuda;

public class Vehiculo {
//	private String marca;
	//private String modelo;
	//private double precio;
	
	public vehiculo(String maarca, String moodelo, double prrecio) {
		super();
		this.marca = maarca;
		this.modelo = moodelo;
		this.precio = prrecio;
	}

	//Metodo para obtener Precio
	public double getPrecio() {
		return precio;
	}

	//Metodo para mostrar datos
	public String mostrarDatos() {
		return "Marca: "+marca+"\nModelo; "+modelo+"\nprecio: "+precio+"\n";
	}
	
	
	
	
	
	
	
	
	
	
}

