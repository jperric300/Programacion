package ejercicios;

public class Empleado {

	private int Nif;
	private String Nombre;
	private int SueldoBase;
	private int horasExtras;
	private int tipoIrpf;
	private String casadoOsoltero;
	private int nHijos;
	private int importHextra;

	





	public Empleado() {
		this.Nif = Nif;
	}

	
	
	
	


	public int getNif() {
		return Nif;
	}






	public void setNif(int nif) {
		Nif = nif;
	}






	public String getNombre() {
		return Nombre;
	}






	public void setNombre(String nombre) {
		Nombre = nombre;
	}






	public int getSueldoBase() {
		return SueldoBase;
	}






	public void setSueldoBase(int sueldoBase) {
		SueldoBase = sueldoBase;
	}






	public int getHorasExtras() {
		return horasExtras;
	}






	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}






	public int getTipoIrpf() {
		return tipoIrpf;
	}






	public void setTipoIrpf(int tipoIrpf) {
		this.tipoIrpf = tipoIrpf;
	}






	public String getCasadoOsoltero() {
		return casadoOsoltero;
	}






	public void setCasadoOsoltero(String casadoOsoltero) {
		this.casadoOsoltero = casadoOsoltero;
	}






	public int getnHijos() {
		return nHijos;
	}






	public void setnHijos(int nHijos) {
		this.nHijos = nHijos;
	}






	public int getImportHextra() {
		return importHextra;
	}






	public void setImportHextra(int importHextra) {
		this.importHextra = importHextra;
	}





	

	// Metodo complemento horas extras

	private int complementoHExtra() {
		int complemento = 0;
		complemento = horasExtras * importHextra;
		return complemento;
	}

	// Método para calcular el sueldo bruto

	private int sueldoBruto() {
		int sueldobruto = 0;
		
		sueldobruto= SueldoBase + complementoHExtra();
		return sueldobruto;

	}

//Metodos Retenciones

	private int retenciones() {
		int retenciones = tipoIrpf;

		if(casadoOsoltero=="casado") {
		retenciones=retenciones-2;
		}
		
		if(nHijos>0) {
			retenciones=retenciones-nHijos;
			
		}
		return retenciones;
		
	}







	@Override
	public String toString() {
		return "Empleado [Nif=" + Nif + ", Nombre=" + Nombre + ", SueldoBase=" + SueldoBase + ", horasExtras="
				+ horasExtras + ", tipoIrpf=" + tipoIrpf + ", casadoOsoltero=" + casadoOsoltero + ", nHijos=" + nHijos
				+ "]";
	}

	
	
	
	
	
}
