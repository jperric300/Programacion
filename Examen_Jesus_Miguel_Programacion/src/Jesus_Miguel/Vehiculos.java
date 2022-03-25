package Jesus_Miguel;

public class Vehiculos {
private String marca;
private String matricula;
private int nKilometros;
private String Fmatriculación;
private String descripcion;
private Double precio;
private String nombre;
private String DNI;

//Constructor sin parametros
public Vehiculos() {
	super();
}

//constructor con parametros
public Vehiculos(String marca, String matricula, int nKilometros, String Fmatriculación, String descripcion,
		Double precio, String nombre, String DNI) {
	super();
	this.marca = marca;
	this.matricula = matricula;
	this.nKilometros = nKilometros;
	this.Fmatriculación = Fmatriculación;
	this.descripcion = descripcion;
	this.precio = precio;
	this.nombre = nombre;
	this.DNI = DNI;
}

//constructor copia

public Vehiculos(Vehiculos v) {
	super();
	this.marca = v.marca;
	this.matricula = v.matricula;
	this.nKilometros = v.nKilometros;
	this.Fmatriculación = v.Fmatriculación;
	this.descripcion = v.descripcion;
	this.precio = v.precio;
	this.nombre = v.nombre;
	this.DNI = v.DNI;
}


//getter and setter

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getMatricula() {
	return matricula;
}

public void setMatricula(String matricula) {
	this.matricula = matricula;
}

public int getnKilometros() {
	return nKilometros;
}

public void setnKilometros(int nKilometros) {
	this.nKilometros = nKilometros;
}

public String getFmatriculación() {
	return Fmatriculación;
}

public void setFmatriculación(String fmatriculación) {
	Fmatriculación = fmatriculación;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

public Double getPrecio() {
	return precio;
}

public void setPrecio(Double precio) {
	this.precio = precio;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getDNI() {
	return DNI;
}

public void setDNI(String dNI) {
	DNI = dNI;
}

//Metodo Año
public int getAnio() {
	int año=0;
	return año;
}


}
