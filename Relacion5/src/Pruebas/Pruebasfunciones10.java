package Pruebas;

public class Pruebasfunciones10 {

	public static void main(String[] args) {
		for (int i = 1; i <= 99999; i++) {

			if (Funciones.funciones.capicua(i)) {
				System.out.println(i);
			}
		}
	}

}
