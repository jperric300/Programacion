package ejercicio2;

public class Poligono {
protected int Nlados;



public Poligono(int nlados) {
	super();
	Nlados = nlados;
}



public Poligono() {
	super();
}



@Override
public String toString() {
	return "tiene " + Nlados + "lados";
}

}


