package Pruebas;

public class Pruebasfunciones9 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {

			if (Funciones.funciones.esprimo(i)) {
				System.out.println(i);
			}
		}
	}
}
