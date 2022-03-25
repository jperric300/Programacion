package ejercicio2;

import java.util.Scanner;

public class Principal {

	// Creamos array de poligono
	static Poligono[] Poligonos = new Poligono[10];

	// Creamos un indice
	static int indice = 0;

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		LlenarPoligono();
		mostrarResultados();
	}

	public static void LlenarPoligono() {
		int opcion = 0;

		do {
			System.out.println();
			System.out.println("Digite que poligono desea");
			System.out.println("1º triangulo");
			System.out.println("2º rectangulo");
			System.out.println("0º salir");
			System.out.println("Opcion: ");
			opcion = entrada.nextInt();

			switch (opcion) {
			case 1:
				llenarTriangulo();
				break;

			case 2:
				llenarRectangulo();
				break;
			case 0:
				System.out.println("Saliendo del programa");
				System.out.println();
				break;
			default:
				System.out.println("La opcion no es correcta");
				break;
			}
		} while (opcion != 0);

	}

	public static void llenarTriangulo() {
		double lado1, lado2, lado3;

		System.out.println("\nDigite el lado1 del triangulo: ");
		lado1 = entrada.nextDouble();

		System.out.println("\nDigite el lado2 del triangulo: ");
		lado2 = entrada.nextDouble();

		System.out.println("\nDigite el lado3 del triangulo: ");
		lado3 = entrada.nextDouble();

		Poligonos[indice] = new Triangulo(lado1, lado2, lado3);
		indice++;

	}

	public static void llenarRectangulo() {

		double lado1, lado2;
		System.out.println("\nDigite el lado1 del rectangulo: ");
		lado1 = entrada.nextDouble();

		System.out.println("\nDigite el lado2 del rectangulo: ");
		lado2 = entrada.nextDouble();

		Poligonos[indice] = new Rectangulo(lado1, lado2);
		indice++;

	}

	public static void mostrarResultados() {

		for(int i=0;i<indice;i++) {
			System.out.println(Poligonos[i]);
		}

	}
}
