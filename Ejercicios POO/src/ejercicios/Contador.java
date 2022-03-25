package ejercicios;

public class Contador {

	private int cont;

	// Constructor sin parámentros
	public Contador() {
		super();
		this.cont = cont;
	}

	// Constructor con parámentros
	public Contador(int cont) {
		super();
		this.cont = cont;
		if (cont < 0)

		{
			cont = 0;
		}
	}
	

	// constructor copia

	public Contador(Contador c)

	{
		this.cont = c.cont;
	}

	// getter y setter
	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	// INCREMENTO

	public void incremento() {

		cont = cont + 1;
	}

	
	// DECREMENTO

	public void decremento() {
		cont = cont - 1;
		if (cont < 0) {
			cont = 0;
		}
	}

}
