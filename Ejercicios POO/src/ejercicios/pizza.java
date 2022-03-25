package ejercicios;

public class pizza {

	
	private String tipo;
	private String estado;
	private String tamaño;
	private static int pedidas=0;
	private static int servidas =0;
	


	public pizza(String tipo, String tamaño) {
		this.tipo = tipo;
		this.tamaño = tamaño;
		estado="pedida";
		pedidas++;
	}




	public String getTipo() {
		return tipo;
	}




	public void setTipo(String tipo) {
		this.tipo = tipo;
	}




	public String getTamaño() {
		return tamaño;
	}




	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}




	public static int getPedida() {
		return pedidas;
	}



	public static int getServida() {
		return servidas;
	}





	@Override
	public String toString() {
		return "pizza " + tipo + ", " + estado + ", " + tamaño + "";
	}
	
	
	
	public void sirve() {
		if (estado.equals("pedida")) {
			estado="Servida";
					servidas=servidas+1;
		}else {
			System.out.println("la pizza ha sido servida");
		}
	}
	
}
