package ejercicios;

public class Libro {

	private String Libro;
	private String Autor;
	private int NEjemplares;
	private int EjemplaresPres;

	// Constructor por defecto

	public Libro() {

	}

	// Constructor con parametros
	public Libro(String libro, String autor, int nEjemplares, int ejemplaresPres) {
		super();
		Libro = libro;
		Autor = autor;
		NEjemplares = nEjemplares;
		EjemplaresPres = ejemplaresPres;
	}

//Getter y Setter
	public String getLibro() {
		return Libro;
	}

	public void setLibro(String libro) {
		Libro = libro;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public int getNEjemplares() {
		return NEjemplares;
	}

	public void setNEjemplares(int nEjemplares) {
		NEjemplares = nEjemplares;
	}

	public int getEjemplaresPres() {
		return EjemplaresPres;
	}

	public void setEjemplaresPres(int ejemplaresPres) {
		EjemplaresPres = ejemplaresPres;
	}

	// METODO PRESTAMO

	public boolean prestamo() {
		if (NEjemplares > 0) {
			EjemplaresPres++;
			return true;
		} else {
			System.out.println ("No quedan ejemplares del libro…");
			return false;
			

		}
	}

	// DEVOLUCION

	public boolean devolucion() {
		
		if (NEjemplares < EjemplaresPres) {
			EjemplaresPres=EjemplaresPres-1;
			return true;
		} else {
			return false;

		}
	
	}

	// Tostring

	@Override
	public String toString() {
		return "Libro [Libro=" + Libro + ", Autor=" + Autor + ", NEjemplares=" + NEjemplares + ", EjemplaresPres="
				+ EjemplaresPres + "]";
	}

}
